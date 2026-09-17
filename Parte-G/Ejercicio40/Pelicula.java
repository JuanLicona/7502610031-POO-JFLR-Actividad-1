package Ejercicio40;

public class Pelicula {
    String nombre;
    String genero;
    int minutos;
    boolean reproduciendo;

    public void reproducir() {
        reproduciendo = true;
        System.out.println("Reproduciendo pelicula");
    }

    public void detener() {
        reproduciendo = false;
        System.out.println("Pelicula detenida");
    }

    public void mostrarFicha(){
        System.out.println("Nombre: " + nombre + " Genero: " + genero + " Duracion: " + minutos + " minutos" + "   Reproduciendo: " + reproduciendo);
    }

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        pelicula.nombre = "Matrix";
        pelicula.genero = "Ciencia Ficcion";
        pelicula.minutos = 136;

        pelicula.mostrarFicha();

        pelicula.reproducir();
        pelicula.mostrarFicha();

        pelicula.detener();
        pelicula.mostrarFicha();
    }
}
