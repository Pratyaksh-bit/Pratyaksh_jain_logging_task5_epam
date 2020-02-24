package task5;

import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class CompoundInterest {
	
	private static final Logger LOGGER=LogManager.getLogger(App.class); 
	
	double principalAmount , rateOfInterest , timeInYears;
	
	@SuppressWarnings("resource")
	void getInput() {
		Scanner scanner = new Scanner(System.in);
		principalAmount=scanner.nextDouble();
		rateOfInterest=scanner.nextDouble();
		timeInYears=scanner.nextDouble();
	}
	
	void getResult() {
		double result = ((principalAmount*(Math.pow((1+(rateOfInterest/100)), timeInYears)))-principalAmount);
		LOGGER.info("Compound Interest for Principal : "+principalAmount
				+", Rate of interest : "+rateOfInterest
				+", Time : "+timeInYears
				+" is : "+result);
	}
}
