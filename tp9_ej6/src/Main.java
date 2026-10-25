public class Main {
    public static void main(String[] args) {
        Dueno dueno1 = new Dueno("Sartore", "Pepe");
        Mascota mascota1 = new Mascota("Gaucho","labrador", 10, dueno1);
        dueno1.setMascota(mascota1);
        dueno1.mostrarDueno();
        Dueno dueno2 = new Dueno("Sanchez", "Tomasito");
        dueno2.mostrarDueno();
        dueno1.removeMascota();
        dueno1.mostrarDueno();
    }
}