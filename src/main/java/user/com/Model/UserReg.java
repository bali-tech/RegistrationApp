package user.com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="USER_REG")
	public class UserReg {
		@Id
		
		@Column(name="USER_ID")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int userId;
		
		   
		    @Column(name="FIRST_NAME")
		    private String firstName;
		
		    @Column(name="LAST_NAME")
			private String lastName;
		    
		    @Column(name="USER_EMAIL")
			private String email;
		    
		    @Column(name="CONTACT")
			private String mobile;
		    
		    @Column(name="PASSWORD")
			private String password;
		    
		    @Column(name="ADDRESS")
			private String address;
			
			
			public UserReg(int userId, String firstName, String lastName, String email, String mobile,
					String password, String address) {
				
				super();
				
				this.userId = userId;
				this.firstName = firstName;
				this.lastName = lastName;
				this.email = email;
				this.mobile = mobile;
				this.password = password;
				this.address = address;
			}

			public UserReg() {
				super();
				
			}

			public int getUserId() {
				return userId;
			}

			public void setUserId(int userId) {
				this.userId = userId;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getMobile() {
				return mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			@Override
			public String toString() {
				return "userRegistration [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
						+ ", email=" + email + ", mobile=" + mobile + ", password=" + password + ", address=" + address
						+ "]";
			}

		}




