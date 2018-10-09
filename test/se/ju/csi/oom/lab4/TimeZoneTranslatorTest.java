package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TimeZoneTranslatorTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testShiftTimeZone() {
		DateTime dateTime = new DateTime("2018-01-01 06:00:00");
		dateTime = TimeZoneTranslator.shiftTimeZone(dateTime, 1, -8);
		System.out.println(dateTime.toString());
		assertEquals(dateTime.toString(), "2017-12-31 21:00:00");

	}
	
	@Test
	public void testShiftEventTimeZone() {
		DateTime startTime = new DateTime("2018-10-02 14:42:00");
		DateTime endTime = new DateTime("2018-10-02 15:42:00");

		Event event = new Event("test",startTime, endTime, null, null);
		event = TimeZoneTranslator.shiftEventTimeZone(event, TimeZone.GREENWICH_UTC, TimeZone.PAKISTAN);
				
		assertEquals(event.getStartDate().toString(), "2018-10-02 19:42:00");
		assertEquals(event.getEndDate().toString(), "2018-10-02 20:42:00");
	}

}
