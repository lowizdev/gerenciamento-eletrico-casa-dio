package com.lowizdev.gerenciamentoeletricocasa.demo.service;

import java.util.ArrayList;

import com.lowizdev.gerenciamentoeletricocasa.demo.model.EDeviceStatuses;
import com.lowizdev.gerenciamentoeletricocasa.demo.model.SmartDevice;

public class ShutdownWithDeviceAPI implements IShutdownStrategy {

	@Override
	public ArrayList<SmartDevice> shutdown(ArrayList<SmartDevice> devices) {
		System.out.println("Performing API related logic to shut down the devices...");

		for (SmartDevice smartDevice : devices) {
			smartDevice.setStatus(EDeviceStatuses.OFFLINE);
		}

		return devices;
	}

}
