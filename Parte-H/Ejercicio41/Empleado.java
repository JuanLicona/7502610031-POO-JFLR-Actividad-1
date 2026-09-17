package Ejercicio41;

/*
 * Forma procedural variables sueltas, solo como referencia para comparar:
 *
 * String nombre1 = "Ana";
 * String cargo1 = "Analista";
 * double salario1 = 2000000;
 *
 * String nombre2 = "Luis";
 * String cargo2 = "Analista";
 * double salario2 = 2200000;
 *
 * static void mostrarInfo(String nombre, String cargo, double salario) {
 *     System.out.println(nombre + " - " + cargo + " - $" + salario);
 * }
 *
 * static double aumentarSalario(double salario, double porcentaje) {
 *     return salario + salario * porcentaje / 100;
 * }
 *
 * por cada empleado nuevo se tiene que crear 3 variables mas y pasarlas
 * manualmente a cada metodo. Con clases y objetos, esos datos y su
 * comportamiento quedan agrupados y se reutilizan sin duplicar nada:
 */

public class Empleado {

    String nombre;
    String cargo;
    double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - " + cargo + " - $" + salario);
    }

    public void aumentarSalario(double porcentaje) {
        salario = salario + salario * porcentaje / 100;
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", "Analista", 2000000);
        Empleado empleado2 = new Empleado("Luis", "Analista", 2200000);

        empleado1.mostrarInfo();
        empleado2.mostrarInfo();

        empleado1.aumentarSalario(10);
        empleado2.aumentarSalario(5);

        System.out.println("Despues del aumento:");
        empleado1.mostrarInfo();
        empleado2.mostrarInfo();
    }
}
