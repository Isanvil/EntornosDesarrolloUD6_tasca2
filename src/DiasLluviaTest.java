import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DiasLluviaTest {
    @Test
    public void testDia32Mes1True_devuelveFalse(){
        DiasLluvia d = new DiasLluvia();
        assertEquals(false, d.registroDia(32, 1, true));
    }

    @Test
    public void testDia1Mes13True_devuelveFalse(){
        DiasLluvia d = new DiasLluvia();
        assertEquals(false, d.registroDia(1, 13, true));
    }

    @Test
    public void testDia12Mes12False_devuelveTrue(){
        DiasLluvia d = new DiasLluvia();
        assertNotEquals(true, d.registroDia(1, 1, false));
    }
}
