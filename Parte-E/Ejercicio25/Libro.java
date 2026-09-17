package Ejercicio25;

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
     static void main(String[] args) {

         Libro L1 = new Libro("1984", "Juan Licona", 328);
L1.mostrarLibro();

         Libro L2 = new Libro();
         L2.mostrarLibro();
     }
}
