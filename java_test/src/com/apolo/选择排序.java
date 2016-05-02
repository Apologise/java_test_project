package java1000Àı;

import java.util.Arrays;

public class Ñ¡ÔñÅÅĞò {
	public static void choiceSort(int [ ] nums){
		int len = nums.length;
		for(int i = 0; i< len-1; i++){
			int index = i ;
			for(int j = i+1; j< len; j++){
				if(nums[ j ] < nums[ index ]){
					index = j;
				}
			}
			int temp = nums [ i ];
			nums[ i ] =nums[ index ];
			nums[ index ] = temp; 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] nums = {2,1,7,6,9,0,4,5,3};
		Ñ¡ÔñÅÅĞò.choiceSort(nums);
		System.out.print(Arrays.toString(nums));
	}

}
