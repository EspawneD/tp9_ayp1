public class Main {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Nipo", 20),
                new Persona("Nipe", 35),
                new Persona("Pepe", 18),
                new Persona("Tomasito", 42),
                new Persona("Dardios", 27)
        };
        Persona encontrada = busquedaNombre(personas, "Nipe");
        if (encontrada != null){
            System.out.println("Persona encontrada: " + encontrada.getNombre());
        } else {
            System.out.println("Persona no encontrada.");
        }
        System.out.printf("Cantidad de personas: %d%n", Persona.getCantPersonas());
        System.out.printf("Persona mayor: %s%n", conseguirMayor(personas).getNombre());
        System.out.printf("Persona menor: %s%n", conseguirMenor(personas).getNombre());
    }
    static Persona conseguirMayor (Persona[] personas){
        Persona mayor = personas[0];
        for (int i = 1; i < personas.length; i++) {
            if (mayor.getEdad() < personas[i].getEdad()) {
                mayor = personas[i];
            }
        }
        return mayor;
    }
    static Persona conseguirMenor (Persona[] personas){
        Persona menor = personas[0];
        for (int i = 1; i < personas.length; i++) {
            if (menor.getEdad() > personas[i].getEdad()){
                menor = personas[i];
            }
        }
        return menor;
    }
    static Persona busquedaNombre(Persona[] personas, String personaBuscada){
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(personaBuscada)){
                return personas[i];
            }
        }
        return null;
    }
}