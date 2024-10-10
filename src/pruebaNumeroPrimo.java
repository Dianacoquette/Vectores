import javax.swing.JOptionPane;

public class pruebaNumeroPrimo {
public static void main(String[] args) {
    int tam = Integer.parseInt(JOptionPane.showInputDialog("ingresa el tamaño del arreglo: ")) ;

    Ejercicio6VectoresPrimos v1 = new Ejercicio6VectoresPrimos(tam);

    int [] vector = new int[tam];
    
    llenarArreglo(vector);
    for (int i = 0; i < vector.length; i++) {
        System.out.println(vector[i]);
    }
    v1.setVector(vector);
    
    v1.NumerosPrimos();

    
}

public static void llenarArreglo(int [] arr){

    for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(JOptionPane.showInputDialog("ingresa el valor ["+(i+1)+"] :"));
    }
}

}
