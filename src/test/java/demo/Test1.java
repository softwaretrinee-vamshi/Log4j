package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void main() {
		Logger log=LogManager.getLogger("Test1");
		log.info("info message");

	}

}
