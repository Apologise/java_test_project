package java1000��;

class Emperor {
	private static Emperor emperor = null;
	private Emperor( ){
		
	}
	public static Emperor getInstance ( ){
		if(emperor == null){
			return new Emperor();
		}
		else return emperor;
	}
}

public class ����ģʽ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
