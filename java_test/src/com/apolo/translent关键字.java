package com.leetcode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Login implements Serializable{
	public static final long ID = 13452352314512543L;
	private String userName ;
	private transient String passWord;
	public Login(String userName, String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("�û�����"+ userName);
		str.append("���룺"+ passWord);
		return str.toString();
	}
	
	@Override
	public Login clone(){
		Login login = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try{
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			oos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		try{
			ObjectInputStream ois =  new ObjectInputStream(bais);
			try {
				login = (Login)ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ois.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		return login;
	}
	
}

public class translent�ؼ��� {
	public static void main(String[ ] args){
		Login login1 = new Login("mircosoft", "mr");
		System.out.println("�����ԭʼ��Ϣ�ǣ�");
		System.out.println(login1);
		System.out.println("�����¡��Ϣ��");
		Login login2 = login1.clone();
		System.out.println(login2);
	}
}
