package challenges;

import java.util.*;

class lines {
	public static boolean intersecter(String first, String second) {
		if (first == second) return true;
		String[] firstset = first.split("x", 2);
		String[] secondset = second.split("x", 2);
		int slope1 = Integer.parseInt(firstset[0]);
		int slope2 = Integer.parseInt(secondset[0]);
		if(slope1 == slope2) {return false;}
		else {return true;}
		
	}
}
public class Main {

	public static void main(String[] args) {
		System.out.println(lines.intersecter("4x+8", "4x-40"));
	}	
}
