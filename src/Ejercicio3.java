public class Ejercicio3 {
    private int [] vector;
    private int tamaño;
    public Ejercicio3(int tamaño) {
        //validar tamaño
        if (tamaño >0) {
            this.tamaño = tamaño;
        }else{
            this.tamaño = 1;
        }

        //instanciar vector
        this.vector = new int [tamaño];
    }

    //getter and setters de tamaño
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = (tamaño > 0) ?this.tamaño = tamaño :1;
    }

    //getter and setters del vector

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        if (vector.length == this.tamaño) {
            
            for (int i = 0; i < vector.length; i++) {
                this.vector[i] = vector[i];
                
            }
        }
    }

    //METODO DE TRABAJO

    public int [] invertirVector (){
        int j = 0;//valor inicial de vector inverso
        int [] vectorInverso = new int[tamaño];
        for (int i = this.tamaño-1; i >= 0; i--) {
            vectorInverso [j] = this.vector[i];
            j++;
        }
        return vectorInverso;
    }

    

    
}
