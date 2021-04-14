package com.hcl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		
		String s1 = "Hello, how are you doing?";
		
		byte[] strToBytes = s1.getBytes();
		
		
		Path p = Paths.get("sampleFile.txt");
		Files.write(p, strToBytes);
		
		String result = Files.readAllLines(p).get(0);
		System.out.println(result);
		
		String s2 = "Testing BufferedWriter";
		String s3 = "Testing in s3";
		BufferedWriter writer = new BufferedWriter(new FileWriter("testing.txt"));
		writer.write(s2);

		
		
	}

}
