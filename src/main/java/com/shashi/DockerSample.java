package com.shashi;

import java.io.IOException;

import br.com.criativasoft.opendevice.core.LocalDeviceManager;
import br.com.criativasoft.opendevice.core.model.Device;

/**
 * 
 * @author Sharath MK
 * @date 03/11/2015
 */
public class DockerSample extends LocalDeviceManager {

	public static void main(String[] args) {
		launch(args);
	}

	public void start() throws IOException {
		System.out.println("Started...");
		Device led = new Device(9, Device.DIGITAL);
		connect(out.usb());
		while (true) {
			led.on();
			delay(500);
			led.off();
			delay(500);
		}
	}
}
