package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTimeTest {

	@Test
	public void testToString() {
		DateTime dateTime = new DateTime(2018,01,01,06,00,00);	
		assertEquals(dateTime.toString(), "2018-01-01 06:00");
	}

	@Test
	public void testDateTimeString() {
		DateTime dateTime = new DateTime("2018-01-01 06:00:00");	
		assertEquals(dateTime.getYear(), 2018);
		assertEquals(dateTime.getMonth(), 01);
		assertEquals(dateTime.getDay(), 01);
		assertEquals(dateTime.getHour(), 06);
		assertEquals(dateTime.getMinute(), 00);
		assertEquals(dateTime.getSecond(), 00);
	}

}
