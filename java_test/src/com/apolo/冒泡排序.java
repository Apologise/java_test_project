package java1000��;

import java.util.Arrays;

public class ð������ {
	public static void bubbleSort(int nums[ ]){
		int len = nums.length;
		for(int i = 0; i<=len-1; i++ ){
			for(int j = 0; j < len-1; j++ ){
				if(nums[j] > nums[ j + 1 ]){
					int temp = nums [ j ];
					nums[ j ] = nums[ j + 1 ];
					nums[ j+ 1 ] = temp; 
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] nums = {1,4,6,2,3,8,9,0};
		ð������.bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
