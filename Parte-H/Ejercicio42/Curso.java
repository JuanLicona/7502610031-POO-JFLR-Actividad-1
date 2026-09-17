package Ejercicio42;

public class Curso {

    String nombre;
    String codigo;
    int creditos;

    public Curso(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public void mostrarInfo() {
        System.out.println(codigo + " - " + nombre + " (" + creditos + " creditos)");
    }

    public static void main(String[] args) {
        Curso curso1 = new Curso("Programacion Orientada a Objetos", "POO-101", 4);
        Curso curso2 = new Curso("Bases de Datos", "BD-201", 3);

        curso1.mostrarInfo();
        curso2.mostrarInfo();
    }
}

/*
 * curso1 y curso2 son de la misma clase aunque sus datos sean distintos:
 *
 * La clase Curso no guarda valores, guarda la ESTRUCTURA que va a tener
 * cualquier curso (que tenga nombre, codigo y creditos) y el COMPORTAMIENTO
 * que puede ejecutar (mostrarInfo). curso1 y curso2 son dos cajas separadas
 * en memoria construidas con ese mismo molde; cada una llena esos espacios
 * con sus propios valores. Pertenecen a la misma clase porque comparten el
 * mismo conjunto de caracteristicas y comportamientos, no porque tengan
 * los mismos datos. Es la misma relacion que hay entre "persona" (el
 * concepto) y dos personas reales distintas: ambas son personas aunque
 * se llamen diferente.
 */
