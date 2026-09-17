package Ejercicio22;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Libro {

    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public Libro() {
        this("Sin titulo","Sin autor",0);
    }


    public void mostrarLibro() {
        System.out.println("Titulo: " + titulo + "   Autor: " + autor + "   Paginas: " + paginas);
    }


    public static void main(String[] args) {
        Libro l1 = new Libro("1984", "George Orwell", 328);
        Libro l2 = new Libro("El gran Gatsby", "F. Scott Fitzgerald", 250);
        Libro l3 = new Libro("Cien años de soledad", "Miguel de Cervantes", 224);
        Libro l4 = new Libro("Frankenstein", "Francis Ford Coppola", 224);

    }


    // La clase Libro tiene un constructor por defecto que crea un objeto Libro con titulo, autor y paginas
    // inicializados a "Sin titulo", "Sin autor" y 0.
    // tambien un constructor parametrizado para crear objetos Libro con titulo, autor y paginas.
    // y la clase y los constructores son plantillas para crear objetos Libro.
    //los objetos son casos concretos porque tienen valores individuales y no compartidos con otros objetos.
    }


