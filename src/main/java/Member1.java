
public class Member1 {
		private String firstname, lastname, email, password, confrimpassword, dateofbirth, mobile;
		public Member1() {
			super();
		}

		public Member1(String firstname, String lastname, String email, String password, String confrimpassword, String dateofbirth, String mobile) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.password = password;
			this.confrimpassword = confrimpassword;
			this.dateofbirth = dateofbirth;
			this.mobile = mobile;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getConfrimpassword() {
			return confrimpassword;
		}

		public void setConfrimpassword(String confrimpassword) {
			this.confrimpassword = confrimpassword;
		}

		public String getDateofbirth() {
			return dateofbirth;
		}

		public void setDateofbirth(String dateofbirth) {
			this.dateofbirth = dateofbirth;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}


}