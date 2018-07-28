package criba;

import java.util.ArrayList;

public class CribaEratostenes {
	private static int  contador,posicion ;
	
	public static ArrayList<Integer> generaCriba(int tope){
		ArrayList<Integer> primos =  new ArrayList<Integer>();
		if (tope >= 2){	
			int dimension = tope+1;
			boolean[] listIsPrimo = initPrimos(dimension);
			searchCompNumbers(listIsPrimo, dimension);
			getPrimos(dimension, listIsPrimo, primos);	 
			
		} 
		
		return primos;
		
	}

	private static void getPrimos(int dim, boolean[] listIsPrimo, ArrayList<Integer> primos) {
		for (contador = 0; contador < dim; contador++){
			if (listIsPrimo[contador])
				primos.add(contador);
		}
		
	}

	private static boolean[] initPrimos(int dimension) {
		boolean[] listIsPrimo = new boolean[dimension];
		
		for (contador = 0; contador < dimension; contador++){
			listIsPrimo[contador] = true;
		}
		listIsPrimo[0] = listIsPrimo[1] = false;
		return listIsPrimo;
	}
	
	private static void searchCompNumbers (boolean[] listIsPrimo, int dimension) {
		for (contador = 2; contador< Math.sqrt(dimension) + 1; contador++){
			if (listIsPrimo[contador]){
				for (posicion = 2*contador; posicion < dimension; posicion+=contador){
					listIsPrimo[posicion] = false;
				}
			}
		}
	}
}
