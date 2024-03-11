import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DiasLluviaTest {
    //Test primer método
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

    //Test segundo método
    @Test
    public void testConsultaDia20Mes12True_devuelveTrue(){
        DiasLluvia d = new DiasLluvia();
        d.registroDia(20, 12, true);
        assertEquals(true, d.consultarDia(20, 12));
    }

    @Test
    public void testConsultaDia25Mes4False_devuelveFalse(){
        DiasLluvia d = new DiasLluvia();
        d.registroDia(25, 4, false);
        assertEquals(false, d.consultarDia(20, 12));
    }

    @Test
    public void testConsultaDia30Mes2True_devuelvetrue(){
        DiasLluvia d = new DiasLluvia();
        d.registroDia(30, 2, true);
        assertNotEquals(false, d.consultarDia(30, 2));
    }
}
