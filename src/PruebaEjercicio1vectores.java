import javax.swing.JOptionPane;

public class PruebaEjercicio1vectores {
public static void main(String[] args) {

    int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del  arrglo"));
    Ejercicio1Vector obj1 = new Ejercicio1Vector(tam);
     
    obj1.llenarArreglo1(obj1.getV1());
    obj1.llenarArreglo2(obj1.getV2());
    
    int[] resultadoSuma = obj1.Suma();

    

    
for (int i = 0; i < resultadoSuma.length; i++) {
    System.out.println(resultadoSuma[i]+"|");
}





}


}

