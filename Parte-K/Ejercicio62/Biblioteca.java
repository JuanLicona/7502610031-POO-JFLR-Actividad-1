package Ejercicio62;

public class Biblioteca {

    /*
    qué atributos tendrá:
    /*
    nombre de la biblioteca
    ubicacion
    capacidad de aforo de personas

     */

    //qué métodos tendrá:
    /*

    registara usuarios
    registrar libros
    registrar prestamos
    registrar devoluciones

     */

    //qué objetos reales podrían construirse:
     /*
     libros registrados en la biblioteca
     libros prestados por los usuarios

      */
    String nombreBiblioteca;
    String ubicacion;
    int capacidad;



public void registrarUsuario(String nombre, String apellido, String dni, String email, String telefono){
    System.out.println("Usuario registrado");
    System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " DNI: " + dni + " Email: " + email + " Telefono: " + telefono);
}
public void registrarLibro(String titulo, String autor, int anio){
    System.out.println("Libro registrado");

}

public void registrarPrestamo(String usuario, String libro){
    System.out.println("Prestamo registrado");
    System.out.println("El usuario " + usuario + " ha solicitado el libro " + libro);
}
public void registrarDevolucion(String usuario, String libro){
    System.out.println("Devolucion registrada");
    System.out.println("El usuario " + usuario + " ha devuelto el libro " + libro);
}
    public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    biblioteca.registrarUsuario("Juan", "Licona", "123456789", "juanfliconaromero@gmail.com", "987654321");
    biblioteca.registrarLibro("1984", "George Orwell", 1949);
    biblioteca.registrarPrestamo("Juan", "1984");
    biblioteca.registrarDevolucion("Juan", "1984");

    }

}
