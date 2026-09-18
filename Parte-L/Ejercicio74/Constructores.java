package Ejercicio74;

public class Constructores {
    String nombre;
    String apellido;
/*
Opino que este primeer constructor con asignacion manual atributo a atributo es mas facil de entender en un principio para no confundirse
en lo que conlleva colocar los atributos entre los parentesis y usar this() para diferenciar si estan actuando de anera local en el constructor
 o de manera global en la calse para que no choquen sus valores y se genere un error
 */

    public Constructores() {
        String nombre = "Juan";
        String apellido = "Licona";
    }

    public Constructores(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Constructores(Constructores OtroConstructores) {
        this.nombre = OtroConstructores.nombre;
        this.apellido = OtroConstructores.apellido;

    }
    void mostrarInfo(){
        System.out.println(nombre + " " + apellido);
    }

    static void main(String[] args) {
        Constructores c1 = new Constructores();
        c1.mostrarInfo();
        Constructores c2 = new Constructores("Felipe", "Romero");
        c2.mostrarInfo();
        Constructores c3 = new Constructores(c2);
        c3.mostrarInfo();
    }
}
