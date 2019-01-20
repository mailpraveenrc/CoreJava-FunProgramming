package com.funprograming.compare;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;

/**
 * @author praveenramachandran
 *
 */
public class Laptop implements Comparable<Laptop>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5052577213846931186L;
	public Laptop(Integer ram, String name, Double price, Float displayInch, LocalDate releaseDate) {
		super();
		this.ram = ram;
		this.name = name;
		this.price = price;
		this.displayInch = displayInch;
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", name=" + name + ", price=" + price + ", displayInch=" + displayInch
				+ ", releaseDate=" + releaseDate + "]";
	}
	private Integer ram;
	private String name;
	private Double price;
	private Float displayInch;
	private LocalDate releaseDate;
	
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Float getDisplayInch() {
		return displayInch;
	}
	public void setDisplayInch(Float displayInch) {
		this.displayInch = displayInch;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((displayInch == null) ? 0 : displayInch.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((ram == null) ? 0 : ram.hashCode());
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (displayInch == null) {
			if (other.displayInch != null)
				return false;
		} else if (!displayInch.equals(other.displayInch))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (ram == null) {
			if (other.ram != null)
				return false;
		} else if (!ram.equals(other.ram))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		return true;
	}

	@Override
	public int compareTo(Laptop o) {
		if(this.getPrice() > o.getPrice()) {
			return 1;
		}else {
			return -1;
		}
}


	
}
