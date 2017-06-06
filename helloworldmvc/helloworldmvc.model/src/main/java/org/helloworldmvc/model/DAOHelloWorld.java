package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DAOHelloWorld {
	private static String			helloWorldMessage	= null;
	private static DAOHelloWorld	instance			= null;
	private final String			FileName			= "helloworld.txt";

	private DAOHelloWorld() {
	}

	public static DAOHelloWorld getInstance() {
		return DAOHelloWorld.instance;
	}

	private void readFile() {
		try {
			final InputStream ips = new FileInputStream(this.FileName);
			final InputStreamReader ipsr = new InputStreamReader(ips);
			final BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
				DAOHelloWorld.helloWorldMessage += ligne + "\n";
			}
			br.close();
		} catch (final Exception e) {
			System.out.println(e.toString());
		}
	}

	public String getHelloWorldMessage() {
		return DAOHelloWorld.helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		DAOHelloWorld.helloWorldMessage = helloWorldMessage;
	}
}
