package java1000例;


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
		 
	 
 
 
public class 工厂模式 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("顾客要买的BMW");
		Car bmw = CarFactory.getCar("BMW");
		System.out.println("提取的汽车是："+ bmw.getInfo());
		System.out.println("用户要买的车辆是Benz");
		Car benz = CarFactory.getCar("Benz");
		System.out.println(benz.getClass().getName());
		System.out.println(bmw.getClass().getName());
		System.out.println("用户获得的车辆是"+benz.getInfo());
	}

}
