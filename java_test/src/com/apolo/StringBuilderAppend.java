package java1000Àý;

public class StringBuilderAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "yanghao,are,you,a,kid?";
		StringBuilder sBuilder = new StringBuilder();
		String[ ] str1 = str.split(",");
		for( String element: str1){
			sBuilder.append(element);
		}
		
		System.out.println(sBuilder);
		System.out.println(sBuilder.toString());
	}

}
