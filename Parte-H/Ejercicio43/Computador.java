package Ejercicio43;

public class Computador {

    String marca;
    String procesador;
    int ramGB;

    public Computador(String marca, String procesador, int ramGB) {
        this.marca = marca;
        this.procesador = procesador;
        this.ramGB = ramGB;
    }

    public void mostrarEspecificaciones() {
        System.out.println(marca + " - " + procesador + " - " + ramGB + "GB RAM");
    }

    public static void main(String[] args) {
        Computador pc1 = new Computador("Dell", "Intel i5", 16);
        Computador pc2 = new Computador("Lenovo", "AMD Ryzen 7", 32);

        pc1.mostrarEspecificaciones();
        pc2.mostrarEspecificaciones();
    }
}

/*
 * Diferencia entre el plano conceptual y la maquina concreta:
 *
 * La clase Computador es el plano: define que atributos va a tener un
 * computador (marca, procesador, ramGB) y que puede hacer, pero ese plano
 * no enciende, no procesa nada, no ocupa RAM real. Es pura definicion.
 *
 * pc1 y pc2 son las maquinas concretas: objetos reales creados en memoria
 * a partir de ese plano, cada uno con sus propios valores (Dell con 16GB,
 * Lenovo con 32GB). Asi como un plano de fabrica permite construir muchos
 * computadores fisicos distintos a partir del mismo diseño, la clase
 * permite crear tantos objetos Computador como se necesiten, todos con la
 * misma estructura pero cada uno con existencia y datos propios.
 */
