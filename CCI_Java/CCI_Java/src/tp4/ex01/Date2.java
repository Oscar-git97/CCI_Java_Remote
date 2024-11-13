package tp4.ex01;

public class Date2 {
	int day;
	int month;
	int year;

	public Date2() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

	public Date2(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	void print() {
		System.out.println("Date : " + day + "/" + month + "/" + year);
	}

	boolean isLeapYear() {
		boolean isLeap = (this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0;
		if (isLeap)
			return true;
		return false;
	}

	boolean isBefore(Date2 d) {
		if (d.year > this.year)
			return true;
		else if (d.year == this.year)
			if (d.month > this.month)
				return true;
			else if (d.month == this.month)
				if (d.day > this.day)
					return true;
				else
					return false;
			else
				return false;
		else
			return false;
	}

	int nbDaysInMonth() {
		int nbDays = 31;

		if (this.month == 2)
			if (isLeapYear())
				nbDays = 29;
			else
				nbDays = 28;
		else if (this.month < 7 && this.month % 2 == 0)
			nbDays = 30;
		else if (this.month == 9 || this.month == 11)
			nbDays = 30;

		return nbDays;
	}

	Date2 nextDay() {
		int newDay = this.day;
		int newMonth = this.month;
		int newYear = this.year;

		if (this.day < nbDaysInMonth())
			newDay++;
		else if (this.month != 12) {
			newMonth++;
			newDay = 1;
		} else {
			newDay = 1;
			newMonth = 1;
			newYear++;
		}
		return new Date2(newDay, newMonth, newYear);
	}
}
