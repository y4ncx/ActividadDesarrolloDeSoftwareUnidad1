package com.y4ncx.actividad.application;

import com.y4ncx.actividad.domain.Alumno;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlumnoServiceTest {
    private AlumnoService service;

    @Before
    public void setUp() {
        service = new AlumnoService();
    }

    @Test
    public void testCrearYObtenerAlumno() {
        service.crearAlumno("123", "Carlos Pérez", "MAT001");
        Alumno alumno = service.obtenerPorDni("123").orElse(null);
        assertNotNull(alumno);
        assertEquals("Carlos Pérez", alumno.getNombreCompleto());
        assertEquals("MAT001", alumno.getNumMatricula());
    }

    @Test
    public void testActualizarAlumno() {
        service.crearAlumno("456", "Ana García", "MAT002");
        boolean actualizado = service.actualizarAlumno("456", "Ana G. Romero", "MAT009");
        assertTrue(actualizado);

        Alumno alumno = service.obtenerPorDni("456").orElse(null);
        assertEquals("Ana G. Romero", alumno.getNombreCompleto());
        assertEquals("MAT009", alumno.getNumMatricula());
    }

    @Test
    public void testEliminarAlumno() {
        service.crearAlumno("789", "Luis Mejía", "MAT003");
        boolean eliminado = service.eliminarAlumno("789");
        assertTrue(eliminado);
        assertFalse(service.obtenerPorDni("789").isPresent());
    }
}
