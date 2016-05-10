package java1000例;

class Cat{
	private String name;
	private int age;
	private double weight;
	private String color;
	public Cat(String name, int age , double weight, String color){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	@Override
	public boolean equals( Object obj){
		//比较2个对象是否为同一个对象
		if( this == obj) return true;
		//比较其中一个对象是否为空
		if( obj == null)
			return false;
		if( this.getClass() != obj.getClass())
			return false;
		//比较2个对象的域是否相同
		Cat cat  = (Cat )obj;//先强制转换为Cat对象
		return name.equals(cat.name) && color.equals(cat.color) && age==cat.age && weight== cat.weight;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(name + "\n");
		str.append(age +"\n");
		str.append(weight +"\n");
		str.append(color +"\n");
		//最后转换为String类型的字符串
		return str.toString();
	}
}

public class 重写equals方法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("C", 12,123,"黑");
		Cat cat2 = new Cat("C++", 12,100,"灰");
		Cat cat3 = new Cat("Java", 12,190,"白");
		Cat cat4 = new Cat("Java", 12,190,"白");
		//不需要调用toString也可以输出，因为cat中已经重写了
		System.out.println(cat1);
		System.out.println("1号猫咪和2号猫咪是否相同：" + cat1.equals(cat2));
		System.out.println("1号猫咪和2号猫咪是否相同：" + cat3.equals(cat4));
		
		
	}

}
