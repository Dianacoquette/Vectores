import javax.swing.JOptionPane;

public class PruebaNumerosPares {
public static void main(String[] args) {
    int tam = Integer.parseInt(JOptionPane.showInputDialog("introduce el tamaño del arreglo"));

    Ejercicio7VectoresPar v1 = new Ejercicio7VectoresPar(tam);

    int [] vector = new int[tam];

    llenarArreglo(vector);
    v1.setV1(vector);
    v1.NumerosPares();

}
public static void llenarArreglo(int [] arr){
    for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del elemento ["+(i+1)+"] :"));

    }
}
}
