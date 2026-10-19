package ej3;

public class MainTarea {
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Diseñar Base de Datos";
        tarea1.responsable = "Felipe";
        tarea1.horasEstimadas = 5.5;
        tarea1.completada = false;

        tarea2.titulo = "Crear API REST";
        tarea2.responsable = "Armando";
        tarea2.horasEstimadas = 8.0;
        tarea2.completada = false;

        tarea3.titulo = "Pruebas Unitarias";
        tarea3.responsable = "Joaquin";
        tarea3.horasEstimadas = 4.0;
        tarea3.completada = false;

        System.out.println("=== TAREAS INICIALES ===");
        tarea1.mostrarInformacion();
        tarea2.mostrarInformacion();
        tarea3.mostrarInformacion();

        tarea1.completar();

        System.out.println("=== COMPROBACION DE ESTADOS ===");
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();
    }
}