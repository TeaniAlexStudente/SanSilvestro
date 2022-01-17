package SSBean;

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate

  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
  LocalDate localDate = LocalDate.now();
 

public class SanSilvestro implements java.io.Serializable 
{ 
  private int giorni;  
  private String dateStr1;
  private String dateSS;
  private String stagione;
  public giorniSS() {
    giorni = 0;
    dateStr1 = dtf.format(localDate);
    dateSS = "2022-12-31"; 
    stagione=" ";
  }
  public int getGiorni() throws Exception {
    
         
		String DATE_FORMAT = "yyyy-MM-dd";
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
		
		
		
		Date date1 = simpleDateFormat.parse(dateStr1);
		
		
		Date date2 = simpleDateFormat.parse(dateSS);
		
		
		long date1InMs = date1.getTime();
		long date2InMs = date2.getTime();
		
		
		long timeDiff = 0;
		if(date1InMs > date2InMs) {
			timeDiff = date1InMs - date2InMs;
		} else {
			timeDiff = date2InMs - date1InMs;
		}
		
		
		int giorni = (int) (timeDiff / (1000 * 60 * 60* 24));
		
		 
      
                

                return giorni;
  }
  public String getStagione() throws Exception {
    
		String DATE_FORMAT = "MM-dd";
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
		
		SimpleDateFormat f=new SimpleDateFormat("MM-dd");
                
        
        try
        {
            dateStr1=dateStr1.substring(5);
            Date date=f.parse(dateStr1);
            
                if(date.after(f.parse("04-21")) && date.before(f.parse("06-21"))){
                    stagione="Primavera";
                }
                else if(date.after(f.parse("06-20")) && (date.before(f.parse("09-23"))))
                {
                    stagione="Estate";
                }
                else if(date.after(f.parse("09-22")) && date.before(f.parse("12-22")))
                {
                    stagione="Autunno";
                }
                else stagione="Inverno";
        }catch(Exception e){
            System.out.println("Data non accettabile "+e);
        }
        
        return stagione;
        
    }


  
}