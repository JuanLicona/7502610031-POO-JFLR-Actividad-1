package Ejercicio44;

public class Paciente {

    String nombre;
    String identificacion;
    String diagnostico;

    public Paciente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.diagnostico = "Sin diagnostico";
    }

    public void asignarDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void mostrarHistoria() {
        System.out.println(nombre + " (ID " + identificacion + ") - Diagnostico: " + diagnostico);
    }

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Maria Gomez", "CC-1001");
        paciente1.mostrarHistoria();

        paciente1.asignarDiagnostico("Gripe comun");
        paciente1.mostrarHistoria();
    }
}

/*
 * Por que crear un paciente e instanciar la clase Paciente se
 * relacionan pero no son la misma idea:
 *
 * Crear un paciente es un hecho del mundo real: una persona llega al
 * hospital y es registrada, existe fisicamente, tiene sintomas, ocupa una
 * cama. "Instanciar la clase Paciente" es un hecho puramente tecnico
 * dentro del programa: usar new Paciente(...) para reservar memoria y
 * producir un objeto que representa esos datos.
 *
 * Se relacionan porque la instanciacion es el mecanismo que usamos para
 * MODELAR dentro del software el hecho real de que un paciente existe.
 * Pero no son lo mismo: el objeto Paciente no es el paciente, es una
 * representacion con la informacion que nos interesa de el (nombre, id,
 * diagnostico). Si el objeto se borra de memoria, el paciente real no
 * desaparece; y si el paciente real cambia de diagnostico, alguien tiene
 * que actualizar el objeto para que la representacion siga siendo fiel.
 */
