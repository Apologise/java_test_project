package java1000��;

import java.util.Arrays;

public class ���鷴ת {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] arr = {1,2,3,4,5,6,7,8,9,0};
		int len = arr.length;
		for(int i = 0;i< len/2; i++){
			int temp = arr[ i ];
			arr[ i ] = arr[ len -1 - i];
			arr[ len -1 - i ] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
