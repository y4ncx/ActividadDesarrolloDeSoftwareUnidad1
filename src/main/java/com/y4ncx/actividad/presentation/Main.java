package com.y4ncx.actividad.presentation;

import com.y4ncx.actividad.application.AlumnoService;
import com.y4ncx.actividad.domain.Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlumnoService service = new AlumnoService();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CRUD de Alumnos ---");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Nombre completo: ");
                    String nombre = sc.nextLine();
                    System.out.print("Número de matrícula: ");
                    String matricula = sc.nextLine();
                    service.crearAlumno(dni, nombre, matricula);
                }
                case 2 -> {
                    System.out.println("\n--- Lista de Alumnos ---");
                    service.obtenerAlumnos().forEach(alumno ->
                            System.out.println("DNI: " + alumno.getDni() +
                                    ", Nombre: " + alumno.getNombreCompleto() +
                                    ", Matrícula: " + alumno.getNumMatricula()));
                }
                case 3 -> {
                    System.out.print("DNI del alumno a actualizar: ");
                    String dni = sc.nextLine();
                    System.out.print("Nuevo nombre completo: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nueva matrícula: ");
                    String matricula = sc.nextLine();
                    if (service.actualizarAlumno(dni, nombre, matricula)) {
                        System.out.println("Alumno actualizado.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                }
                case 4 -> {
                    System.out.print("DNI del alumno a eliminar: ");
                    String dni = sc.nextLine();
                    if (service.eliminarAlumno(dni)) {
                        System.out.println("Alumno eliminado.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                }
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
    }
}
