package criba;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> criba = CribaEratostenes.generaCriba(5);
		
		for(int primo : criba) {
			System.out.println(primo);
		}

	}

}
