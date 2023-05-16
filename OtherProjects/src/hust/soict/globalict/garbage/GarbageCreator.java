package hust.soict.globalict.garbage;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.*;
import java.nio.*;

public class GarbageCreator {
	public static void main(String[] args) throws IOException {
		String filename = "1MB.bin";
		long startTime, endTime;
		
		byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b: inputBytes) {
			outputString += (char) b;
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}