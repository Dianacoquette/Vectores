import javax.swing.JOptionPane;

public class TestVectores {
public static void main(String[] args) {
    // double estaturas [] = {1.75,1.80,1.75,1.65};

    //pedir el tamañi del arreglo 
    int tam = Integer.parseInt(JOptionPane.showInputDialog("introduce tamaño del arreglo: "));
    //declarar el arreglo 
    double estaturas [] = new double[tam];
    

    llenarArreglo(estaturas);
    imprimir(estaturas);
    System.out.println();
    System.out.println(obtenerValorMaximo(estaturas));
    
    System.out.println(CalcularMedia(estaturas));
}






                            //vector/arreglo estaturas
public static void imprimir(double arr []){
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+"--> "); //ln es salto de linea
}
}

//metodo que pida los valores del arreglo

public static void llenarArreglo( double arr[]){
    int i =0;
    while (i < arr.length) {
                    //va ir poniendo el valor del  arreglo
        arr [i] = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de la posicion ["+(i+1)+"]:"));

        i++;
    }

   
}

public static double SumarValores(double arr []){
//for
    double sum = 0.0;
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
    }
    return sum;

}

public static double CalcularMedia(double arr []){
    int i = 0;
    double sum = 0.0;
    
    while (i < arr.length) {
        sum += arr[i];
        
        i++;
    }
    double med = sum / arr.length;
    return med;
}


public static double obtenerValorMaximo( double arr []){
    double max = 0.0;
    int i = 0;
    do {
        if (i == 0) {
            max = arr[i];
        } else if (arr[i] > max) {
            max = arr[i];
        }
            
        i++;
    } while (i < arr.length);
        return max;
}





    
//          //declaracion de vetores
//     int tam = 4;
//     int [] x = new int [3];
//     System.out.println(x[1]);
//     int  [] y = new int [tam];
//    System.out.println(y[2]);
//     boolean z1 [];
   
//     z1 = new boolean [4];
//     System.out.println(z1[3]);

//     char x1 [], x2[], x3[]; //declaracion a las vez

//     x1 = new char[tam];
//     tam = 8;
//     x2 = new char[tam];
//     System.out.println(x2[3]);
//     x3 = new char[tam];
//     //default de un char es vacio

//     String zz [] = {"luis","William","Ezequiel","Diana"};
       
//             //controlar excepciones
//         try {
//             System.out.println(zz[3]);
//         } catch (Exception e) {
//             System.out.println("error: "+ex.getMessage());
//         }
//             //cambiar valor
//                 zz[1] = "Mark";
//                 System.out.println(zz[1]);
    
   

 

}

