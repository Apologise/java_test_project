package java1000例;


/*浅克隆会复制基本类型和不可变的类型，但是其他的引用类型不会复制
 * 比如下面定义的Address
 * */
class Address{
	private String state;
	private String province;
	private String city;
	public Address(String state, String province , String city){
		this.state = state;
		this.province = province;
		this.city = city;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("国家："+ state+"\t");
		str.append("省份："+ province+"\t");
		str.append("城市："+city+"\t");
		return str.toString();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
class Employee  implements Cloneable {
	private String name;
	private int age;
	private Address address;
	public Employee(String name, int age , Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("姓名："+name+"\t");
		str.append("年龄："+age+"\t");
		str.append(address);
		return str.toString();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public Employee clone(){
		Employee employee =  null;
		try{
			employee  = (Employee)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return employee;
	}
}

public class 浅克隆 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("克隆前:");
		Address address = new Address("中国","湖北","武汉");
		Employee employee1 = new Employee("杨浩",21,address);
		System.out.println("员工一的信息");
		System.out.println(employee1);
		System.out.println("克隆后");
		Employee employee2 = employee1.clone();
		employee2.setName("yanghao");
		employee2.setAge(20);
		employee2.getAddress().setState("中国");
		employee2.getAddress().setProvince("江苏");
		employee2.getAddress().setCity("无锡");
		System.out.println("员工一的信息"+employee1);
		System.out.println("员工二的信息"+employee2);
		
	}

}
