public class Rectangulo {
    private double base;
    private double altura;
    public Rectangulo(double base, double altura){
        if(base >= 0 && altura >= 0) {
            this.base = base;
            this.altura = altura;
        } else {
            System.out.println("Revise la entrada de valores, deben ser mayor o igual a cero.");
        }
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public double getArea() {
        return base * altura;
    }
    public double getPerimetro() {
        return 2*base + 2*altura;
    }
    public void setAltura(double nuevaAltura) {
        if (nuevaAltura >= 0) {this.altura = nuevaAltura;}
        else {System.out.println("Altura debe ser positiva.");}
    }
    public void setBase(double nuevaBase) {
        if(nuevaBase >= 0) {this.base = nuevaBase;}
        else {System.out.println("Base debe ser positiva.");}
    }
}
