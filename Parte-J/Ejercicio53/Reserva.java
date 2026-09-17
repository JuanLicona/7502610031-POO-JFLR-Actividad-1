package Ejercicio53;

public class Reserva {

    String Nombrecliente;
    String  Fecha;
    boolean  Activa;

    Reserva(String Nombrecliente, String Fecha, boolean Activa){
        this.Nombrecliente = Nombrecliente;
        this.Fecha = Fecha;
        this.Activa = Activa;
    }
    void mostrarReserva(){
        System.out.println("Nombre: " + Nombrecliente + " Fecha: " + Fecha + " Activa: " + Activa);
    }
    void cancelarReserva(){
        Activa = false;
    }
    void activarReserva(){
        Activa = true;
    }

    static void main(String[] args) {
        Reserva r1 = new Reserva("Juan", "2023-05-01", true);
        r1.mostrarReserva();
        r1.cancelarReserva();
        r1.mostrarReserva();

        Reserva r2 = new Reserva("Maria", "2023-05-02", false);
        r2.mostrarReserva();
        r2.activarReserva();
        r2.mostrarReserva();
    }
}
