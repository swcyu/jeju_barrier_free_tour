package project3;

public class CRequestDTO {

	
	private String rname;
	private String rmail;
	private String rplace;
	private String rreason;
	private String rdate;
	private String rnote;
	
	
	
	
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRmail() {
		return rmail;
	}
	public void setRmail(String rmail) {
		this.rmail = rmail;
	}
	public String getRplace() {
		return rplace;
	}
	public void setRplace(String rplace) {
		this.rplace = rplace;
	}
	public String getRreason() {
		return rreason;
	}
	public void setRreason(String rreason) {
		this.rreason = rreason;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getRnote() {
		return rnote;
	}
	public void setRnote(String rnote) {
		this.rnote = rnote;
	}
	
	@Override
	public String toString() {
		
		String str =  String.format("%6s / %6s / %6s / %6s / %6s / %6s",
				rname,rmail,rplace,rreason,rdate,rnote);
		
		return str;
	}
	
}
