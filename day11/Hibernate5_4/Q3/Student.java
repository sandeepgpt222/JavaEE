package mypack;
import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Student implements Serializable {
	private int rollno;
	private String name, address;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
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
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
