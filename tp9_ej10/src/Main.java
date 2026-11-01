public class Main {
	public static void main(String[] args){
	Cine sunstar = new Cine("Sunstar", 10, 10);
	sunstar.comprar(2,2);
	sunstar.comprar(1,4);
	sunstar.comprar(2,2);
	sunstar.comprar(6,7);
	sunstar.comprar(10,10);
	sunstar.comprar(1,1);
	sunstar.mostrarRecaudacion();
	sunstar.mostrarButacas();
	}

}

