package pucem.edu.ec;

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Círculo: Radio = " + radio + ", Área = " + calcularArea();
    }
}
