package entities;

public class Student {
	public String name;
	public double firstSemester;
	public double secondSemester;
	public double thirdSemester;
	
	
	public double sum() {
		return firstSemester + secondSemester + thirdSemester;

	}
	public String toString() {
		if (sum() < 60) {
			return name + ", Final Grade = " + sum() + " Failed! Missing " + (60 - sum()) + "Points" ;
		}
		else {
			return name + ", Final Grade = " + sum() + " Pass";
		}
	}
}
