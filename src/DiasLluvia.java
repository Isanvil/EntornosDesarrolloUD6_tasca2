public class DiasLluvia {

    private boolean[][] calendarioLluvia;

    public DiasLluvia() {
        this.calendarioLluvia = new boolean[12][31];
    }

    public boolean registroDia(int dia, int mes, boolean lluvia){
        if (dia <= 31 && dia >= 1 && mes <= 12 && mes >= 1){
            calendarioLluvia[dia][mes] = lluvia;
            return true;
        }
        return false;
    }

    public boolean consultarDia (int dia, int mes){
        if (dia <= 31 && dia >= 1 && mes <= 12 && mes >= 1){
            if (calendarioLluvia[dia][mes] == true){
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
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;

        for (int i = 0; i < calendarioLluvia.length; i++) {
            for (int j = 0; j < calendarioLluvia[i].length; j++) {
                if ((i >= 0 && i <= 2) && calendarioLluvia[i][j] == true) {
                    contador1++;
                } else if ((i >= 3 && i <= 5) && calendarioLluvia[i][j] == true) {
                    contador2++;
                } else if ((i >= 6 && i <= 8) && calendarioLluvia[i][j] == true) {
                    contador3++;
                } else if ((i >= 9 && i <= 11) && calendarioLluvia[i][j] == true) {
                    contador4++;
                }

            }
        }

        if(contador1 > contador2 && contador1 > contador3 && contador1 > contador4){
            return 1;
        } else if (contador2 > contador3 && contador2 > contador4){
            return 2;
        } else if (contador3 > contador4){
            return 3;
        } else {
            return 4;
        }
    }


}
