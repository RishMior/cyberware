//Joshua Orbiso BSIT-3

package com.cituccs.cyberaware.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cyberthreats")
public class CyberThreatsEntity {

	
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int ctid;
	private String name;
	private String description;
	private int level;	
	
	public CyberThreatsEntity(){}
	public CyberThreatsEntity(int ctid, String name, String description, int level) {
		super();
		this.ctid = ctid;
		this.name = name;
		this.description = description;
		this.level = level;
	}
	
	public int getCtid() {
		return ctid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
