public class TestVectores3 {
public static void main(String[] args) {
    //crear un objeto
                        //constructor
    Ejercicio3 v1 = new Ejercicio3(3);

    //crear vector inicial
    int [] vector = {3,5,10};
   
    v1.setVector(vector);
    
    String resultado = " ";
resultado = "VECTOR ORIGINAL: "+VectorFormateado(v1.getVector())+

"\n VECTOR INVERSO: "+VectorFormateado(v1.invertirVector()) ;

System.out.println(resultado);

//cuando un codigo se repite demasiado es mejor hacer un metodo 




}

public static String VectorFormateado(int [] v1){

    String formato = "[ ";

    for (int i = 0; i < v1.length; i++) {
        if (i == v1.length - 1) {
            formato+= v1[i];
            
        }else{
            formato+= v1[i]+";";
        }
    }
    formato+= " ]";

    return formato;
}
}
