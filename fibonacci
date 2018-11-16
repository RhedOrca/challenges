package challenges;


class FIBO {
	public static int getTerm(int term) {
		int curr = 0;
		int next = 1;
		int temp;
		int i = 1;
		while(i <= term) {
			temp = next;
			next += curr;
			curr = temp;
			i++;
		}
		return curr;
	}
}
public class Main {

	public static void main(String[] args) {
		System.out.println(FIBO.getTerm(72));
	}	
}
