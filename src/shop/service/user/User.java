package shop.service.user;

public class User {
	//Field
	private String name;
	String address;
	protected boolean gender;
	public String hp;
	public static final String nationality="¥Î«—πŒ±π";

	public User(String name, String address, boolean gender, String hp) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Client [name=");
		buffer.append(name);
		buffer.append(", address=");
		buffer.append(address);
		buffer.append(", gender=");
		buffer.append(gender);
		buffer.append(", hp=");
		buffer.append(hp);
		buffer.append("]");
		return buffer.toString();
	}

}
