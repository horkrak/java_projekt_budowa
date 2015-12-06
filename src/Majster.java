import java.util.List;
import java.util.ArrayList;


public class Majster implements Obserwowany {
	
	private KopaczRowowInterface kopaczRowowInterface;
	private List<Obserwator> obserwatorzy = new ArrayList<Obserwator>();
	
	
	public void setKopaczRowowInterface(KopaczRowowInterface kopaczRowowInterface) {
		this.kopaczRowowInterface = kopaczRowowInterface;
		powiadomObserwatorow();
	}
	

	
	 public String kopRow() {

	        return kopaczRowowInterface.kopRow();
	    }
	
	@Override
	public void dodajObserwatora(Obserwator obserwator){
		obserwatorzy.add(obserwator);
	}
	
	@Override
	public void usunObserwatora(Obserwator obserwator){
		obserwatorzy.remove(obserwator);
	}
	
	@Override
	public void powiadomObserwatorow(){
		System.out.println("Kopaczem:   " + kopaczRowowInterface);
		for(Obserwator obs: obserwatorzy){
			obs.uaktualnij(kopRow());
	}
	}
}