package com.hcl.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		// source -> middle operations -> terminal operation
		
		List<String> listStrings = Arrays.asList("fish", "a", "zebra", "middle", "routing", "yes", "no", "c");
		Stream <String> listStream  = listStrings.stream();
		listStream.filter(s -> {
			System.out.println("s= " + s);
			return s.length() > 2;
		}
		)
		.map(stringInput -> stringInput.toUpperCase() )
		.limit(3)
		.skip(1)
		.forEach(i -> System.out.println(i));
		
		Stream<Integer> strmInts = Stream.of(2,8,11,66,187,222,2,5,6);
		int sum = strmInts.reduce(0, (a,b) -> a + b );
		
		System.out.println("sum: " + sum);
				

	}

}
