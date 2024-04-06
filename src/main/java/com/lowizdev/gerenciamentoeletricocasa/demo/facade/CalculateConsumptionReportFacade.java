package com.lowizdev.gerenciamentoeletricocasa.demo.facade;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lowizdev.gerenciamentoeletricocasa.demo.model.ConsumptionReport;
import com.lowizdev.gerenciamentoeletricocasa.demo.model.Device;
import com.lowizdev.gerenciamentoeletricocasa.demo.service.DeviceService;

@Component
public class CalculateConsumptionReportFacade {

	@Autowired
	private DeviceService deviceService;

	public ConsumptionReport calculateTotalConsumptionReport() {

		// PERFORM COMPLEX LOGIC AND SUCH...
		ArrayList<Device> devices = deviceService.GetAllDevices();

		double totalConsumption = 0;

		for (Device device : devices) {
			totalConsumption += device.getConsumptionInKwh();
		}

		ConsumptionReport report = new ConsumptionReport(totalConsumption);

		return report;

	}

}
