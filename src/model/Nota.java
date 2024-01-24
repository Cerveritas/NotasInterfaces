package model;

public class Nota {

    private String nombre;
    private String apellido;
    private String nota;


    public Nota(String nombre, String apellido, String nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
