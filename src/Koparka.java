
public class Koparka implements KopaczRowowInterface, Obserwator{

	@Override
    public String kopRow() {
        return "Kopie szybko ale g�o�no!!!";
    }

    @Override
    public String toString() {
        return " Jestem kooopaara!";
    }
	
	public void uaktualnij(String string) {
		System.out.println("Podgl�dacz 2:  " + string );
	}

}
