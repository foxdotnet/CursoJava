import static java.lang.System.out;

public class ArreglosMultidimensionales {
    
    public static void main(String[] args) {
        int[][] arregloMultidimensional = {{5,6,7},{8,9,7}};
        
        for(int fila = 0; fila < arregloMultidimensional.length; fila++){
           
            for (int columna = 0; columna < arregloMultidimensional[fila].length; columna++) {
               out.println(arregloMultidimensional[fila][columna]);
            }
            
        }
    }
    
}
