/*import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {
    private static ContaCorrente conta;

    @BeforeAll
    static void setUp() {
        conta = new ContaCorrente("Daniel", "12345678Z", 1000, "123");
    }
//
    @Test
    void sacarDinero() {
        assertTrue(conta.SacarDinero(20));
        assertEquals(980, conta.getSaldo());
    }

    @Test
    void ingresarDinero() {
        assertTrue(conta.ingresarDinero(500));
        assertEquals(1500, conta.getSaldo());
    }

    @ParameterizedTest(name = "Cantidad: {0}, Resultado esperado: {1}")
    @CsvSource({
            "0, 100",
            "1, 99",
            "10, 90"
    })
    void sacarDinero(int cantidad, int resultado) {
        ContaCorrente nueva = new ContaCorrente("Juan", "12345678Z", 100.0, "50sp");
        nueva.SacarDinero(cantidad);
        assertEquals(resultado, nueva.getSaldo());

}
}*/