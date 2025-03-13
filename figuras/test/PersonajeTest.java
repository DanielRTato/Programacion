import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {



    @Test
    @DisplayName("Numeros positivos")
    void valoresPositivos() {
    //
        Personaje pt1 = new Personaje();
        pt1.setVida(1000);
        int dano = 100;

        assertEquals(900,pt1.perderVida(dano));


    }

    @Test
    @DisplayName("Numeros negativos")
    void numeroNegativo(){
        Personaje pt2= new Personaje();
        pt2.setVida(1000);
        int dano1 = -100;
        assertEquals(1000,pt2.perderVida(dano1));
    }
    @Test
    @DisplayName("Dano mayor que vida")
        void danoMayor(){
            Personaje pt3= new Personaje();
            pt3.setVida(1000);
            int dano2 = -100;
            assertEquals(1000,pt3.perderVida(dano2));
    }

    }

