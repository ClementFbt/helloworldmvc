package org.helloworldmvc.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
	private static String			helloWorldMessage	= null;
	private static DAOHelloWorld	instance			= null;
	private final String			FileName			= "HelloWorld.txt";

	private DAOHelloWorld() {
	}

	public static DAOHelloWorld getInstance() {
		return DAOHelloWorld.instance;
	}

	private void readFile() {
		try {
			final File file = new File(this.FileName);
			FileReader fileReader = null;
			fileReader = new FileReader(file);
			DAOHelloWorld.helloWorldMessage = fileReader.toString();
			fileReader.close();
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException f) {
			f.printStackTrace();
		}
	}

	public String getHelloWorldMessage() {
		return DAOHelloWorld.helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		DAOHelloWorld.helloWorldMessage = helloWorldMessage;
	}
}
