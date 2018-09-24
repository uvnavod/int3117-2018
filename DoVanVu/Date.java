package date;

public class Date {
	private int day, month, year;
	
	public Date (int _day, int _month, int _year) {
		this.day = _day;
		this.month = _month;
		this.year = _year;
	}
	
	public boolean isValidateDate() {
		if(this.month < 1 || this.month > 12) {
			return false;
		}
		if(this.day < 1 || this.day > this.totalDaysOfMonth()) {
			return false;
		}
		return true;
	}
	
	public boolean isLeapYear () {
		int yearAbs = Math.abs(this.year);
		if((yearAbs % 4 == 0 && yearAbs %100 !=0) || (yearAbs % 400 == 0)) {
			return true;
		}
		return false;
	}
	
	public int totalDaysOfMonth() {
		int totalDays;
		switch(this.month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				totalDays = 31;
				break;
			case 4: case 6: case 9: case 10:
				totalDays = 30;
			case 2:
				if(this.isLeapYear()) {
					totalDays = 29;
				} else {
					totalDays = 28;
				}
				break;
			default:
				break;
		}
		return totalDays;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
}