package java1000例;

import java.util.Arrays;

public class 直接插入排序 {
	public static void insertSort( int nums[ ]){
		int len = nums.length;
		for(int i = 1; i < nums.length; i++){
			int temp = nums[ i ];
			int j;
			//注意下面一定要用tempp，因为nums[i]已经被覆盖掉了，此外j>=0一定要放在temp<nums[j]前面先判断，否则会报indexException
			for( j = i-1 ;j>= 0 && temp < nums[ j ]; j-- ){
				nums[ j+1 ]= nums[ j ];
			}
			nums[ j + 1 ] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] nums={9,8,0,1,4,3,2,7,5,4};
		直接插入排序.insertSort(nums);
		System.out.println(Arrays.toString(nums));
	}

}
