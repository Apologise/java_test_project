package java1000��;

import java.util.Random;
import java.util.TreeSet;

public class Set���ظ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random random = new Random();
		for(int count = 0; count <= 10;){
			boolean succeed = set.add(random.nextInt(100));
			if(succeed) count++;
		}
		
		int size = set.size();
		Integer[ ] array = new Integer[ size ];
		set.toArray(array);
		System.out.println("���ɵ���������£�");
		for( int value: array) System.out.println(value);
		
	}

}
