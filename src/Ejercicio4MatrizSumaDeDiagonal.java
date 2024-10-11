public class Ejercicio4MatrizSumaDeDiagonal {
    private int [][] matriz;
    private int tamanio;

    public Ejercicio4MatrizSumaDeDiagonal(int tamanio){
        if (tamanio > 0) {
            this.tamanio = tamanio;
            matriz = new int[tamanio][tamanio];
        }else{
            this.tamanio = 2;
            matriz = new int[2][2];
        }
    }


    //getters
    public int[][] getMatriz() {
        return matriz;
    }

    
    public int getTamanio() {
        return tamanio;
    }

    //setters
    public void setMatriz(int[][] matriz) {

        if (matriz.length == this.tamanio && matriz[0].length == this.matriz[0].length) {

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    this.matriz[i][j] = matriz[i][j];
                }
            }
        }
    }
    public void setTamanio(int tamanio) {
        if (tamanio > 0) {
            this.tamanio = tamanio;
        } else {
            this.tamanio = 2;
        }
    }

    public int SumaMatrizDiag(){
        int suma = 0;
    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               if (i == j) {
                   suma += matriz[i][j];

               }
            }
        }
    
    
        return suma;
    }

    

}
