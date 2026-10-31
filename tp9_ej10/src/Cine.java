public class Cine {
	private String nombre;
	private final int FILAS;
	private final int COLUMNAS;
	private Butaca[][] butacas;

	public Cine (String nombre, int filas, int columnas){
		this.nombre = nombre;
		this.FILAS = filas;
		this.COLUMNAS = columnas;
		this.butacas = new Butaca[filas][columnas];
		generarButacas();
	}
	public void venta(){
		for(int i = 0; i < butacas.length; i++){
			for (int j = 0; j < butacas[i].length; j++){
				if(!butacas[i][j].getOcupado()){
					System.out.printf("Precio: %.2f%n", butacas[i][j].getPrecio());
					}
				}
			}
		}
	public void generarButacas(){
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				if (i < butacas.length / 2){
					butacas[i][j] = new Butaca(false, "Platea", 23.5);
				} else {
					butacas[i][j] = new Butaca(false, "Estándar", 19.5);
				}
			}
		}
		System.out.println("Butacas generadas exitosamente.");
	}
}

