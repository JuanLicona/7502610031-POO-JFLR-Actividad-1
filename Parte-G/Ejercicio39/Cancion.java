package Ejercicio39;

public class Cancion {

    String titulo;
    String artista;
    int duracion;
    boolean reproduciendo;

    public void reproducir() {
        reproduciendo = true;
        System.out.println("Reproduciendo cancion");
    }

    public void pausar() {
        reproduciendo = false;
        System.out.println("Cancion pausada");
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + "   Artista: " + artista + "   Duracion: " + duracion + "   Reproduciendo: " + reproduciendo);
    }

    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.titulo = "Bohemian Rhapsody";
        cancion.artista = "Queen";
        cancion.duracion = 355;

        cancion.mostrarInfo();

        cancion.reproducir();
        cancion.mostrarInfo();

        cancion.pausar();
        cancion.mostrarInfo();
    }
}
