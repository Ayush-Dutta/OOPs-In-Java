public class Time
{
    int hour;
    int min;
    int sec;
    
    public Time(int hour, int min, int sec)
    {
	this.hour = hour;
	this.min = min;
	this.sec = sec;
    }
    public void add(Time otherTime)
    {
	int totalHour = this.hour + otherTime.hour;
	int totalMin = this.min + otherTime.min;
	int totalSec = this.sec + otherTime.sec;
	int totalDay=0; 
	System.out.println("Time 1: " + this.hour + " hours, " + this.min + " minutes, " + this.sec + " seconds.");
	System.out.println("Time 2: " + otherTime.hour + " hours, " + otherTime.min + " minutes, " + otherTime.sec + " seconds.");
	if(totalSec >= 60)
	{
	    totalSec -= 60;
	    totalMin += 1;
	}
	if(totalMin >= 60)
	{
		totalMin -= 60;
		totalHour += 1;
	}
	if(totalHour >= 24)
	{
		
		totalDay += totalHour/24;
		totalHour %= 24;
		
	}
	if(totalDay < 0)
		System.out.println("Total Time: " + totalHour + " hours, " + totalMin + " minutes, " + totalSec + " seconds. ");
	else 
		System.out.println("Total Time: " + totalDay + " days(s), " + totalHour + " hours, " + totalMin + " minutes, " + totalSec + " seconds. ");

    }
    public static void main(String args[])
    {
	Time t1 = new Time(12, 42, 59);
	Time t2 = new Time(26, 47, 20);
	t1.add(t2);
    }
}