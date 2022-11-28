package project3;

public class AreaDTO {
	
	private String name;
	private String mtype;
	private String mtitile;
	private int msize;
	private String madd;
	private String mtel;
	private String minfo;
	private String mdataq;
	private String mdatad;
	private int idx2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public String getMtitile() {
		return mtitile;
	}
	public void setMtitile(String mtitile) {
		this.mtitile = mtitile;
	}
	public int getMsize() {
		return msize;
	}
	public void setMsize(int msize) {
		this.msize = msize;
	}
	public String getMadd() {
		return madd;
	}
	public void setMadd(String madd) {
		this.madd = madd;
	}
	public String getMtel() {
		return mtel;
	}
	public void setMtel(String mtel) {
		this.mtel = mtel;
	}
	public String getMinfo() {
		return minfo;
	}
	public void setMinfo(String minfo) {
		this.minfo = minfo;
	}
	public String getMdataq() {
		return mdataq;
	}
	public void setMdataq(String mdataq) {
		this.mdataq = mdataq;
	}
	public String getMdatad() {
		return mdatad;
	}
	public void setMdatad(String mdatad) {
		this.mdatad = mdatad;
	}
	public int getIdx2() {
		return idx2;
	}
	public void setIdx2(int idx2) {
		this.idx2 = idx2;
	}
	
	
	@Override
	public String toString() {
		
		
		String str = String.format("%s / %s / %s / %d / %s / %s / %s",
				name,mtype,mtitile,msize,madd,mtel,minfo);
	
	
		return str;
	}
	
	
}
