package nikitaAutomationproject.automation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-dgenerated method stub
		Date dt= new Date();
		System.out.println(dt.getDate());
		System.out.println(dt.toString());
		SimpleDateFormat sdf= new SimpleDateFormat("MM/d/YYYY");
		System.out.println(sdf.format(dt));
		

	}

}
