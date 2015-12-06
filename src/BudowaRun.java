
public class BudowaRun {
	
	public static void main(String[] args)
	{
		Majster majster = new Majster();
        KopaczRowowInterface robotnik = new Robotnik();
        System.out.println("Majster zaciagnol do pracy Czlowieka\n");
        KopaczRowowInterface koparka = new Koparka();
        
        majster.dodajObserwatora((Obserwator) robotnik);
        majster.dodajObserwatora((Obserwator) koparka);
      
        majster.setKopaczRowowInterface(robotnik);
        
        majster.usunObserwatora((Obserwator) robotnik);
        
        System.out.println("\nMajster zmienil czlowieka na Koparke\n");
        majster.setKopaczRowowInterface(koparka);
        majster.setKopaczRowowInterface(robotnik);
        majster.dodajObserwatora((Obserwator) robotnik);
        majster.usunObserwatora((Obserwator) koparka);
        majster.setKopaczRowowInterface(koparka);
	}

}
