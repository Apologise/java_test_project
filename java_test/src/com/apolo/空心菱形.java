package com.apolo;

public class �������� {
//������ѧ��ϵ���4��*����֮��Ĺ�ϵ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if(i == j+2 || i == -j+2 || i == -j+6 || i == j-2){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
