package com.lowizdev.gerenciamentoeletricocasa.demo.model;

public class SmartDevice extends Device {

	public SmartDevice(String name, String manufacturer, double consumptionInKwh, EDeviceStatuses status,
			String networkAdress) {
		super(name, manufacturer, consumptionInKwh);
		this.status = status;
		this.networkAdress = networkAdress;
	}

	private EDeviceStatuses status;

	public EDeviceStatuses getStatus() {
		return status;
	}

	public void setStatus(EDeviceStatuses status) {
		this.status = status;
	}

	public String getNetworkAdress() {
		return networkAdress;
	}

	public void setNetworkAdress(String networkAdress) {
		this.networkAdress = networkAdress;
	}

	private String networkAdress;

}
