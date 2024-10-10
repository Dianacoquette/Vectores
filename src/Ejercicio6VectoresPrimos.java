public class Ejercicio6VectoresPrimos {
    private int [] vector;
    private int tamanio;

public Ejercicio6VectoresPrimos(int tamanio){
    if (tamanio > 0) {
        vector = new int[tamanio];
    }else{
        vector = new int[tamanio];
    }
}


//getters y setter de vector
public int[] getVector() {
    return vector;
}

public void setVector(int[] vector) {
   this.vector = vector;
}
//getter y seters de tamaño
public int getTamanio() {
    return tamanio;
}

public void setTamanio(int tamanio) {
    if (tamanio >0) {
        this.tamanio = tamanio;
    }else{
        this.tamanio = 1;
    }
}

    public void NumerosPrimos(){
        for (int i = 0; i < this.vector.length; i++) {
            if (esPrimo(vector[i])) {
                System.out.println(vector[i]+" es primo");
            } else {
                System.out.println(vector[i]+" no es primo");
            }
        }
    }

    private boolean esPrimo(int valor){
      if (valor <= 1) {
         return false;
      }
        for (int i = 2; i < Math.sqrt(valor); i++) {
            if (valor % i == 0) {
                return false;
            }
        }

        return true;
    }
    

}
