package ej1;

public class Videojuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Version: " + version);
        System.out.println("Activo: " + activo);
        System.out.println("");
    }

    public void iniciar() {
        activo = true;
    }

    void cerrar() {
        activo = false;
    }

    void mostrarVersion() {
        System.out.println("Version de " + nombre + ": " + version);
    }
}