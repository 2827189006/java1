package test;

public class Gifes {
	private int gid;
	private String gname;
	private int gife;
	public Gifes() {
		super();
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid=gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname=gname;
	}
	public int getGife() {
		return gife;
	}
	public void setGife(int gife) {
		this.gife=gife;
	}
	public Gifes(String gname, int gife) {
		super();
		this.gname=gname;
		this.gife=gife;
	}
	public Gifes(int gid, String gname, int gife) {
		super();
		this.gid=gid;
		this.gname=gname;
		this.gife=gife;
	}
}

