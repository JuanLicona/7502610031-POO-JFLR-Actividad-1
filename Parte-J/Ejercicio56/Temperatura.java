package Ejercicio56;

public class Temperatura {
    double gradosCelsius;

    public double gradosFahrenheit(){
        return (gradosCelsius * 9/5) + 32;
    }
    public double gradosKelvin(){
        return gradosCelsius + 273.15;
    }

    static void main(String[] args) {
        Temperatura t = new Temperatura();
        t.gradosCelsius = 20;
        System.out.println("Grados Fahrenheit: " + t.gradosFahrenheit());
        System.out.println("Grados Kelvin: " + t.gradosKelvin());
    }

    //Grados Kelvin fue por avaricia :)
}
