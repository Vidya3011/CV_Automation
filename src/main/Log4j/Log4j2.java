package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;


public class Log4j2 {
	
private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Log4j2.class);

		public static void main(String[] args) {
			
			System.out.println("/n Contentverse. . .! \n");
			
			logger.trace("this is trace message");
			logger.info("This is Information message");
			logger.error("This is an error message");
			logger.warn("This is a warning message");
			logger.debug("This is a Debug message");
			
			System.out.println("\n Completed");
		
		
		}

	}
	
	
	
	


