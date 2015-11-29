
public class Majster {
	
	private KopaczRowowInterface kopaczRowowInterface;

	public KopaczRowowInterface getKopaczRowowInterface() {
		return kopaczRowowInterface;
	}

	public void setKopaczRowowInterface(KopaczRowowInterface kopaczRowowInterface) {
		this.kopaczRowowInterface = kopaczRowowInterface;
	}

	public Majster(KopaczRowowInterface kopaczRowowInterface) {
		this.kopaczRowowInterface = kopaczRowowInterface;
	}
	
	public void kopRow(){
		this.kopaczRowowInterface.kopRow();
	}
	
	

}
