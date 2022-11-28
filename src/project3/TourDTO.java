package project3;

import java.io.Serializable;

public class TourDTO implements Serializable {

	private String name;
	private float lat;
	private float lng;
	private String pname;
	private String pdinfo;
	private String pminfo;
	private String liked;
	private int idx1;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLng() {
		return lng;
	}
	public void setLng(float lng) {
		this.lng = lng;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdinfo() {
		return pdinfo;
	}
	public void setPdinfo(String pdinfo) {
		this.pdinfo = pdinfo;
	}
	public String getPminfo() {
		return pminfo;
	}
	public void setPminfo(String pminfo) {
		this.pminfo = pminfo;
	}
	public String getLiked() {
		return liked;
	}
	public void setLiked(String liked) {
		this.liked = liked;
	}
	public int getIdx1() {
		return idx1;
	}
	public void setIdx1(int idx1) {
		this.idx1 = idx1;
	}
		
	@Override
	public String toString() {
		
		
		String str = String.format("%s / %s / %s / %s / %s\n",
				name,pname,pdinfo,pminfo,liked);
	
	
		return str;
	}
	
}
