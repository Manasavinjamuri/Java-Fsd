package ai.jobiak.collections;

import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet colors = new HashSet();
		
		colors.add("white");
		colors.add("blue");
		colors.add("pink");
		colors.add("black");
		colors.add("red");
		
		System.out.println(colors);
		System.out.println(colors.size());
		System.out.println(colors.contains("green"));

	}

}
