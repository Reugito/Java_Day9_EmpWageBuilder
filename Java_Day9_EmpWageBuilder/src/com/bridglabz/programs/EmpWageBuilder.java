package com.bridglabz.programs;

import java.util.Random;

public class EmpWageBuilder {
	public static final int WagePerHr = 20, FullDayHr = 8, PartThimeHr = 4;
	public static final int isFulltime = 1, isParttime = 2;
	public static int day = 0;
	
	public static int getAttendance() {
		Random random = new Random();
		int check = random.nextInt(3);
		return check;
	}
	
	public static int getDailyWager() {
		int daily_wage = WagePerHr * FullDayHr; 
		return daily_wage;
	}
	
	public static int getPartTimeWage() {             // adding part time wager
    	int partTimeWage = WagePerHr * PartThimeHr; 
        return partTimeWage;
    }
	
	public static int usingSwitch() {
		int check = getAttendance() ;
		day++;
		switch (check) {
			case isFulltime: 
				System.out.println("Day"+day+" = "+getDailyWager());
				return getDailyWager();
		case isParttime:  
				System.out.println("Day"+day+" = "+getPartTimeWage());
				return getPartTimeWage();
			default:
				System.out.println("Day"+day+" = 0");
			
		return 0;
		}
	}
}


