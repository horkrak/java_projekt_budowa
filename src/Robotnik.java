
public class Robotnik implements KopaczRowowInterface, Obserwator {

    @Override
    public String kopRow() {
        return "Kopie wolno ale tanio";
    }

    @Override
    public String toString() {
        return " Jestem robotnik!";
    }

	@Override
	public void uaktualnij(String string) {
		System.out.println("Podgl¹dacz 1:  " + string );
		
	}

}
