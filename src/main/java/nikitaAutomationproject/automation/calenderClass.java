package nikitaAutomationproject.automation;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class calenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cl= Calendar.getInstance();
SimpleDateFormat sdf= new SimpleDateFormat("MM/d/YYYY");
Date dt= new Date();
LocalDateTime currectDate= LocalDateTime.now();
System.out.println(currectDate);
System.out.println(sdf.format(dt));
System.out.println(cl.get(Calendar.DAY_OF_WEEK_IN_MONTH));
System.out.println(cl.get(Calendar.JUNE));
System.out.println(cl.get(Calendar.MINUTE));
System.out.println(cl.get(Calendar.DATE));

	}

}
