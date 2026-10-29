public class Cine {
	Butaca[][] butacas = new Butaca[FILAS][COLUMNAS];
	public void venta(){
		for(int i = 0; i < FILAS; i++){
			for (int j = 0; j < COLUMNAS; j++){
				if(!butacas[i][j].getOcupado){
					System.out.printf("Precio: ", butacas[i][j].getPrecio());
					}
				}
			}
		}
}

