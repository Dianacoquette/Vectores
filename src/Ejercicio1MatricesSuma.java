public class Ejercicio1MatricesSuma {
    private int [][] m1;
    private int [][] m2;
    private int tamanio;
    public Ejercicio1MatricesSuma(int tamanio) {
        if (tamanio > 0) {
            this.tamanio = tamanio;
            m1 = new int[tamanio][tamanio];
            m2 = new int[tamanio][tamanio];
        } else {
            this.tamanio = 2;
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

    public int [][] sumarMatrices(){
        int [][] suma = new int[tamanio][tamanio];

        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                suma[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return suma;
        
    }

    public String ImprimirSuma(int [][] m){
        String salida = "";
        for (int i = 0; i < m.length; i++) {
            salida += "[";
            for (int j = 0; j < m[0].length; j++) {
    
                if (j == m[0].length-1) {
                    salida += m[i][j];
                }else{
    
                    salida += m[i][j]+",";
                }
            
    
    
            }
            salida+= "] \n";
            
            }
            return salida;
    }
    
    


}
