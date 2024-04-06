package com.lowizdev.gerenciamentoeletricocasa.demo.service;

import java.util.ArrayList;

import com.lowizdev.gerenciamentoeletricocasa.demo.model.SmartDevice;

public interface IShutdownStrategy {

	public ArrayList<SmartDevice> shutdown(ArrayList<SmartDevice> devices);

}
