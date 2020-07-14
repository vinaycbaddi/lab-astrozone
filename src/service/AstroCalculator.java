package service;
import model.User;
public class AstroCalculator{
	public String findSign(User u) {
		String sign="";
		String dob=u.getDob();
		String[] arr=dob.split("-");
		int date= Integer.parseInt(arr[0]);
		int month=Integer.parseInt(arr[1]);
		if(month == 3) {
			if(date>=1 && date <=20)
				sign = "Pisces";
			else
				sign = "Aries";
		}
		else if(month==4){
			if(date>=1 && date <=19)
				sign = "Aries";
			else
				sign = "Taurus";		
		}
		else if(month==5){
			if(date>=1 && date <=20)
				sign = "Taurus";
			else
				sign = "Gemini";		
		}
		else if(month==6){
			if(date>=1 && date <=20)
				sign = "Gemini";
			else
				sign = "Cancer";		
		}
		else if(month==7){
			if(date>=1 && date <=22)
				sign = "Cancer";
			else
				sign = "Leo";		
		}
		else if(month==8){
			if(date>=1 && date <=22)
				sign = "Leo";
			else
				sign = "Virgo";		
		}
		else if(month==9){
			if(date>=1 && date <=22)
				sign = "Virgo";
			else
				sign = "Libra";		
		}
		else if(month==10){
			if(date>=1 && date <=22)
				sign = "Libra";
			else
				sign = "Scorpio";		
		}
		else if(month==11){
			if(date>=1 && date <=21)
				sign = "Scorpio";
			else
				sign = "Sagittarius";		
		}
		else if(month==12){
			if(date>=1 && date <=21)
				sign = "Sagittarius";
			else
				sign = "Capricorn";		
		}
		else if(month==1){
			if(date>=1 && date <=19)
				sign = "Capricorn";
			else
				sign = "Aquarius";		
		}
		else if(month==2){
			if(date>=1 && date <=18)
				sign = "Aquarius";
			else
				sign = "Pisces";		
		}
		else {
			sign ="#";
		}
		return sign;
		
	}
}