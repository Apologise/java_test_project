package java1000��;

import java.util.Arrays;

public class �������� {
	public static void quickSort(int [ ] nums, int left, int right){
		int i = left, j = right, privot;
		if(left < right){
			privot = nums[ left ];
			while( i != j){
			    privot = nums[left];
				while(nums[ i ] < privot && i < j) i++;
				while(nums[  j ] > privot && i < j) j--;
				int temp = nums[ i ];
				nums[ i ] = nums[ j ];
				nums[ j ] = temp;
			}
			nums[ i ] = privot;
			//���������
			quickSort(nums, left , i - 1 );
			//���ұ߽�������
			quickSort(nums, i+1, right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] nums = {1,2,5,3,6,0,8,9,21,12};
		��������.quickSort(nums, 0, nums.length-1);
		System.out.printf(Arrays.toString(nums));
	}

}
