package quiz;

public class gugudanTest {
	public static void main(String[] args) {
		gugudan ggd = new gugudan();

		System.out.println("Start");
//		ggd.print(2);
//		System.out.println("-".repeat(15));
//		ggd.print(3);
//		System.out.println("-".repeat(15));
//		ggd.print(4);
//		System.out.println("-".repeat(15));
		ggd.random();
		System.out.println("-".repeat(15));
		ggd.hori();
		System.out.println("-".repeat(15));
		ggd.three();
		System.out.println("-".repeat(15));
		System.out.println("End");
	}

}
