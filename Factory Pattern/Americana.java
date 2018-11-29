import java.util.ArrayList;

public class Americana implements Product{
	ArrayList<String> zutaten = new ArrayList<>();

	@Override
	public void backen() {
		System.out.println("Eine Pizza Americana wird gebacken!");
		System.out.println("Sie ist mit folgenden Zutaten belegt: ");
		belegen();
		for(String s: zutaten) {
			System.out.println(s);
		}
	}

	@Override
	public void belegen() {
		zutaten.add("220g Teig");
		zutaten.add("130g Tomatensauce");
		zutaten.add("50g Mozzarella");
		zutaten.add("5 Scheiben Salami");
	}
}
