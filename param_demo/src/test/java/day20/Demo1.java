package day20;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	@Parameters({"city"})
	@Test
	public void testA(@Optional("Opune") String city)
	{ //System.out.println(city);
		Reporter.log("testA.."+city,true);
	}

}
