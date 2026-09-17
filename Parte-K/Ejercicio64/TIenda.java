package Ejercicio64;

public class TIenda {

    // qué atributos tendrá:
    /*
    nombre de la tienda
    ubicacion


     */
//qué métodos tendrá:
    /*

    Clientes despachados

     */

    //qué objetos reales podrían construirse:
/*
Clientes atendidos en la tienda



 */
    String nombre;
    String ubicacion;

    public void despacharCliente(){
        System.out.println("Cliente despachado");
    }
    public void atenderCliente(){
        System.out.println("Cliente atendido");
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Ubicacion: " + ubicacion);
    }
    public static void main(String[] args) {
        TIenda tienda = new TIenda();
        tienda.nombre = "Tienda del cachaco";
        tienda.ubicacion = "Calle 123";
        tienda.mostrarInfo();
        tienda.despacharCliente();
        tienda.atenderCliente();
    }
}
