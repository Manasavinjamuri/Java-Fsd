package com.jobiak.ioc;
import java.util.*;

public class Garden {
	ArrayList<String>fruits;
	
	public Garden() {
		
	}
	public void setFruits(ArrayList<String>fruits) {
		System.out.println("set called.....");
		this.fruits=fruits;
	}
	public String tostring() {
		return "Garden[fruits="+fruits+"]";
	}
	}


