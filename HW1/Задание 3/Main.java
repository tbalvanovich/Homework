public class Main{
    public static void main(String[] args) {
	int sec=4500;
	int min=sec/60;
	int hour=min/60;
	int day= hour/24;
	int week=day/7;
        System.out.println("minutes - " + min + ", sec - " + (sec-min*60) );
	System.out.println("hours - " + hour + ", minutes - " + (min - hour*60) + ", sec - " + (sec-min*60) );
	System.out.println("days - " + day + ", hours - " + (hour - day*24) + ", minutes - " + (min - hour*60) + ", ,sec - " + (sec-min*60) );
	System.out.println( "week - " + week + ", days - " + (day - week*7) + ", hours - " + (hour - day*24) + ", minutes - " + (min - hour*60) + ", sec - " + (sec-min*60) );
	
    
    }
}