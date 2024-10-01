import javax.swing.JOptionPane;

public class Ejercicio4NumeroEscalar {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo: "));

        int [] v1p = new int[tam];

        llenarArreglo(v1p);

        int escalar = Integer.parseInt(JOptionPane.showInputDialog("Numero escalar: "));

        int [] res = NumEscalar(v1p, escalar);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+"|");
        }
    }
    public static int [] NumEscalar(int [] v1, int escalar){
            int [] result = new int[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result [i] = v1[i] * escalar;

        }
        return result;
    }
public static void llenarArreglo( int arr[]){
    int i =0;
    while (i < arr.length) {
                    //va ir poniendo el valor del  arreglo
        arr [i] = Integer.parseInt(JOptionPane.showInputDialog("introduce el valor de la posicion ["+(i+1)+"]:"));

        i++;
    }

   
}

}
