package Ejercicio73;

public class Vehiculo {

    public String marca;
    public float modelo;
    public String color;
    public int velocidadActual;

    public Vehiculo(String marca, float modelo, String color, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    //Constructor Copia
    public Vehiculo(Vehiculo Otrovehiculo) {
        this.marca = Otrovehiculo.marca;
        this.modelo = Otrovehiculo.modelo;
        this.color = Otrovehiculo.color;


    }


    void mostrarInfo(){
        System.out.println(marca + " " + modelo + " (" + color + ") a " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        System.out.println("Vehiculo 1");
       Vehiculo Original = new Vehiculo("Ford", 2010, "Azul", 100);
       Original.mostrarInfo();
        System.out.println("Vehiculo 2");
       Vehiculo Copia = new Vehiculo(Original);
       Copia.mostrarInfo();
    }
}
