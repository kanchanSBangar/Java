package com.net.maths.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*Pythagoras pythagoras = new Pythagoras();
		double height;
		double width;
		height = 3;
		width = 4;

		System.out.println("Height : " + height);
		System.out.println("Width : " + width);
		System.out.print("Hypotenuse : ");
		System.out.println(pythagoras.calculateHypotenuse(height, width));*/

		String msg1 = "8=FIX.4.291=16335=D49=BLP56=SCHB34=150=3073797=Y52=20000809-20:20:5011=900010081=1003000321=255=TESTA54=138=400040=259=044=3047=I60=20000809-18:20:3210=061";
		String msg2 = "8=FIX.4.29=15335=D49=BLP56=SCHB34=150=3073797=Y52=20000809-20:20:5011=900010081=1003000321=255=TESTA54=138=400040=259=044=3047=I60=20000809-18:20:3210=061";
		
		HashMap<String, String> keySet1 = getKeySet(msg1);
		HashMap<String, String> keySet2 = getKeySet(msg2);	
		
		Set<String> difference1 = difference(keySet1.keySet(), keySet2.keySet());
		Set<String> difference2 = difference(keySet2.keySet(), keySet1.keySet());
		
		if(difference1.equals(difference2)) {
			System.out.println("both are matching");
		} else {
			for(String str : difference1) {
				System.out.println("Key ->"+str+"::"+"Value->"+keySet1.get(str));
			}
			
			for(String str : difference2) {
				System.out.println("Key ->"+str+"::"+"Value->"+keySet1.get(str));
			}
			
		}
		
			

	}
	
	public static <T> Set<T> difference(final Set<T> setOne, final Set<T> setTwo) {
	     Set<T> result = new HashSet<T>(setOne);
	     result.removeIf(setTwo::contains);
	     return result;
	}

	public static HashMap<String, String> getKeySet(String str) {

		HashMap<String, String> map = new HashMap<String, String>();

		String[] parts = str.split("");

		for (String subPart : parts) {
			String[] subParts = subPart.split("=", 2);
			map.put(subParts[0], subParts[1]);
		}

		/*for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}*/
		

		return map;
	}
}
