import java.util.ArrayList;

public class Diabolo implements Product{
	ArrayList<String> zutaten = new ArrayList<>();

	@Override
	public void backen() {
		System.out.println("Eine Pizza Diabolo wird gebacken!");
		System.out.println("Sie ist mit folgenden Zutaten belegt: ");
		belegen();
		for(String s: zutaten) {
			System.out.println(s);
		}
	}

	@Override
	public void belegen() {
		zutaten.add("260g Teig");
		zutaten.add("100g Tomatensauce");
		zutaten.add("55g Emmentaler");
		zutaten.add("30g Gouda");
		zutaten.add("5 Scheiben scharfe Salami");
		zutaten.add("1 EL scharfes Öl");
	}

}
