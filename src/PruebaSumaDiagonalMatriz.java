import javax.swing.JOptionPane;

public class PruebaSumaDiagonalMatriz {
public static void main(String[] args) {
    int tam = Integer.parseInt(JOptionPane.showInputDialog("introduce el tamaño de la matriz: "));
    Ejercicio4MatrizSumaDeDiagonal m1 = new Ejercicio4MatrizSumaDeDiagonal(tam);

    int [][] ma = new int[tam][tam];
    llenarMatrices(ma);
    System.out.println(Imprimir(ma));
    m1.setMatriz(ma);
System.out.println("set:");
    System.out.println(Imprimir(ma));

    System.err.println(m1.SumaMatrizDiag());
    
    

}
public static void llenarMatrices(int [][] m){
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[0].length; j++) {
            m[i][j]= Integer.parseInt(JOptionPane.showInputDialog("introduce el valor del elemento ["+i+"]"+" ["+j+"] :"));
        }
    }
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
