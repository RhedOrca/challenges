package challenges;


class Swap {
	public static void variableSwapper(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x);
		System.out.println(y);
		
	}
}
public class Main {

	public static void main(String[] args) {
		Swap.variableSwapper(2, 4);
	}	
}
