package task5;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HouseConstruction {

	private static final Logger LOGGER=LogManager.getLogger(App.class); 
	double result;
	void priceCalculation(String materialStandard , double areaOfHouse , boolean isFullyAutomated) {
		if(materialStandard.equals("High Standard") && isFullyAutomated==true) {
			 result=(areaOfHouse*2500.0);
		}
		else if(materialStandard.equals("High Standard") && isFullyAutomated==false) {
			result=(areaOfHouse*1800.0);
		}
		else if(materialStandard.equals("Above Standard")) {
			result=(areaOfHouse*1500.0);
		}
		else if(materialStandard.equals("Standard")) {
			result=(areaOfHouse*1200.0);
		}
		else {
			result=0;
		}
		
		LOGGER.info("House Construction Estimate for Material Standard : "+materialStandard
				+", Area of House : "+areaOfHouse
				+", Fully Automation is : "+isFullyAutomated
				+" is : "+result);
		
	}
	
}
