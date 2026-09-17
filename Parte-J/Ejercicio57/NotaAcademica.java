package Ejercicio57;

public class NotaAcademica {
    String Asignatura;
    double nota1;
    double nota2;
    double nota3;

    public double calcularDefinitiva(){
        return (nota1+nota2+nota3)/3;
    }


    static void main(String[] args) {
        NotaAcademica n1 = new NotaAcademica();
        n1.Asignatura = "Matematicas";
        n1.nota1 = 9;
        n1.nota2 = 8;
        n1.nota3 = 7;
        System.out.println("Nota Definitiva: " + n1.calcularDefinitiva());
    }
}
