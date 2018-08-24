
public class Date {
	int year, day;
	String month;
	
	public Date()
	{
		day = 30;
		year = 2018;
		month = "January";
	}
	
	public Date(int day, String month, int year)
	{
		this.day = day;
		this.year = year;
		this.month = month;
	}
	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public void modify(int day, String month, int year)
	{
		this.day = day;
		this.month = month;
		this.year= year;
	}
	public void display()
	{
		System.out.println(day+"/"+month+"/"+year);
	}

}