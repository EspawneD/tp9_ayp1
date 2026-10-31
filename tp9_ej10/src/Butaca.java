public class Butaca {
	private boolean ocupado;
	private String categoria;
	private double precio;

	public Butaca(boolean ocupado, String categoria, double precio){
		this.ocupado = ocupado;
		this.categoria = categoria;
		this.precio = precio;
	}
	public boolean getOcupado(){
		return ocupado;
		}

	public double getPrecio(){
		return precio;
		}

	public String getCategoria(){ return categoria; }

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}

