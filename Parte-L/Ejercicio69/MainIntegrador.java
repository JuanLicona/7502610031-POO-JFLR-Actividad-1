package Ejercicio69;

class DiarioVivir {
    String nombre;
    String edad;
    String carrera;

    public DiarioVivir(String nombre, String edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void mostrarInfo() {
        System.out.println("Diario de: " + nombre + "  Edad: " + edad + "  Carrera: " + carrera);
    }
}

class Negocio {
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

    public void mostrarNegocio() {
        System.out.println("Producto: " + Producto + " | Cant: " + Cantidad + " | Precio: $" + Precio + " | Total: $" + Total);
    }
}

class Universidad {
    String nombre;
    String direccion;
    String Estudiante;
    String Carrera;
    String codigo;
    String Metodologia;

    Universidad(String nombre, String direccion, String Estudiante, String Carrera, String codigo, String Metodologia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.Estudiante = Estudiante;
        this.Carrera = Carrera;
        this.codigo = codigo;
        this.Metodologia = Metodologia;
    }


    Universidad() {
        nombre = "Universidad de Cartagena";
        direccion = "Sede Piedra Bolivar";
        Estudiante = "Juan Felipe Licona Romero";
        Carrera = "Ingeniería de Software";
        codigo = "7502610031";
        Metodologia = "A distancia-Semipresencial";
    }

    public void mostrarInfo() {
        System.out.println("Univ: " + nombre + " | Estudiante: " + Estudiante + " | Cod: " + codigo + " | Prog: " + Carrera);
    }
}

// Principal
public class MainIntegrador {
    public static void main(String[] args) {

        System.out.println("OBJETOS DE LA CLASE DIARIO VIVIR");
        DiarioVivir diario1 = new DiarioVivir("Juan Felipe Licona", "17", "Ingeniería de Software");
        DiarioVivir diario2 = new DiarioVivir("Carlos Martínez", "20", "Ingeniería Civil");
        DiarioVivir diario3 = new DiarioVivir("Ana Gómez", "19", "Derecho");
        DiarioVivir diario4 = new DiarioVivir("Luis Pérez", "21", "Medicina");
        DiarioVivir diario5 = new DiarioVivir("Marta Díaz", "18", "Administración de Empresas");

        diario1.mostrarInfo();
        diario2.mostrarInfo();
        diario3.mostrarInfo();
        diario4.mostrarInfo();
        diario5.mostrarInfo();

        System.out.println("\n OBJETOS DE LA CLASE NEGOCIO ");
        Negocio venta1 = new Negocio("Gorras Negras", "2", 85.0, 170.0);
        Negocio venta2 = new Negocio("Gorras Blancas", "5", 80.0, 400.0);
        Negocio venta3 = new Negocio("Camisetas Oversize", "1", 120.0, 120.0);
        Negocio venta4 = new Negocio("Buzos Morados", "3", 150.0, 450.0);
        Negocio venta5 = new Negocio("Gorras Rojas", "10", 75.0, 750.0);

        venta1.mostrarNegocio();
        venta2.mostrarNegocio();
        venta3.mostrarNegocio();
        venta4.mostrarNegocio();
        venta5.mostrarNegocio();

        System.out.println("\n OBJETOS DE LA CLASE UNIVERSIDAD ");
        Universidad est1 = new Universidad();
        Universidad est2 = new Universidad("SENA - Centro Petroquímico", "Cartagena", "Juan Felipe Licona", "ADSO", "3537624", "Presencial");
        Universidad est3 = new Universidad("Universidad de Cartagena", "Zaragocilla", "Maria Lopez", "Enfermería", "7502610032", "Presencial");
        Universidad est4 = new Universidad("Universidad de Cartagena", "San Agustin", "Carlos Perez", "Derecho", "7502610033", "A distancia");
        Universidad est5 = new Universidad("SENA - Colombo Alemán", "Barranquilla", "Laura Diaz", "Mecatrónica", "3537625", "Presencial");

        est1.mostrarInfo();
        est2.mostrarInfo();
        est3.mostrarInfo();
        est4.mostrarInfo();
        est5.mostrarInfo();
    }
}