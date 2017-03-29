package io.ipivot.matka;

import java.util.Date;

public class TravelPackage {
	private String id;
	private String name;
	double price;
	Date startDate;
	Date endDate;
	String desc;

	public String getId() {

		return id;

	}

	public String getName() {

		return name;

	}

	public double getPrice() {
		return price;

	}

	public Date getStartDate() {
		return startDate;

	}

	public Date getEndDate() {
		return endDate;

	}

	public String getDesc() {
		return desc;

	}

	public String setId(String id) {
		return this.id = id;
		

	}

	public String setName(String name) {
		return this.name = name;

	}

	public double setPrice(int price) {

		return this.price = price;
	}

	public Date setStartDate(Date startDate) {

		return this.startDate = startDate;
	}

	public Date setEndDate(Date endDate) {
		return this.endDate = endDate;
	}

	public String setDesc(String desc) {

		return this.desc = desc;
	}

	@Override
	public String toString() {
		return "TravelPackage [id=" + id + ", name=" + name + ", price=" + price + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", desc=" + desc + "]";
	}

}
