
public class Main {

	public static void main(String[] args) {
		Lamp A = new Lamp();
		
		Lamp B = new Lamp();
		
		System.out.println(A.LampIsOn());
		System.out.println(B.LampIsOn());
		
		A.on();
		
		System.out.println(A.LampIsOn());
		System.out.println(B.LampIsOn());
		}

}
