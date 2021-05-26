
public class Date_Q9 {
	private int date;
	private String month;
	private int year;
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
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
	
public void display()
{
	System.out.println("Date "+date);
	System.out.println("Month "+month);
	System.out.println("year "+year);
}
}
