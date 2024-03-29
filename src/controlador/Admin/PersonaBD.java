package controlador.Admin;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import controlador.Utiles.Utiles;
import controlador.dao.AdaptadorDao;
import modelo.Persona;
import modelo.Usuario;

public class PersonaBD extends AdaptadorDao<Persona> {

    private DynamicList<Persona> personas;
    private Persona persona;

    public PersonaBD() {
        super(Persona.class);
        personas = new DynamicList<>();
    }

    public PersonaBD(DynamicList<Persona> personas, Persona persona, Class clazz) {
        super(clazz);
        this.personas = personas;
        this.persona = persona;
    }

    public DynamicList<Persona> getPersonas() {
        if (personas == null) {
            personas = new DynamicList<>();
        }
        return personas;
    }

    public DynamicList<Persona> getPersonasTodos() {
        personas = all();
        return personas;
    }

    public void setPersonas(DynamicList<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public Boolean persist(Persona obj) {
        obj.setId(all().getLength() + 1);
        return super.persist(obj);
    }

    public Persona autenticarse(String correo, String clave) throws EmptyException {
        DynamicList<Persona> personas = getPersonasTodos(); // Método para obtener la lista de usuarios
        for (int i = 0; i < personas.getLength(); i++) {
            Persona persona = personas.getInfo(i);
            if (persona.getCorreo().equals(correo) && verificarClave(persona.getClave(), clave)) {
                return persona; // Devuelve el rol del usuario autenticado
            }
        }
        return null;
    }

    private boolean verificarClave(String claveAlmacenada, String claveIngresada) {
        return claveAlmacenada.equalsIgnoreCase(claveIngresada);
    }

//    @Override
//    public Integer persist(Persona obj) throws Exception {
//        PreparedStatement consulta = null;
//        try {
//            consulta = conexion.getConnection().prepareStatement("INSERT INTO persona (ID, DNI, NOMBRE, APELLIDO, FECHANACIMIENTO, TELEFONO, ROL) VALUES (?, ?, ?, ?, TO_DATE(?, 'yyyy-MM-dd'), ?, ?)");
//            consulta.setInt(1, all().getLength() + 1);
//            consulta.setString(2, obj.getDni());
//            consulta.setString(3, obj.getNombre());
//            consulta.setString(4, obj.getApellido());
//            consulta.setString(5, obj.getFechaNacimiento().toString());
//            consulta.setString(6, obj.getTelefono());
//            if (obj.getRol().equals(Rol.ESTUDIANTE)) {
//                    consulta.setString(7, Rol.ESTUDIANTE.toString());
//                }else if (obj.getRol().equals(Rol.DOCENTE)){
//                    consulta.setString(7, Rol.DOCENTE.toString());
//                }else{
//                    consulta.setString(7, Rol.ADMINISTRADOR.toString());
//                }
//            consulta.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        
//        return 1;
//    }
    public DynamicList<Persona> buscarLineal(DynamicList<Persona> lista, String campo, String valorBuscado) throws EmptyException {
        DynamicList<Persona> listaOrdenada = ordenarMerge(lista, campo, 0);
        Persona personas[] = listaOrdenada.toArray();
        DynamicList<Persona> listaBusqueda = new DynamicList<>();
        for (int i = 0; i < listaOrdenada.getLength(); i++) {
            Persona persona = personas[i];
            if (persona.compareCampo(campo, valorBuscado) == 0) {
                listaBusqueda.add(persona);
            }
        }
        return listaBusqueda;
    }

    public Persona buscarBinaria(DynamicList<Persona> lista, String campo, String valorBuscado) throws EmptyException {
        DynamicList<Persona> listaOrdenada = ordenarMerge(lista, campo, 0);
        int inicio = 0;
        int fin = listaOrdenada.getLength() - 1;
        Persona personas[] = listaOrdenada.toArray();
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Persona persona = personas[medio];
            int comparacion = persona.compareCampo(campo, valorBuscado);

            if (comparacion == 0) {
                return persona;
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null;
    }
    
    public Persona buscarBinariaUnico(String campo, String valorBuscado) throws EmptyException {
        int inicio = 0;
        DynamicList<Persona> lista = all();
        DynamicList<Persona> listaOrdenada = ordenarMerge(lista, campo, 0);
        int fin = lista.getLength() - 1;
        Persona personas[] = listaOrdenada.toArray();
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Persona persona = personas[medio];
            int comparacion = persona.compareCampo(campo, valorBuscado);
            if (comparacion == 0) {
                return persona;
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null;
    }

    //MergeSort
    public DynamicList<Persona> ordenarMerge(DynamicList<Persona> lista, String field, Integer tipo) throws EmptyException {
        if (lista.getLength() > 1) {
            DynamicList<Persona> izquierda = new DynamicList<>();
            DynamicList<Persona> derecha = new DynamicList<>();
            int mitad = lista.getLength() / 2;
            for (int i = 0; i < mitad; i++) {
                izquierda.add(lista.getInfo(i));
            }
            for (int i = mitad; i < lista.getLength(); i++) {
                derecha.add(lista.getInfo(i));
            }
            izquierda = ordenarMerge(izquierda, field, tipo);
            derecha = ordenarMerge(derecha, field, tipo);
            mezclar(lista, izquierda, derecha, field, tipo);
        }
        return lista;
    }

    private void mezclar(DynamicList<Persona> lista, DynamicList<Persona> list1, DynamicList<Persona> list2, String field, Integer tipo) throws EmptyException {
        int indiceIzq = 0, indiceDer = 0, indiceLista = 0;
        Persona[] izquierda = list1.toArray();
        Persona[] derecha = list2.toArray();
        while (indiceIzq < izquierda.length && indiceDer < derecha.length) {
            if (izquierda[indiceIzq].compare(derecha[indiceDer], field, tipo)) {
                lista.merge(izquierda[indiceIzq], indiceLista);
                indiceIzq += 1;
            } else {
                lista.merge(derecha[indiceDer], indiceLista);
                indiceDer += 1;
            }
            indiceLista += 1;
        }

        while (indiceIzq < izquierda.length) {
            lista.merge(izquierda[indiceIzq], indiceLista);
            indiceIzq += 1;
            indiceLista += 1;
        }

        while (indiceDer < derecha.length) {
            lista.merge(derecha[indiceDer], indiceLista);
            indiceDer += 1;
            indiceLista += 1;
        }
    }

//    public static void main(String[] args) throws Exception {
//        PersonaArchivos pa = new PersonaArchivos();
//        pa.getPersona().setApellido("Guachizaca");
//        pa.getPersona().setDni("1150357679");
//        pa.getPersona().setFechaNacimiento(new Date(24, 9, 18).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
//        System.out.println(pa.getPersona().getFechaNacimiento());
//        pa.getPersona().setNombre("Santiago");
//        pa.getPersona().setRol(Rol.ESTUDIANTE);
//        pa.getPersona().setTelefono("0980170669");
//        pa.persist(pa.getPersona());
//    }
}
