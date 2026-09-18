package Ejercicio68;

public class Negocio {
    String Producto;
    String Cantidad;
    double Precio;
    double Total;

    public Negocio(String Producto, String Cantidad, double Precio, double Total) {
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Total = Total;
    }


    public void mostrarNegocio(){
        System.out.println( "Bienvenidos a CapsLicon");
        System.out.println("--------------------------------");
        System.out.println("Producto: " + Producto);
        System.out.println("Cantidad: " + Cantidad);
        System.out.println("Precio: " + Precio);
        System.out.println("Total: " + Total);
    }


    public void calcularTotal(double Precio, double Cantidad){
        Total = Precio + Cantidad ;
        System.out.println("Total: " + Total);
        System.out.println("--------------------------------");
        System.out.println("Gracias por su compra");
    }

    public void inventario(){
        System.out.println("Abiertas");
        System.out.println("Cerradas");
        System.out.println("--------------------------------");
        System.out.println("Talla 32");
        System.out.println("Talla 34");
        System.out.println("Talla 36");
        System.out.println("--------------------------------");
        System.out.println("Rojas");
        System.out.println("Blancas");
        System.out.println("--------------------------------");
        System.out.println("docenas");
        System.out.println("unidades");
        System.out.println("--------------------------------");
    }

    public void Catalogo(String Producto){
        System.out.println("Catalogo de productos");
        System.out.println("--------------------------------");

    }
    public static void main(String[] args) {
        Negocio negocio = new Negocio("Gorras", "2", 85, 17);
        negocio.mostrarNegocio();
        negocio.Catalogo("Camisa");
        negocio.inventario();
        negocio.calcularTotal(100, 2);
    }
}
