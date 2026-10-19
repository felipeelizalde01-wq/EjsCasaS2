package ej1;

public class MainVideojuego {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        juego1.nombre = "Elden Ring";
        juego1.genero = "RPG";
        juego1.version = "1.12";
        juego1.activo = false;

        juego2.nombre = "Sekiro";
        juego2.genero = "Accion";
        juego2.version = "1.06";
        juego2.activo = false;

        juego3.nombre = "Balatro";
        juego3.genero = "Roguelike";
        juego3.version = "1.0.1";
        juego3.activo = true;

        System.out.println("=== VIDEOJUEGOS ===");
        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

        System.out.println("=== CAMBIOS DE ESTADO ===");
        juego1.iniciar();
        juego3.cerrar();

        juego1.mostrarInformacion();
        juego3.mostrarInformacion();
        juego2.mostrarVersion();
    }
}