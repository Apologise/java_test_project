package java1000��;

import java.util.ArrayList;
import java.util.List;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("hij");
		list.add("kmj");
		list.add("nop");
		System.out.println("�������ϣ�");
		for(String string :list){
			System.out.println(string);
		}
		System.out.println();
		String [] strs=new String[list.size()];
		list.toArray(strs);
		System.out.println("foreach ��������");
			for(String string:strs){
				System.out.println(string);
			}
	}

}
