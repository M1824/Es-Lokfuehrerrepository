
public class Singleton {
	private static Singleton instance = null;
	private static int age = 18;
	private static String name = "Marcel";
	private Singleton() {}
	public static Singleton getInstance() {
		if(instance==null) instance = new Singleton();
		return instance;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
