package hiberpack;

import javax.persistence.*;


@Entity
@Table(name = "student")
public class Student {
	private int rollno;
	private String name;
	private int age;
	private String address;
	
	public Student() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
