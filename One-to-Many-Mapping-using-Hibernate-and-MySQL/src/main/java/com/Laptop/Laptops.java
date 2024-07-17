package com.Laptop;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptops {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false,unique=true)
	private int Lap_Id;
	
	private String Lap_Name;
	private String Lap_Owner;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="Lap_Id")
	private List<LapsDesc> Lapsdesc;
	
	
	public List<LapsDesc> getLapsdesc() {
		return Lapsdesc;
	}
	public void setLapsdesc(List<LapsDesc> lapsdesc) {
		Lapsdesc = lapsdesc;
	}
	
	
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
	public String getLap_Owner() {
		return Lap_Owner;
	}
	public void setLap_Owner(String lap_Owner) {
		Lap_Owner = lap_Owner;
	}
	
	
	@Override
	public String toString() {
		return "Laptops [Lap_Id=" + Lap_Id + ", Lap_Name=" + Lap_Name + ", Lap_Owner=" + Lap_Owner + "]";
	}
	

}
