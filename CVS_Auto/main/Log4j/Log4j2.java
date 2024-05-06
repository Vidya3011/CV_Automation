package Log4j;

import org.apache.logging.log4j.LogManager;

public class Log4j2 {
	
private static org.apache.logging.log4j.Logger Logger = LogManager.getLogger(Log4j2.class);

		public static void main(String[] args) {
			
			System.out.println("/n Contentverse. . .! \n");
			
			Logger.trace("this is trace message");
			Logger.info("This is Information message");
			Logger.error("This is an error message");
			Logger.warn("This is a warning message");
			Logger.debug("This is a Debug message");
			
			System.out.println("\n Completed");
		
		
		}

	}
	
	
	
	


