package java1000��;


/*ǳ��¡�Ḵ�ƻ������ͺͲ��ɱ�����ͣ������������������Ͳ��Ḵ��
 * �������涨���Address
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
		str.append("���ң�"+ state+"\t");
		str.append("ʡ�ݣ�"+ province+"\t");
		str.append("���У�"+city+"\t");
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
		str.append("������"+name+"\t");
		str.append("���䣺"+age+"\t");
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

public class ǳ��¡ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��¡ǰ:");
		Address address = new Address("�й�","����","�人");
		Employee employee1 = new Employee("���",21,address);
		System.out.println("Ա��һ����Ϣ");
		System.out.println(employee1);
		System.out.println("��¡��");
		Employee employee2 = employee1.clone();
		employee2.setName("yanghao");
		employee2.setAge(20);
		employee2.getAddress().setState("�й�");
		employee2.getAddress().setProvince("����");
		employee2.getAddress().setCity("����");
		System.out.println("Ա��һ����Ϣ"+employee1);
		System.out.println("Ա��������Ϣ"+employee2);
		
	}

}
