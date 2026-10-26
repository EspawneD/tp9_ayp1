public class Dueno {
    private String nombre;
    private String apellido;
    private Mascota mascota;

    public Dueno(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;

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

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
        mascota.setDuenio(this);
    }

    public void removeMascota(){
        this.mascota.setDuenio(null);
        this.mascota = null;
    }

    public void mostrarDueno(){
        System.out.printf("Nombre y Apellido: %s %s%n", this.nombre, this.apellido);
        if (this.mascota != null) {
            System.out.println("Tiene Mascota.");
            System.out.printf("Nombre de mascota: %s%n" +
                    "Especie: %s%n" +
                    "Edad: %d%n", this.mascota.getNombre(), this.mascota.getEspecie(), this.mascota.getEdad());

        } else System.out.println("No tiene mascota.");
    }
}
