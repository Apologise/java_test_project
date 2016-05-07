package java1000例;

abstract class Shape{
	private String getName(){
		return this.getClass().getSimpleName();
	}
	public abstract double getArea();
}


class Circle extends Shape{
	private  double radius;
	public Circle( double radius ){
		this.radius = radius;
	}
	@Override
	public double getArea(){
		return Math.PI*Math.pow(radius,2);
	}
}

class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle (double length, double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea(){
		return length*width;
	}
}
public class 抽象类方法的重写 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(1);
		System.out.println("图形的名称是："+ circle.getClass());
		System.out.println("图形的面积："+circle.getArea());
		
		Rectangle rectangle = new Rectangle(2,3);
		System.out.println("图形的面积是："+rectangle.getArea());
	}

}
