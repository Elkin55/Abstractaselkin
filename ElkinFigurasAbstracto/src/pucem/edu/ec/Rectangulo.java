package pucem.edu.ec;

class Rectangulo extends FiguraGeometrica {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public String toString() {
        return "Rectángulo: Ancho = " + ancho + ", Alto = " + alto + ", Área = " + calcularArea();
    }
}