package clockAngle;


class Clock {
	public static double clockAngle(int hour, int minute) {
		double minutePos = minute*6;
		double hourPos = (hour*30) + (minute/2);
		double angle = Math.abs(hourPos-minutePos);
		if (angle > 180) {
			angle = 360-angle;
		}
		return angle;
	}
}
public class Main {

	public static void main(String[] args) {
		System.out.println(Clock.clockAngle(3, 30));
	}	
}
