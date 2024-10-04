import javax.swing.JOptionPane;

public class PruebaMaxMin {
public static void main(String[] args) {
    int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo: "));
    Ejercicio5ValorMaximoMinimo ve = new Ejercicio5ValorMaximoMinimo(tam);

    int vector [] = new int[tam];
    llenarArreglo(vector);

    ve.setVector(vector);
    

    JOptionPane.showMessageDialog(null, "El elemento mayor es: "+ve.elementoMaximo()+
    "\n"+"El elemento menor es: "+ve.elementoMinimo());
    

    
}

    public static void llenarArreglo(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento en la posicion [ "+(i+1)+"]: "));
        }

    }
}
