package Ejercicio51;

public class Rectangulo {
    double base;
    double altura;

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
    public void mostrarResultado(){
        System.out.println("Base: " + base + " Altura: " + altura);
    }

    static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.base = 5;
        r1.altura = 10;
        r1.mostrarResultado();
        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());

        Rectangulo r2 = new Rectangulo();
        r2.base = 10;
        r2.altura = 5;
        r2.mostrarResultado();
        System.out.println("Area: " + r2.calcularArea());
        System.out.println("Perimetro: " + r2.calcularPerimetro());
    }
}
