package java1000��;


  abstract class Car{
	  public abstract String getInfo();
}
  
 class BMW extends Car{
	 @Override
	 public String getInfo(){
		 return "BMW";
	 }
 }
 
 class Benz extends Car{
	 @Override
	 public String getInfo(){
		 return "Benze";
	 }
 }
 
 class CarFactory{
	 public static Car getCar( String name){
		 if("BMW".equalsIgnoreCase(name)) return new BMW();
		 if("Benz".equalsIgnoreCase(name)) return new Benz();
		 return null;
			}
 }
		 
	 
 
 
public class ����ģʽ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�˿�Ҫ���BMW");
		Car bmw = CarFactory.getCar("BMW");
		System.out.println("��ȡ�������ǣ�"+ bmw.getInfo());
		System.out.println("�û�Ҫ��ĳ�����Benz");
		Car benz = CarFactory.getCar("Benz");
		System.out.println(benz.getClass().getName());
		System.out.println(bmw.getClass().getName());
		System.out.println("�û���õĳ�����"+benz.getInfo());
	}

}
