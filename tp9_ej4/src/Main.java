import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		Estudiante est1 = new Estudiante("Pepe", "Sartore");
		System.out.println(est1.getNombre());
		est1.cargaNotas(lector);
		est1.mostrarInfo();
		}
}
