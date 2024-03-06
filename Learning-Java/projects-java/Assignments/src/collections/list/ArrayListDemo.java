package collections.list;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		String garVersion = "123e543515dfs";
		String profileName = "fajkfnafdnjkandjna";
		//String appName = "Desk";
		
		runProfile(garVersion, profileName);
		
	}
	
	public static void runProfile(final String garVersion, final String profileName) {
		String input = null;
		input = String.format("{"
				+ "\"version\": \"%s\","
						+"\"profile\" : {"
						+ "\"profileName\" : \"%s\""
						+ "}"
						+ "}",
						garVersion, profileName);
		
		System.out.println(input);
	}

}
