//Amanda Nguyen Problem 2 Time
import java.util.Scanner;
public class Time {
	
	public static double secondsToMinutes(int seconds) {
		double minutes = (seconds/60.0);
		return minutes;
		}
	public static double secondsToHours(int seconds) {
		double minutes = seconds/60.0;
		double hours = minutes/60.0;
		return hours;
		}
	public static double secondsToDays(int seconds) {
		double minutes = seconds/60.0;
		double hours = minutes/60.0;
		double days = hours/24.0;
		return days;
		}
	public static double secondsToYears(int seconds) {
		double minutes = seconds/60.0;
		double hours = minutes/60.0;
		double days = hours/24.0;
		double years = days/365.0;
		return years;
		}
	public static double minutesToSeconds(double minutes) {
		double seconds = minutes*60;
		return seconds;
		}
	public static double hoursToSeconds(double hours){
		double minutes = hours*60;
		double seconds = minutes*60;
		return seconds;
		}
	public static double daysToSeconds(double days){
		double hours= days*24;
		double minutes = hours*60;
		double seconds = minutes*60;
		return seconds;
		}
	public static double yearsToSeconds(double years){
		double days = years*365;
		double hours= days*24;
		double minutes = hours*60;
		double seconds = minutes*60;
		return seconds;
		}

	
}
