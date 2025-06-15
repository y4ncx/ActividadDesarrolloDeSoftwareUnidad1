package com.y4ncx.actividad.application;

import com.y4ncx.actividad.domain.Alumno;
import com.y4ncx.actividad.infrastructure.AlumnoRepository;

import java.util.List;
import java.util.Optional;

public class AlumnoService {
    private final AlumnoRepository repo = new AlumnoRepository();

    public void crearAlumno(String dni, String nombre, String matricula) {
        repo.guardar(new Alumno(dni, nombre, matricula));
    }

    public List<Alumno> obtenerAlumnos() {
        return repo.listar();
    }

    public boolean actualizarAlumno(String dni, String nuevoNombre, String nuevaMatricula) {
        return repo.actualizar(new Alumno(dni, nuevoNombre, nuevaMatricula));
    }

    public boolean eliminarAlumno(String dni) {
        return repo.eliminar(dni);
    }

    public Optional<Alumno> obtenerPorDni(String dni) {
        return repo.buscarPorDni(dni);
    }
}
