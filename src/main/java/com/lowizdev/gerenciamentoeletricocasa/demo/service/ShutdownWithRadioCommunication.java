package com.lowizdev.gerenciamentoeletricocasa.demo.service;

import java.util.ArrayList;

import com.lowizdev.gerenciamentoeletricocasa.demo.model.EDeviceStatuses;
import com.lowizdev.gerenciamentoeletricocasa.demo.model.SmartDevice;

public class ShutdownWithRadioCommunication implements IShutdownStrategy {

	@Override
	public ArrayList<SmartDevice> shutdown(ArrayList<SmartDevice> devices) {
		System.out.println(
				"Performing communication with radio driver in the server machine to shut down the devices...");

		for (SmartDevice smartDevice : devices) {
			smartDevice.setStatus(EDeviceStatuses.OFFLINE);
		}

		return devices;
	}

}
