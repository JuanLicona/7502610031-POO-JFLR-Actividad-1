package Ejercicio34;

public class Libro {

    String titulo;
    String autor;
    int paginas;

    public Libro() {

    }

    public Libro(Libro otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }

    public void mostrarLibro() {
        System.out.println("Titulo: " + titulo + "   Autor: " + autor + "   Paginas: " + paginas);
    }

    public static void main(String[] args) {

        Libro original = new Libro();
        original.titulo = "1984";
        original.autor = "Juan Licona";
        original.paginas = 328;
        original.mostrarLibro();

        Libro copia = new Libro(original);
        copia.mostrarLibro();
    }
}
