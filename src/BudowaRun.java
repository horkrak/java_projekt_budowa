
public class BudowaRun {
	
	public static void main(String ... args)
	{
		System.out.println("\nMajster zaciagnal do pracy Czlowieka:\n");
		Majster majster = new Majster(new Robotnik());
		majster.kopRow();
		
		System.out.println("\nMajster zmienil KopaczaRowow na Koparke\n");
		majster.setKopaczRowowInterface(new Koparka());
		majster.kopRow();
	}

}
