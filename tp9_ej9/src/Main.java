import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
		Persona[] personas = {
                new Persona("Nipo", 20),
                new Persona("Nipe", 35),
                new Persona("Pepe", 18),
                new Persona("Tomasito", 42),
                new Persona("Dardios", 27),
                new Persona("Facu",35),
                new Persona("Fac", 35)
        };
        ordenarEdad(personas);
        mostrarNombresOrdenados(personas);

    }
    static void mostrarNombresOrdenados(Persona[] personas){
			for(int i =0; i < personas.length; i++){
				System.out.printf("%s, ", personas[i].getNombre());
			}
		}
	static void ordenarEdad(Persona[] personas) {
		for (int i=0; i < personas.length - 1; i++){
			int posMenor = i;
			for (int j = i + 1; j < personas.length; j++){
				if (personas[j].getEdad() < personas[posMenor].getEdad() || 
				(personas[posMenor].getEdad() == ( personas[j].getEdad() ) 
				&& personas[j].getNombre().compareTo(personas[posMenor].getNombre()) < 0 )){
					posMenor = j;
					}
				}
			Persona aux = personas[i];
			personas[i] = personas[posMenor];
			personas[posMenor] = aux;	
			}
		
	}
}	
