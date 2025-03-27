package Model;

public class User {
	private int id;
	String tckn, sifre, ad, type;
	
	public User(int id, String tckn, String sifre, String ad, String type) {
		this.id = id;
		this.tckn = tckn;
		this.sifre = sifre;
		this.ad = ad;
		this.type = type;
	}
	public User() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTckn() {
		return tckn;
	}
	public void setTckn(String tckn) {
		this.tckn = tckn;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
