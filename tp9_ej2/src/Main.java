public class Main {
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(3.4f,2.1f);
        Rectangulo rect2 = new Rectangulo(1, 3);
        Rectangulo rect3 = new Rectangulo(3.3f,2);
        System.out.println(rect1.getArea());
        System.out.println(rect3.getPerimetro());
        rect2.setAltura(-2);
        System.out.println(rect2.getAltura());
    }
}