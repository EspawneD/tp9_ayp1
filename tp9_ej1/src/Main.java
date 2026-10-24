public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("pepe", 22, "m");
        Persona p2 = new Persona("jorge", 44, "m");
        System.out.println(p2.getEdad());
        System.out.println(p1.getGenero());
        System.out.println(p2.getNombre());
    }
}