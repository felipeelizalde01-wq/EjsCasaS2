package ej2;

public class MainModulo {
    public static void main(String[] args) {
        Modulo modulo1 = new Modulo();
        Modulo modulo2 = new Modulo();
        Modulo modulo3 = new Modulo();

        modulo1.nombre = "Login";
        modulo1.lenguaje = "Java";
        modulo1.version = "1.0";
        modulo1.terminado = false;

        modulo2.nombre = "Inventario";
        modulo2.lenguaje = "Python";
        modulo2.version = "2.1";
        modulo2.terminado = false;

        modulo3.nombre = "Reportes";
        modulo3.lenguaje = "R";
        modulo3.version = "1.4";
        modulo3.terminado = true;

        System.out.println("=== MODULOS ===");
        modulo1.mostrarInformacion();
        modulo2.mostrarInformacion();
        modulo3.mostrarInformacion();

        modulo1.marcarTerminado();
        System.out.println("=== ESTADOS ACTUALIZADOS ===");
        modulo1.mostrarEstado();
        modulo2.mostrarEstado();
        modulo3.mostrarVersion();
    }
}