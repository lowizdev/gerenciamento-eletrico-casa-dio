package com.lowizdev.gerenciamentoeletricocasa.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.lowizdev.gerenciamentoeletricocasa.demo.model.Device;
import com.lowizdev.gerenciamentoeletricocasa.demo.model.EDeviceStatuses;
import com.lowizdev.gerenciamentoeletricocasa.demo.model.SmartDevice;

@Component
public class DeviceService {

	// DATABASE DEPENDENCIES AND SUCH...

	public ArrayList<Device> GetAllDevices() {
		System.out.println("Recovering devices from database...");

		ArrayList<Device> resultArrayList = new ArrayList<Device>();
		resultArrayList.add(new Device("Refrigerator", "Electrolux", 50));
		resultArrayList.add(new Device("Fan", "Arno", 20));
		resultArrayList.add(new Device("Laptop", "Samsung", 15));

		return resultArrayList;

	}

	public ArrayList<SmartDevice> GetAllSmartDevices() {
		System.out.println("Recovering devices from database...");

		ArrayList<SmartDevice> resultArrayList = new ArrayList<SmartDevice>();
		resultArrayList.add(new SmartDevice("Lamp", "GE", 5, EDeviceStatuses.ONLINE, "192.168.0.2"));
		resultArrayList
				.add(new SmartDevice("Voice Assistant", "Some company", 15, EDeviceStatuses.ONLINE, "192.168.0.3"));
		resultArrayList.add(new SmartDevice("IRobot", "IRobot", 10, EDeviceStatuses.ONLINE, "192.168.0.4"));

		return resultArrayList;

	}

	public void ShutdownDevices(String deviceType) {

		IShutdownStrategy strategy;

		ArrayList<SmartDevice> devices = this.GetAllSmartDevices();

		if (deviceType.equals("API")) {
			strategy = new ShutdownWithDeviceAPI();
		} else {
			strategy = new ShutdownWithRadioCommunication();
		}

		ArrayList<SmartDevice> devicesOffline = strategy.shutdown(devices);

		// Do something with the list...
		return;

	}

}
