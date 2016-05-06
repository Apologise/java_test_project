package java1000Àı;

class Ancestor{
	private String prescription = "ÄÓÄÓ";
	protected String getPrescription( ) {
		return prescription;
	}
}

public class ¼Ì³Ğ  extends Ancestor{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		¼Ì³Ğ test = new ¼Ì³Ğ();
		System.out.println("»ñµÃ×æÏÈµÄÖ¹Í´Ò©·½:");
		System.out.println(test.getPrescription());
	}

}
