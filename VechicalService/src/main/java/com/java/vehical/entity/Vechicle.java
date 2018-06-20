package com.java.vehical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vechice")
public class Vechicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String vechicleName;
	
	private String manfacturing;
	
	private int year;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVechicleName() {
		return vechicleName;
	}

	public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}

	public String getManfacturing() {
		return manfacturing;
	}

	public void setManfacturing(String manfacturing) {
		this.manfacturing = manfacturing;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}
