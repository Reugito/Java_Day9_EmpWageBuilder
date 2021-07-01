package com.bridglabz.programs;

import java.util.Random;

public class EmpWageBuilder {

	public static int getAttendance() {
		Random random = new Random();
		int check = random.nextInt(3);
		return check;
	}
}
