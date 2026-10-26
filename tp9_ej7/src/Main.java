import org.w3c.dom.ls.LSOutput;

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
    void conseguirMenor (Persona[] personas){
        Persona menor = personas[0];
        for (int i = 1; i < personas.length; i++) {
            if (menor.getEdad() > personas[i].getEdad()){
                menor = personas[i];
            }
        }
    }
    Persona busquedaNombre(Persona[] personas, String personaBuscada){
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(personaBuscada)){
                return personas[i];
            }
        }
        System.out.println("Persona no encontrada.");
        Persona pNula = null;
        return pNula;
    }
}