//Joshua Orbiso BSIT-3

package com.cituccs.cyberaware.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_userguide")
public class UserGuideEntity {

	
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int ugid;
	private String guide;
	private String gdescription;
	
	public UserGuideEntity(){}
	public UserGuideEntity(int ugid, String guide, String gdescription) {
		super();
		this.ugid = ugid;
		this.guide = guide;
		this.gdescription = gdescription;
	}
	
	public int getUgid() {
		return ugid;
	}

	public String getGuide() {
		return guide;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}

	public String getGdescription() {
		return gdescription;
	}

	public void setGdescription(String gdescription) {
		this.gdescription = gdescription;
	}
	
}