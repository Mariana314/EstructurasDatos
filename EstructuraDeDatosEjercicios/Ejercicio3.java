package EstructuraDeDatosEjercicios;
import java.util.Hashtable;

public class Ejercicio3 {

	public static void main(String[] args) {
		  Hashtable<String, Integer> hashtable = new Hashtable<>();
	        hashtable.put("uno", 1);
	        hashtable.put("dos", 2);
	        hashtable.put("tres", 3);

	        int value = hashtable.get("dos");
	        System.out.println("Valor para la clave 'dos': " + value);

	}

}
