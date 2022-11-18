package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stringduplilambda {

	public static void main(String[] args) {
		
		String str = "Ajit Ajit is java to java for language to language";
		
		List<Object> list = Arrays.asList(str.split(" "));
		
		list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet()).forEach(System.out::println);

	}

}
