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
		try {
			launch(args);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void start() throws IOException {
		try {
			Device led = new Device(9, Device.DIGITAL);
			connect(out.usb());
			System.out.println("Started...");
			while (true) {
				led.on();
				delay(500);
				led.off();
				delay(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				Thread.sleep(10000);
				start();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
