package TDDLab.LeapYear;

public class LeapYear {
    
    //method that takes in an int and checks for leap year

    public static boolean isItLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 != 0){
                return false;
            }else {
                return true;
            }
        }else {
            return false;
        }
    }

}