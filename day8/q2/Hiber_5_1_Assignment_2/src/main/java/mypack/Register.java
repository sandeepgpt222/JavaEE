package mypack;

import javax.persistence.*;

@Entity
@Table(name = "register")
public class Register {
	private int id;
	private String name,address,email,login,password;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", login="
				+ login + ", password=" + password + "]";
	}

	
}
