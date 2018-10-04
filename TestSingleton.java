
public class TestSingleton {

	public static void main(String[] args) {
		int alterJ;
		int alterSec;
		String name;
		Singleton ins = Singleton.getInstance();
		name = ins.getName();
		alterJ = ins.getAge();
		alterSec = alterJ*31556952;
		System.out.println(name+" lebt nun schon seit über "+alterSec+" Sekunden.");
	}

}
