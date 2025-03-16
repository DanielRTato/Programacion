import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    @DisplayName("59 devuelve F")
    void T59devuelveF() {
        Grader nota = new Grader();
        assertEquals('F', nota.dermineLEttterGrade(59));
    }

    @Test
    @DisplayName("80 devuelve B")
    void T80devuelveB() {
        Grader nota = new Grader();
        assertEquals('B', nota.dermineLEttterGrade(80));
    }

    @Test
    @DisplayName("Un numero negativo lanza una excepcion")
    void negativoLanzaExcepcion() {
        Grader nota = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            nota.dermineLEttterGrade(-1);
        });
    }

    @ParameterizedTest (name = "Cantidad: {0}, Resultado esperado: {1}")
    @CsvSource({
            "90, A",
            "91, A",
            "100, A",
            "99, A"
    })

    void notaMaxima (int nota, char resultado) {
        Grader notaA = new Grader();
        assertEquals('A', notaA.dermineLEttterGrade(nota));
    }




}