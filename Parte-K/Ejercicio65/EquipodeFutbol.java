package Ejercicio65;
// qué atributos tendrá:
    /*
    nombre del equipo
    equipo en la liga
    goles hechos
    partidos jugados
    cantidad de jugadores


     */
//qué métodos tendrá:
    /*
    partidos jugados
    goles hechos

     */

//qué objetos reales podrían construirse:
/* equipos de futbol



 */
public class EquipodeFutbol {
    String nombre;
    String equipo;
    int goles;
    int partidos;
    int CantidadJugadores;

    public void partidosJugados(){
        partidos ++;
        System.out.println("Partidos jugados: " + partidos);
        System.out.println("Equipo: " + equipo);


    }
    public void golesHechos(){
        goles ++;
        System.out.println("Goles hechos: " + goles);
        System.out.println("Equipo: " + equipo);


    }

    static void main(String[] args) {
        EquipodeFutbol e1 = new EquipodeFutbol();
        e1.nombre = "Real Madrid";
        e1.equipo = "España";
        e1.goles = 3;
        e1.partidos = 3;
        e1.CantidadJugadores = 15;
        e1.partidosJugados();
        e1.golesHechos();



    }



}
