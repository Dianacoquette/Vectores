import javax.swing.JOptionPane;

public class PruebaEjercicio2 {
public static void main(String[] args) {
    int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del  arreglo: "));
    Ejercicio2ProductoEscalar v1 = new Ejercicio2ProductoEscalar(tam);

    v1.llenarArreglo1(v1.getV1());

    v1.llenarArreglo2(v1.getV2());

    
}
}

