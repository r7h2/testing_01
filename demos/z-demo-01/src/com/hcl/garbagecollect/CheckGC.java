package com.hcl.garbagecollect;

import java.util.Date;

public class CheckGC {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: " + rt.totalMemory());
		System.out.println("Before memory = " + rt.freeMemory());
		
		Vehicle v = null;
		for(int i = 0; i<10000; i++) {
			v = new Vehicle();
			v = null;
		}
		System.out.println("After memory (ref var is nulled) = " + rt.freeMemory());
		rt.gc(); // an alternative to System.gc()
		System.out.println("====");
		System.out.println("After GC Memory (called .gc() directly) = " + rt.freeMemory());
		
		for(int x = 0; x <=10000; x++) {}

	}

}
