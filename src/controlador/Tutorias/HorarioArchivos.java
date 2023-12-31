package controlador.Tutorias;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import controlador.dao.AdaptadorDao;
import modelo.Horario;

public class HorarioArchivos extends AdaptadorDao<Horario> {

    private DynamicList<Horario> horarios;
    private Horario horario;

    public HorarioArchivos() {
        super(Horario.class);
    }

    public HorarioArchivos(DynamicList<Horario> horarios, Horario horario, Class clazz) {
        super(clazz);
        this.horarios = horarios;
        this.horario = horario;
    }

    public DynamicList<Horario> getHorarios() {
        return horarios;
    }

    public DynamicList<Horario> getHorariosTodos() {
        horarios = all();
        return horarios;
    }

    public void setHorarios(DynamicList<Horario> horarios) {
        this.horarios = horarios;
    }

    public Horario getHorario() {
        if (horario == null) {
            horario = new Horario();
        }
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public Integer persist(Horario obj) throws Exception {
        obj.setId(all().getLength() + 1);
        return super.persist(obj);
    }

    public DynamicList<Horario> buscarLineal(DynamicList<Horario> lista, String campo, String valorBuscado) throws EmptyException {
        Horario horarios[] = lista.toArray();
        DynamicList<Horario> listaBusqueda = new DynamicList<>();
        for (int i = 0; i < lista.getLength(); i++) {
            Horario horario = horarios[i];
            if (horario.compareCampo(campo, valorBuscado) == 0) {
                listaBusqueda.add(horario);
            }
        }
        return listaBusqueda;
    }

    public Horario buscarBinaria(String campo, String valorBuscado) throws EmptyException {
        int inicio = 0;
        DynamicList<Horario> lista = all();
        int fin = lista.getLength() - 1;
        Horario horarios[] = lista.toArray();
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Horario horario = horarios[medio];
            int comparacion = horario.compareCampo(campo, valorBuscado);
            if (comparacion == 0) {
                return horario;
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null;
    }

}
