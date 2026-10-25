import java.util.Scanner;
import java.util.Arrays;
public class Estudiante{
	private String nombre;
	private String apellido;
	private int[] notas = new int[5];
	public Estudiante(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		}
	public void cargaNotas(Scanner lector){
		for(int i=0; i<this.notas.length ; i++){
			System.out.printf("Ingrese nota %d de %s,  %s:", i + 1, this.apellido, this.nombre);
			this.notas[i] = lector.nextInt();
			}
		}
	public String getNombre(){
		return nombre;
		}
	public double getPromedio(){
		double promedio = 0;
		for(int i=0; i<this.notas.length; i++){
			promedio += this.notas[i];
			}
		promedio /= this.notas.length;
		return promedio;	
		}
	public void mostrarInfo(){
		System.out.printf("Apellido y nombre: %s, %s%n", this.apellido, this.nombre);
		System.out.printf("Notas: %s%n", Arrays.toString(this.notas));
		System.out.printf("Promedio: %.2f%n", this.getPromedio());
		}		
}
