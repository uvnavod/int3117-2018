package date;

import static org.junit.Assert.assertEquals;

public class TestDate {  
	@Test
	public void testIsLeapYear1() {
		Date d = new Date();
		d.setYear(1900);
		assertEquals(d.isLeapYear(), false);
	}
	
	@Test
	public void testIsLeapYear2() {
		Date d = new Date();
		d.setYear(2016);
		assertEquals(d.isLeapYear(), true);
	}
	
	@Test
	public void testTotalDaysOfMonth() {
		Date d = new Date(2, 2, 2018);
		assertEquals(d.totalDaysOfMonth()(), 28);
	}
	
	@Test
	public void testIsValidateDate1() {
		Date d = new Date(29, 2, 2017);
		assertEquals(d.totalDaysOfMonth()(), false);
	}
	
	@Test
	public void testIsValidateDate2() {
		Date d = new Date(0, 13, 2016);
		assertEquals(d.totalDaysOfMonth()(), false);
	}
}