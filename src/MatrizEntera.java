public class MatrizEntera {
    //variables de instancia
    //matriz es con dos []
    private int [][] ma;
    private int tamanio;
    //matrices pueden ser cuadradas o no cuadradas
    //matrices no existen en memoria thi
    //--
    //--
    //constructor da valores iniciales-No tiene valor de retorno y se llama igual que la clase
    public MatrizEntera(int tamanio){
        //la matriz mas pequeña que puedes mandar es de 2x2 (cuadrada)
       if (tamanio >2) {
        this.tamanio = tamanio;
        //crear matriz
        ma = new int [tamanio][tamanio];
       } else{
        
        this.tamanio = 2;
        //crear matrices
        ma = new int [this.tamanio][this.tamanio];
       }
    }
    //get de tamaño
    
    //metodo accesor:
    public int getTamanio() {
        return tamanio;
    }
    //get y set de la matriz
    public int[][] getMa() {
        return ma;
    }
    //metodo Mutador:
    public void setMa(int[][] ma) {
        //la matriz que manda el metodo debe de ser la misma que en la matriz de instancia
    
            //num filas del matriz        //num columnas
        if (ma.length == this.tamanio &&  ma[0].length == this.ma[0].length) {
            //ciclo
            for (int i = 0; i < this.ma.length; i++) {
                for (int j = 0; j < this.ma[0].length; j++) {
                    //i del ciclo de afuera y j del ciclo de adentro
                    this.ma[i][j] = ma[i][j];
                }
            }
        }
        
    }
    
    public int [][] Matrizcu(){
        int [][] Mat = new int[tamanio][tamanio];
    
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat[0].length; j++) {
               if (i == j) {
                    Mat [i][j] = 1;
    
               }else{
                Mat [i][j] = 0;
               }
            }
        }
    
    
        return Mat;
    }
    
    
    
        
    }
    