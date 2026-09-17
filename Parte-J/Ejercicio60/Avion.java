package Ejercicio60;

public class Avion {

    String Aereolinea;
    String Destino;
    int Pasajeros;

    public void abordar(int cantidad){
        System.out.println("Avion " + Aereolinea + " a " + Destino + " con " + Pasajeros + " pasajeros");


    }

    static void main(String[] args) {
        Avion avion1 = new Avion();
        avion1.Aereolinea = "Latam";
        avion1.Destino = "Mexico";
        avion1.Pasajeros = 100;
        avion1.abordar(100);


    }



}
