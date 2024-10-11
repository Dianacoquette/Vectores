public class TestMatricesEnteras {
    public static void main(String[] args) {
        //pruebas de matrices
        //hacer objeto
    //nombre de clase  //identificador //constructor
        int tam = 4;
        MatrizEntera obj1 = new MatrizEntera(3);
        
        //objeto 2
        MatrizEntera obj2 = new MatrizEntera(-2);
    
        MatrizEntera obj3 = new MatrizEntera(tam);
        
       

    
    
        //objeto 1
        System.out.println(obj1.getTamanio());
        //objeto 2
        System.out.println(obj2.getTamanio());
    
            //sale direccion de memoria (sale mal)
        // System.out.println(obj1.getMa());
        // System.out.println(obj2.getMa());
    
    
        //crear matriz
    
        int [][] ma1 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        int [][] ma2 = {{2,3},{4,5}};
    
        obj1.setMa(ma1);
        obj2.setMa(ma2);
        
    
        System.out.println(Imprimir(ma1));
        System.out.println(Imprimir(ma2));
        //matriz 
        System.out.println(Imprimir(obj3.Matrizcu()));

       
       
    
        // //matriz 1
        // for (int i = 0; i < obj1.getMa().length; i++) { //recorrer fila
        //     for (int j = 0; j < obj1.getMa()[0].length; j++) {//recorrer columna
        //         System.out.print(obj1.getMa()[i][j]+"|");
        //     }
        //     System.out.println();//para bajas a la fila que sigue(salto de linea)
        // }
    
        // System.out.println();
        // //matriz 2
        // for (int i = 0; i < obj2.getMa().length; i++) {
        //     for (int j = 0; j < obj2.getMa()[0].length; j++) {
        //         System.out.print(obj2.getMa()[i][j]+"|");
        //     }
        //     System.out.println();
        // }
    }
    
    public static String Imprimir(int [][] m){
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
    
