package com.lowizdev.gerenciamentoeletricocasa.demo.model;

public class Device {

	public Device(String name, String manufacturer, double consumptionInKwh) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.consumptionInKwh = consumptionInKwh;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getConsumptionInKwh() {
		return consumptionInKwh;
	}

	public void setConsumptionInKwh(double consumptionInKwh) {
		this.consumptionInKwh = consumptionInKwh;
	}

	private String manufacturer;
	private double consumptionInKwh;

}
