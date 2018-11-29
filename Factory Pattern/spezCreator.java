
public class spezCreator extends Creator{
	 public static void main(String[] args) {
		 String inhalt = "";
		 spezCreator c = new spezCreator();
		 
		 inhalt = c.pizzaMachen();
		 
		 if(inhalt.equals("Diabolo")) {
			 Diabolo d = new Diabolo();
			 d.backen();
		 }
		 if(inhalt.equals("Americana")) {
			 Americana a = new Americana();
			 a.backen();
		 }
		 
	 }
}
