package Ejercicio63;

public class Hospital {

// qué atributos tendrá:
    /*
    nombre del hospital
    ubicacion
    capacidad de aforo de personas
    tipo de hospital


     */
//qué métodos tendrá:
    /*
    registrar pacientes
    registrar citas
    atender a pacientes
    atender a citas

     */

    //qué objetos reales podrían construirse:
/*
pacientes registrados en el hospital
citas registradas en el hospital



 */
    String nombre;
    String ubicacion;
    int capacidad;
    String tipo;


    public Hospital(String nombre, String ubicacion, int capacidad, String tipo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Tipo: " + tipo);


    }
    void registrarPaciente(){
        System.out.println("Paciente registrado");
    }

    void registrarCita(){
        System.out.println("Cita registrada");
    }

    public void atenderPaciente(){
        System.out.println("Paciente atendido");
    }
    public void atenderCita() {

        System.out.println("Cita atendida");
    }

    static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital General", "Calle 123", 100, "Medico General");
        hospital.mostrarInfo();
        hospital.registrarPaciente();
        hospital.registrarCita();
        hospital.atenderPaciente();
        hospital.atenderCita();
    }
}



