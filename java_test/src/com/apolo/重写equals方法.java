package java1000��;

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
		//�Ƚ�2�������Ƿ�Ϊͬһ������
		if( this == obj) return true;
		//�Ƚ�����һ�������Ƿ�Ϊ��
		if( obj == null)
			return false;
		if( this.getClass() != obj.getClass())
			return false;
		//�Ƚ�2����������Ƿ���ͬ
		Cat cat  = (Cat )obj;//��ǿ��ת��ΪCat����
		return name.equals(cat.name) && color.equals(cat.color) && age==cat.age && weight== cat.weight;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(name + "\n");
		str.append(age +"\n");
		str.append(weight +"\n");
		str.append(color +"\n");
		//���ת��ΪString���͵��ַ���
		return str.toString();
	}
}

public class ��дequals���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("C", 12,123,"��");
		Cat cat2 = new Cat("C++", 12,100,"��");
		Cat cat3 = new Cat("Java", 12,190,"��");
		Cat cat4 = new Cat("Java", 12,190,"��");
		//����Ҫ����toStringҲ�����������Ϊcat���Ѿ���д��
		System.out.println(cat1);
		System.out.println("1��è���2��è���Ƿ���ͬ��" + cat1.equals(cat2));
		System.out.println("1��è���2��è���Ƿ���ͬ��" + cat3.equals(cat4));
		
		
	}

}
