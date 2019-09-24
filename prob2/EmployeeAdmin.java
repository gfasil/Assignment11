package L11HW.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
            List<Employee> temp=new  ArrayList<Employee> ();
            Set<String> socailkeys= table.keySet();
           
            Iterator x=socailkeys.iterator();
           
          	//IMPLEMENT
                while(x.hasNext()){
                
                String keyx=(String)x.next();
                  Iterator y=socSecNums.iterator();
	
                
                       while(y.hasNext()){
                       
                     String keyy=(String)y.next();
                   
                   if(keyx.compareTo(keyy)==0)
                   {
                   Employee emp=(Employee) table.get(keyx);
                   if(emp.getSalary()>80000){
                   temp.add(emp);
                   }
                   
                   }
                       }
                       
                  
             
                     
                }
                Collections.sort(temp, new SocialComparator());
		return temp;
		
	}
     
	
}
