package ej3;

public class Tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas estimadas: " + horasEstimadas);
        System.out.println("Completada: " + completada);
        System.out.println("");
    }

    public void completar() {
        completada = true;
    }

    void mostrarResponsable() {
        System.out.println("Responsable de " + titulo + ": " + responsable);
    }

    void mostrarEstado() {
        System.out.println("Completada (" + titulo + "): " + completada);
    }
}