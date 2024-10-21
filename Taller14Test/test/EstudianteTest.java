import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {
    private static Estudiante estudiante;


    @BeforeAll
    static void beforeAll(){
        estudiante = new Estudiante("Juan", 20);
        System.out.println("Empiezan las pruebasa");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("terminan laas pruebas");

    }

    @org.junit.jupiter.api.Test
    void agregarCalificacionTest() {
        estudiante.agregarCalificacion(8.5);
        assertEquals(1, estudiante.getNumeroCalificaciones(), "Debe tener 1 calificación registrada.");
    }

    @org.junit.jupiter.api.Test
    void obtenerPromedioTest() {
        estudiante.agregarCalificacion(7.0);
        estudiante.agregarCalificacion(9.0);
        double promedioEsperado = (8.5 + 7.0 + 9.0) / 3;
        assertEquals(promedioEsperado, estudiante.obtenerPromedio(), 0.01, "El promedio debe ser el esperado.");
    }

    @org.junit.jupiter.api.Test
    void getNumeroCalificacionesTest() {

        assertEquals(2, estudiante.getNumeroCalificaciones(), "Debe tener 3 calificaciones registradas.");
    }

    @org.junit.jupiter.api.Test
    void agregarCalificacionExepcionTest() {
        // Prueba que se lance una excepción cuando la calificación es inválida
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(11);  // Calificación fuera del rango
        });
        assertEquals("La calificación debe estar entre 0 y 10.", exception.getMessage(), "El mensaje de excepción no es el esperado.");
    }

}