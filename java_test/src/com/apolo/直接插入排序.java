package java1000��;

import java.util.Arrays;

public class ֱ�Ӳ������� {
	public static void insertSort( int nums[ ]){
		int len = nums.length;
		for(int i = 1; i < nums.length; i++){
			int temp = nums[ i ];
			int j;
			//ע������һ��Ҫ��tempp����Ϊnums[i]�Ѿ������ǵ��ˣ�����j>=0һ��Ҫ����temp<nums[j]ǰ�����жϣ�����ᱨindexException
			for( j = i-1 ;j>= 0 && temp < nums[ j ]; j-- ){
				nums[ j+1 ]= nums[ j ];
			}
			nums[ j + 1 ] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] nums={9,8,0,1,4,3,2,7,5,4};
		ֱ�Ӳ�������.insertSort(nums);
		System.out.println(Arrays.toString(nums));
	}

}
