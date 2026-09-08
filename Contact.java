import java.io.Serializable;

public class Contact implements Serializable {

	public String firstName;
	public String lastName;
	public String phoneNum;
	public String email;
	public String address;
	
	
	public Contact() {
		this.setFirstName("");
		this.setLastName("");
		this.setPhoneNum("");
		this.setEmail("");
		this.setAddress("");
	}
	
	public Contact(String first, String last, String phone, String email, String address) {
		this.setFirstName(first);
		this.setLastName(last);
		this.setPhoneNum(phone);
		this.setEmail(email);
		this.setAddress(address);
	}

	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + ", " + this.getAddress() + ", " + 
				this.getEmail() + ", " + this.getPhoneNum();
	}
	
	public boolean equals(Contact c) {
		boolean eq = false;
		if (this.getFirstName() == c.getFirstName()) {
			if (this.getLastName() == c.getLastName()) {
				if (this.getPhoneNum() == c.getPhoneNum()) {
					eq = true;
				}
			}
		}
		return eq;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}


	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
