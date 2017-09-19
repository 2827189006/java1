package test;

public class Books {

	private int bid;
	private String bname;
	private double bprice;
	private int bnumber;
	private int bgifep;
	private int bgifen;
	private int sid;
	private int bstatus;
	public Books() {
		super();
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid=bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname=bname;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice=bprice;
	}
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber=bnumber;
	}
	public int getBgifep() {
		return bgifep;
	}
	public void setBgifep(int bgifep) {
		this.bgifep=bgifep;
	}
	public int getBgifen() {
		return bgifen;
	}
	public void setBgifen(int bgifen) {
		this.bgifen=bgifen;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public int getBstatus() {
		return bstatus;
	}
	public void setBstatus(int bstatus) {
		this.bstatus=bstatus;
	}
	public Books(String bname, double bprice, int bnumber, int bgifep,
			int bgifen, int sid, int bstatus) {
		super();
		this.bname=bname;
		this.bprice=bprice;
		this.bnumber=bnumber;
		this.bgifep=bgifep;
		this.bgifen=bgifen;
		this.sid=sid;
		this.bstatus=bstatus;
	}
}
