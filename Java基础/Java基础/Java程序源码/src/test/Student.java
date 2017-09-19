package test;

public class Student {
	
	private int sid;
	private String sname;
	private int sage;
	private String ssex;
	private double balance;
	private int sgife;
	private String username;
	private String password;
	private int status;

	public Student(int sid2, String sname2, String ssex2, int sage2, String username2, String password2, double balance2, int sgife2, int status2) {
		super();
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage
				+ ", ssex=" + ssex + ", balance=" + balance + ", sgife="
				+ sgife + ", username=" + username + ", password=" + password
				+ ", status=" + status + "]";
	}

	public Student(String sname, int sage, String ssex, double balance,
			String username, String password) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.ssex = ssex;
		this.balance = balance;
		this.username = username;
		this.password = password;
	}

	public Student(String sname2, int sage2, String ssex2, String unsername, String passerword, double balance2) {
		super();
	}

	public Student(String sname, int sid, int sage, String ssex, double balance, int sgife, String username, String password, int status) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.ssex = ssex;
		this.balance = balance;
		this.sgife = sgife;
		this.username = username;
		this.password = password;
		this.status = status;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getSgife() {
		return sgife;
	}

	public void setSgife(int sgife) {
		this.sgife = sgife;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	public int getStatus() {
	
		return status;
	}

}
