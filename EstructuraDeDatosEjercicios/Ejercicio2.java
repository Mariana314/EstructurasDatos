package EstructuraDeDatosEjercicios;
import java.util.ArrayList;
public class Ejercicio2 {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        
	        int sum = 0;
	        for (int number : list) {
	            sum += number;
	        }

	        System.out.println("Suma de los elementos del ArrayList: " + sum);

	}

}
