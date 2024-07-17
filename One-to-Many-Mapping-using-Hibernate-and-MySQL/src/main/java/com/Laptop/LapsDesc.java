package com.Laptop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Laptop_Desc")

public class LapsDesc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false,unique=true)
	private int LapModel_Id;
	
	private int Lap_Id;
	
	private String Lap_Name;
	private String Lap_Model;
	private int Lap_Price;
	
	public int getLap_Id() {
		return Lap_Id;
	}
	public void setLap_Id(int lap_Id) {
		Lap_Id = lap_Id;
	}
	public String getLap_Name() {
		return Lap_Name;
	}
	public void setLap_Name(String lap_Name) {
		Lap_Name = lap_Name;
	}
	public String getLap_Model() {
		return Lap_Model;
	}
	public void setLap_Model(String lap_Model) {
		Lap_Model = lap_Model;
	}
	public int getLap_Price() {
		return Lap_Price;
	}
	public void setLap_Price(int lap_Price) {
		Lap_Price = lap_Price;
	}
	
	public int getLapModel_Id() {
		return LapModel_Id;
	}
	public void setLapModel_Id(int lapModel_Id) {
		LapModel_Id = lapModel_Id;
	}
	
	
	@Override
	public String toString() {
		return "LapsDesc [LapModel_Id=" + LapModel_Id + ", Lap_Id=" + Lap_Id + ", Lap_Name=" + Lap_Name + ", Lap_Model="
				+ Lap_Model + ", Lap_Price=" + Lap_Price + "]";
	}
	

}
