package Ejercicio55;

public class Reloj {

    String hora;
    String minuto;
    String segundo;

    public void mostrarHora(){

        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    void actualizarHora(){
        hora = "12";
        minuto = "30";
        segundo = "00";
    }
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        reloj.actualizarHora();
        reloj.mostrarHora();
    }
}
