package arr;

public class day {
		public static void main(String[] args) {
			
			int date=1;
			int month=9;
			int year=2015;
			int days;
			if((year%400==0)||(year%4==0 && year!=100))
			{
			    if(month==2) days=29;
			    else if(month==4 || month==6 || month==9 || month==11) days=30;
			    else days=31;
			}
			else{
			    if(month==2) days=28;
			    else if(month==4 || month==6 || month==9 || month==11) days=30;
			    else days=31;
			}
			if(date<days){
			    date++;
			}else days=1;
			if(month==12){
			    month=1;
			    year++;
			}else month++;
			System.out.println(date+"-"+month+"-"+year);
		}
	


}
