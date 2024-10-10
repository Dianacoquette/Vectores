public class Ejercicio5ValorMaximoMinimo {
    private int [] vector;
    private int tamanio;
    public Ejercicio5ValorMaximoMinimo(int tamanio ){
        if (tamanio > 0) {
            this.tamanio = tamanio;
        }else{
            this.tamanio = 1;
        }


    }
    
    //setter y getter de tamanio
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

    
    //setter y getters del vector
    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }


    //METODO DE TRABAJO

    public int elementoMaximo(){
        int max = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i == 0) {
                max = vector[i];
            }else if (vector [i] > max) {
                max = vector [i];
            }
        }
        return max;
    }

    public int elementoMinimo(){
        int min = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i ==  0) {
                min = vector[i];
            }else if (vector[i] < min) {
                min = vector[i];
            }
        }
        return min;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "el valor maximo del vector es : "+this.elementoMaximo()+"\n El elemento menor del vector es: "+this.elementoMinimo();
    }
    
    
}
