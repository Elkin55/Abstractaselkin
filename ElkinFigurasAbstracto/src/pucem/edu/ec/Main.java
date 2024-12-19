package pucem.edu.ec;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo(5, 10);
        FiguraGeometrica triangulo = new Triangulo(6, 8);
        FiguraGeometrica circulo = new Circulo(7);

        System.out.println(rectangulo);
        System.out.println(triangulo);
        System.out.println(circulo);

        System.out.println("¿El rectángulo tiene un área mayor que el triángulo? " + rectangulo.mayorQue(triangulo));
        System.out.println("¿El círculo tiene un área mayor que el rectángulo? " + circulo.mayorQue(rectangulo));
    }
}
