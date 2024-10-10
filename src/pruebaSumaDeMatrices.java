import javax.swing.JOptionPane;

public class pruebaSumaDeMatrices {
public static void main(String[] args) {
    int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de las matrices: "));

    Ejercicio1MatricesSuma m1 = new Ejercicio1MatricesSuma(tam);
    int [][] ma1 = new int[tam][tam];
    llenarMatrices(ma1);
    m1.setM1(ma1);

    int [][] ma2 = new int[tam][tam];
    llenarMatrices(ma2);
    m1.setM2(ma2);
    int [][] mr = m1.sumarMatrices();
    System.out.println(m1.ImprimirSuma(mr));

}

public static void llenarMatrices(int [][] m){
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[0].length; j++) {
            m[i][j]= Integer.parseInt(JOptionPane.showInputDialog("introduce el valor del elemento ["+i+"]"+" ["+j+"] :"));
        }
    }
}


}
