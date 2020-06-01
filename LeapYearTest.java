package TDDLab.LeapYear;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {
    
    @Test
    public void whenYearIsDivisibleBy4(){
        assertEquals(true, LeapYear.isItLeapYear(1992));
        assertEquals(false, LeapYear.isItLeapYear(2010));
        assertEquals(false, LeapYear.isItLeapYear(1995));
    }

    @Test
    public void whenYearCannotBeDivisibleBy100ButIsDivisibleBy400(){
        assertEquals(false, LeapYear.isItLeapYear(1900));
        assertEquals(true, LeapYear.isItLeapYear(2000));
        assertEquals(true, LeapYear.isItLeapYear(1600));

    }
    


}