
public class Koparka implements KopaczRowowInterface, Obserwator{

	@Override
    public String kopRow() {
        return "Kopie szybko ale g³oœno!!!";
    }

    @Override
    public String toString() {
        return " Jestem kooopaara!";
    }
	
	public void uaktualnij(String string) {
		System.out.println("Podgl¹dacz 2:  " + string );
	}

}
