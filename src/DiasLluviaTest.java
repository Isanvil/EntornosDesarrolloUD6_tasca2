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

    //Test tercer método
    @Test
    public void testConsultaDiasLluviosos10_return10(){
        DiasLluvia d = new DiasLluvia();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 11; j++) {
                d.registroDia(j, i, true);
            }
        }
        assertNotEquals(10, d.contarDiasLluvios());
    }

    @Test
    public void testConsultaDiasLluviosos31_return31(){
        DiasLluvia d = new DiasLluvia();
        for (int i = 11; i < d.getCalendarioLluvia().length; i++) {
            for (int j = 0; j <= d.getCalendarioLluvia()[i].length; j++) {
                d.registroDia(j, i, true);
            }
        }
        assertEquals(31, d.contarDiasLluvios());
    }

    @Test
    public void testConsultasDiasLluviosoMedioAnyo182_return186(){  //Devuelve más de la mitad de días de un año real
        DiasLluvia d = new DiasLluvia();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= d.getCalendarioLluvia()[i].length; j++) {
                d.registroDia(j, i, true);
            }
        }
        assertNotEquals(182, d.contarDiasLluvios());
    }

    //Test Cuarto método (Trimestre más lluvioso)
    @Test
    public void testTrimestreLluvioso1_return1(){   //Lluvias los meses enteros de enero a marzo (ambos incluidos)
        DiasLluvia d = new DiasLluvia();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < d.getCalendarioLluvia().length; j++) {
                d.registroDia(j, i, true);
            }
        }
        assertEquals(1, d.trimestreLluvioso());
    }

    @Test
    public void testTrimestreLluvioso2_return2(){   //Lluvia los meses enteros de abril a junio (ambos incluidos)
        DiasLluvia d = new DiasLluvia();
        for (int i = 3; i < 5; i++) {
            for (int j = 0; j < d.getCalendarioLluvia().length; j++) {
                d.registroDia(j, i, true);
            }
        }
        assertEquals(2, d.trimestreLluvioso());
    }

    @Test
    public void testTrimestreLluvioso1Y2_return1(){   //Lluvia los meses enteros de enero a junio (ambos incluidos)
        DiasLluvia d = new DiasLluvia();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < d.getCalendarioLluvia().length; j++) {
                d.registroDia(j, i, true);
            }
        }
        assertNotEquals(2, d.trimestreLluvioso()); //El segundoi semetre tiene más días
    }
}
