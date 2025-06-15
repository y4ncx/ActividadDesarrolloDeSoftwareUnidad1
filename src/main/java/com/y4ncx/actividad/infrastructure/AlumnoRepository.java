package com.y4ncx.actividad.infrastructure;

import com.y4ncx.actividad.domain.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlumnoRepository {
    private final List<Alumno> alumnos = new ArrayList<>();

    public void guardar(Alumno alumno) {
        alumnos.add(alumno);
    }

    public List<Alumno> listar() {
        return alumnos;
    }

    public Optional<Alumno> buscarPorDni(String dni) {
        return alumnos.stream().filter(a -> a.getDni().equals(dni)).findFirst();
    }

    public boolean actualizar(Alumno alumno) {
        Optional<Alumno> existente = buscarPorDni(alumno.getDni());
        if (existente.isPresent()) {
            existente.get().setNombreCompleto(alumno.getNombreCompleto());
            existente.get().setNumMatricula(alumno.getNumMatricula());
            return true;
        }
        return false;
    }

    public boolean eliminar(String dni) {
        return alumnos.removeIf(a -> a.getDni().equals(dni));
    }
}
