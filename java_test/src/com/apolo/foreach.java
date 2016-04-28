package java1000例;

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
		System.out.println("遍历集合：");
		for(String string :list){
			System.out.println(string);
		}
		System.out.println();
		String [] strs=new String[list.size()];
		list.toArray(strs);
		System.out.println("foreach 遍历数组");
			for(String string:strs){
				System.out.println(string);
			}
	}

}
