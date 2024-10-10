public class Ejercicio3MultiplicacionDeMatrices {
    private int [][] m1;
    private int [][] m2;
    private int tamanio;
    public Ejercicio3MultiplicacionDeMatrices(int tamanio) {
        if (tamanio > 0) {
            m1 = new int[tamanio][tamanio];
            m2 = new int[tamanio][tamanio];
        } else {
            m1 = new int[2][2];
            m2 = new int[2][2];
        }
    }
    


    //getters
    public int[][] getM1() {
        return m1;
    }
    public int[][] getM2() {
        return m2;
    }
    public int getTamanio() {
        return tamanio;
    }


    //setters
    public void setM1(int[][] m1) {
        if (m1.length == this.tamanio &&  m1[0].length == this.m1[0].length) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    this.m1[i][j] = m1[i][j];
                }
            }
        }
    }
    public void setM2(int[][] m2) {
        if (m2.length == this.tamanio && m2[0].length == this.m2[0].length) {
            for (int i = 0; i < m2.length; i++) {
                for (int j = 0; j < m2.length; j++) {
                    this.m2[i][j] = m2[i][j];
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

    public int [][] MultiplicarMatrices(){
        int[][] resultado = new int[tamanio][tamanio];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                resultado [i][j] = 0;
                for (int j2 = 0; j2 < resultado.length; j2++) {
                    resultado[i][j] += m1[i][j2]*m2[j2][j];
                }
               
            }
        }
        return resultado;
    }
}
