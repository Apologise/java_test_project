package java1000例;

import java.util.Random;
import java.util.TreeSet;

public class Set不重复组合 {

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
		System.out.println("生成的随机数如下：");
		for( int value: array) System.out.println(value);
		
	}

}
