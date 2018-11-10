import java.util.Random;

public class Main {

	private static spezSub sp = new spezSub();
	private static double rnd;
	private static Random rand;
	
	public static void main(String[] args) {

		spezObsEig eig = new spezObsEig(sp);
		spezObsStaat st = new spezObsStaat(sp);
		spezObsHausverw hw = new spezObsHausverw(sp);
		
		createValue();
	}
	
	public static void createValue() {
		rand = new Random();
		rnd = rand.nextInt(30);
		
		System.out.println(rnd);
		
		sp.setState(rnd);
	}
	
}
