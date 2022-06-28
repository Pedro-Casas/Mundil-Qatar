package modelo;

public class Jugador 
{
    private String nombre;
    private String apellidos;
    private int edad;
    private String posicion;
    private int goles;
    private String seleccionar;

    

    public Jugador(String nom, String ape, int edad, String pos, int goles, String seleccionar)
    {
        this.nombre = nom;
        this.apellidos = ape;
        this.edad = edad;
        this.posicion = pos;
        this.goles = goles;
        this.seleccionar = seleccionar;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String ape) {
        this.apellidos = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String pos) {
        this.posicion = pos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getSeleccionar() {
        return seleccionar;
    }

    public void setSeleccionar(String seleccionar) {
        this.seleccionar = seleccionar;
    }
    
    
}
