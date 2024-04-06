package com.lowizdev.gerenciamentoeletricocasa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lowizdev.gerenciamentoeletricocasa.demo.facade.CalculateConsumptionReportFacade;
import com.lowizdev.gerenciamentoeletricocasa.demo.model.ConsumptionReport;
import com.lowizdev.gerenciamentoeletricocasa.demo.service.DeviceService;

@RestController
public class DevicesController {

	@Autowired
	private CalculateConsumptionReportFacade reportFacade;

	@Autowired
	private DeviceService deviceService;

	@GetMapping
	public ConsumptionReport GetConsumptionReport() {
		return reportFacade.calculateTotalConsumptionReport();
	}

	@PostMapping
	public void ShutdownDevices(@RequestBody String shutdownType) {
		deviceService.ShutdownDevices(shutdownType); // FOR TESTING ONLY
		return;
	}

}
