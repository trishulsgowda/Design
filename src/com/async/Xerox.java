package com.async;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Xerox implements Runnable {

	public void copy(String src, String dest) {

		File srcFile = new File("C:\\Users\\Thrishul\\Desktop\\MT\\" + src + ".txt");
		File destFile = new File("C:\\Users\\Thrishul\\Desktop\\MT\\" + dest + ".txt");

		System.out.println("Copying from " + src + " to " + dest);
		callSleep();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(srcFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));) {

			String line = null;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void callSleep() {
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void run() {
	}
}
