/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L11HW.prob2;

import java.util.Comparator;

/**
 *
 * @author asus
 */
public class SocialComparator implements Comparator<Employee>  {

    @Override
    public int compare(Employee t, Employee t1) {
        
        
         
         return t.getSsn().compareTo(t1.getSsn());
          }

   
    
}
