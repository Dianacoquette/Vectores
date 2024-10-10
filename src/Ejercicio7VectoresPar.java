public class Ejercicio7VectoresPar {
    private int [] v1;

    private int tamanio;

    public Ejercicio7VectoresPar(int tamanio) {
       if (tamanio > 0) {
        v1 = new int[tamanio];
       } else {
        v1 = new int[1];
       }
    }

    public int[] getV1() {
        return v1;
    }

    public void setV1(int[] v1) {
        this.v1 = v1;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        if (tamanio > 0) {
            this.tamanio = tamanio;
        } else {
            this.tamanio = 1;
        }
    }

    //metodos de implementacion

    private boolean esPar(int valor){
        if (valor % 2 != 0){
            return false;
        }
        return true;
    }

    public void NumerosPares(){
        for (int i = 0; i < v1.length; i++) {
            if (esPar(v1[i])) {
                System.out.println(v1[i]+" es par");
            } else {
                System.out.println(v1[i]+" no es par");
            }
        }
    }

    
}
