package Ejercicio59;

public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;



    public void activarUsuario(){
        activo = true;
        System.out.println("Usuario activado");
        System.out.println("Bienvenido " + nombreUsuario);
        System.out.println("Clave: " + clave);

    }
    public void desactivarUsuario(){
        activo = false;
        System.out.println("Usuario desactivado");

    }


    public static void main(String[] args) {
        UsuarioSistema u1 = new UsuarioSistema();
        u1.nombreUsuario = "Juan Licona";
        u1.clave = "123456";
        u1.activo = true;
        u1.activarUsuario();
        u1.desactivarUsuario();

        System.out.println("Usuario activo: " + u1.activo);

        UsuarioSistema u2 = new UsuarioSistema();
        u2.nombreUsuario = "Maria Perez";
        u2.clave = "654321";
        u2.activo = false;
        u2.activarUsuario();

    }
}
