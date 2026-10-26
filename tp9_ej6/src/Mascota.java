public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private Dueno duenio;
    public Mascota(String nombre, String especie, int edad, Dueno dueno){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.duenio = dueno;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dueno getDuenio() {
        return duenio;
    }

    public void setDuenio(Dueno duenio) {
        this.duenio = duenio;
    }
}
