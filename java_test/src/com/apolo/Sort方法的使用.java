package java1000例;

import java.util.Arrays;

class Employee_ implements Comparable<Employee_>{
	private int  id;
	private String name;
	private int age;
	public Employee_ (int id, String name, int age ){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Employee_ o){
		if( id > o.id )
			return 1;
		else if( id == o.id )
			return 0;
		else return -1;
	}
	
	public String toString(){
		StringBuilder str =new  StringBuilder();
		str.append("id: "+id+",");
		str.append("name: "+name+",");
		str.append("age: "+age+";");
		return str.toString();
	}
}

public class Sort方法的使用 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_ employee1 = new Employee_(1,"Java",12);
		Employee_ employee2 = new Employee_(2,"C",12);
		Employee_ employee3 = new Employee_(3,"C++",12);
		Employee_ [ ] employees = new Employee_[3];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		System.out.println("排序前：");
		for(Employee_  e : employees ){
			System.out.println(e);
		}
		Arrays.sort(employees);
		System.out.println("排序后：");
		for(Employee_ e : employees){
			System.out.println(e);
		}
		
	}

}
