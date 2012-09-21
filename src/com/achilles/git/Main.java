package com.achilles.git;

import com.achilles.util.Util;

public class Main {
	public static void main(String[] args) {
		Person per = new Person();
		per.setId(1);
		per.setName("Achilles");

		System.out.println("PERSON ::" + per.getName());
		
		System.out.println("--"+per.getId());
		Util.utilTest();
	}
}
