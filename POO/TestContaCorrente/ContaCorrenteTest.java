import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {
    private static ContaCorrente conta;

    @BeforeAll
    static void setUp() {
        conta = new ContaCorrente("Daniel", "12345678Z", 1000, "123");
    }

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
}