package modelo;


public class CursaTutoria {

    private Integer id;
    private Boolean impartida;
    private Integer tutoria_ID;
    private Integer cursa_ID;

    public CursaTutoria() {
    }

    public CursaTutoria(Integer id, Boolean impartida, Integer tutoria_ID, Integer cursa_ID) {
        this.id = id;
        this.impartida = impartida;
        this.tutoria_ID = tutoria_ID;
        this.cursa_ID = cursa_ID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getImpartida() {
        return impartida;
    }

    public void setImpartida(Boolean impartida) {
        this.impartida = impartida;
    }

    public Integer getTutoria_ID() {
        return tutoria_ID;
    }

    public void setTutoria_ID(Integer tutoria_ID) {
        this.tutoria_ID = tutoria_ID;
    }

    public Integer getCursa_ID() {
        return cursa_ID;
    }

    public void setCursa_ID(Integer cursa_ID) {
        this.cursa_ID = cursa_ID;
    }

    @Override
    public String toString() {
        return tutoria_ID + "  -  " + cursa_ID;
    }

    public int compareCampo(String campo, String valorBuscado) {
        switch (campo.toLowerCase()) {
            case "id":
                return this.id.compareTo(Integer.parseInt(valorBuscado));
            case "tutoria_id":
//                System.out.println(this.matricula_ID.compareTo(Integer.parseInt(valorBuscado)));
                return this.tutoria_ID.compareTo(Integer.parseInt(valorBuscado));
            case "cursa_id":
                return this.cursa_ID.compareTo(Integer.parseInt(valorBuscado));
            default:
                throw new IllegalArgumentException("Campo no válido para comparación: " + campo);
        }
    }
    
    public Boolean compare(CursaTutoria ct, String field, Integer type) {
        //0 menor 1 mayor
        switch (type) {
            case 0:// Si el tipo es 0 es menor
                if (field.equalsIgnoreCase("cursa_id")) {
                    return cursa_ID.compareTo(ct.getCursa_ID()) < 0;//compara
                } else if (field.equalsIgnoreCase("tutoria_id")) {
                    return tutoria_ID.compareTo(ct.getTutoria_ID()) < 0;
                } else if (field.equalsIgnoreCase("id")) {
                    return id.compareTo(ct.getId()) < 0;
                }
            case 1: //si el tipo es 1 es mayor
                if (field.equalsIgnoreCase("cursa_id")) {
                    return cursa_ID.compareTo(ct.getCursa_ID()) > 0;//compara
                } else if (field.equalsIgnoreCase("tutoria_id")) {
                    return tutoria_ID.compareTo(ct.getTutoria_ID()) > 0;
                } else if (field.equalsIgnoreCase("id")) {
                    return id.compareTo(ct.getId()) > 0;
                }
            default:
                throw new AssertionError();
        }
    }
}
