public class DiasLluvia {

    private boolean[][] calendarioLluvia;

    public DiasLluvia() {
        this.calendarioLluvia = new boolean[12][31];
    }

    public boolean registroDia(int dia, int mes, boolean lluvia){
        dia--;
        mes--;
        if (dia <= 30 && dia >= 0 && mes <= 11 && mes >= 0 && lluvia){
            calendarioLluvia[mes][dia] = lluvia;
            return true;
        }
        return false;
    }

    public boolean consultarDia (int dia, int mes){
        dia--;
        mes--;
        if (dia <= 30 && dia >= 0 && mes <= 11 && mes >= 0){
            if (calendarioLluvia[mes][dia] == true){
                return true;
            }
        }
        return false;
    }

    public int contarDiasLluvios(){
        int contador = 0;
        for (int i = 0; i < calendarioLluvia.length; i++) {
            for (int j = 0; j < calendarioLluvia[i].length; j++) {
                if (calendarioLluvia[i][j] == true){
                    contador++;
                }
            }
        }
        return contador;
    }

    public int trimestreLluvioso(){
        int trimestre;
        int masLluvioso;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < calendarioLluvia[i].length; j++) {
                if (calendarioLluvia[i][j] == true){
                    contador1++;
                }
            }
        }
        masLluvioso = contador1;
        trimestre = 1;
        for (int i = 3; i < 5; i++) {
            for (int j = 0; j < calendarioLluvia[i].length; j++) {
                if (calendarioLluvia[i][j] == true){
                    contador2++;
                }
            }
        }
        if (contador2 > masLluvioso){
            masLluvioso = contador2;
            trimestre = 2;
        }

        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < calendarioLluvia[i].length; j++) {
                if (calendarioLluvia[i][j] == true){
                    contador3++;
                }
            }
        }
        if (contador3 > masLluvioso){
            masLluvioso = contador3;
            trimestre = 3;
        }

        for (int i = 9; i < 11; i++) {
            for (int j = 0; j < calendarioLluvia[i].length; j++) {
                if (calendarioLluvia[i][j] == true){
                    contador4++;
                }
            }
        }
        if (contador4 > masLluvioso){
            masLluvioso = contador4;
            trimestre = 4;
        }

        return trimestre;
    }

    public int primerDiaLluvia(){
        int contador = 0;
        for (int i = 0; i < calendarioLluvia.length; i++) {
            for (int j = 0; j < calendarioLluvia[i].length; j++) {
                contador++;
                if (calendarioLluvia[i][j] == true){
                    return contador;
                }
            }
        }
        return 0;
    }


}
