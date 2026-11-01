public class Cine {
	private String nombre;
	private final int FILAS;
	private final int COLUMNAS;
	private Butaca[][] butacas;
	private double recaudacion;

	public Cine (String nombre, int filas, int columnas){
		this.nombre = nombre;
		this.FILAS = filas;
		this.COLUMNAS = columnas;
		this.butacas = new Butaca[filas][columnas];
		generarButacas();
	}

	public double getRecaudacion() {
		return recaudacion;
	}

	public String getNombre(){
		return nombre;
	}

	public void mostrarRecaudacion(){
		System.out.printf("El cine %s ha recaudado: %.2f%n", nombre, recaudacion);
	}

	public void comprar(int fila, int columna){
		fila--;
		columna--;
		if (!butacas[fila][columna].getOcupado()){
			System.out.printf("La butaca %d, %d está libre.%n", fila + 1, columna + 1);
			System.out.printf("Precio: %.2f%n", butacas[fila][columna].getPrecio());
			System.out.printf("Categoría: %s%n", butacas[fila][columna].getCategoria());
			butacas[fila][columna].setOcupado(true);
			System.out.println("Compra exitosa.");
			recaudacion += butacas[fila][columna].getPrecio();

		} else {
			System.out.printf("La compra no se ha realizado, la butaca %d, %d está ocupada.%n", fila + 1, columna + 1);
		}
	}

	private void generarButacas(){
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (i < FILAS / 2){
					butacas[i][j] = new Butaca(false, "Platea", 23.5);
				} else {
					butacas[i][j] = new Butaca(false, "Estándar", 19.5);
				}
			}
		}
		System.out.println("Butacas generadas exitosamente.");
	}

	public int contarLibres(){
		int libres = 0;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if(!butacas[i][j].getOcupado()) libres++;
			}
		}
		return libres;
	}

	public void mostrarButacas(){
		for (int i = 0; i < FILAS; i++) {
			System.out.printf("Fila %d ", i + 1);
			for (int j = 0; j < COLUMNAS; j++) {

				if (!butacas[i][j].getOcupado()){
					System.out.printf("_ ");
				} else {
					System.out.printf("x ");
				}
			}
			System.out.println();
		}

	}
}

