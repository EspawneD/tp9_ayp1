public class Main {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Nipo", 20),
                new Persona("Nipe", 35),
                new Persona("Pepe", 18),
                new Persona("Tomasito", 42),
                new Persona("Dardios", 27)
        };
    }
    void conseguirMayor (Persona[] personas){
        Persona mayor = personas[0];
        for (int i = 1; i < personas.length; i++) {
            if (mayor.getEdad() < personas[i].getEdad()) {
                mayor = personas[i];
            }
        }
    }
}