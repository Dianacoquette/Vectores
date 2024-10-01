import javax.swing.JOptionPane;

public class Ejercicio1Vector {
 private int [] v1;
 private int [] v2;

 private int tamanio;
    //constructor
  public Ejercicio1Vector( int tamanio){

    if (tamanio >0) {
        v1 = new int[tamanio];
        v2 = new int[tamanio];
    }else{
        v1 = new int[1];
        v2 = new int[1];
    }

  }
  //Getters
public int[] getV1() {
    return v1;
}

public int[] getV2() {
    return v2;
}

public int getTamanio() {
    return this.tamanio;
}


//setters
public void setV1(int[] v1) {
    if (v1.length == tamanio) {
        for (int i = 0; i < v1.length; i++) {
            this.v1[i] = v1[i];
        }
    }
}
public void setV2(int[] v2) {
    for (int i = 0; i < v2.length; i++) {
        this.v2[i] = v2[i];
    }
}

public void llenarArreglo1(int arr1[]){
    int i =0;
    while (i < arr1.length) {
                    //va ir poniendo el valor del  arreglo
        arr1 [i] =Integer.parseInt(JOptionPane.showInputDialog("introduce el valor de la posicion ["+(i+1)+"]"+" del arreglo 1 : "));

        i++;
    }
}
public void llenarArreglo2(int arr2[]){
    int i =0;
    while (i < arr2.length) {
                    //va ir poniendo el valor del  arreglo
        arr2 [i] =Integer.parseInt(JOptionPane.showInputDialog("introduce el valor de la posicion ["+(i+1)+"]"+" del arreglo 2 : "));

        i++;
    }
}
public int [] Suma (){
  int [] Suma = new int[tamanio];

    for (int i = 0; i < Suma.length; i++) {

        Suma[i] = v1[i] + v2[i];
        

    }

    return  Suma;
}



    

  
}
