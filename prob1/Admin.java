package L11HW.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
            
            Iterator st=students.iterator();
            HashMap<Key, Student> studentMap=new HashMap<>();
          while(st.hasNext()){
          Key key=null;
          Student std= (Student)st.next();
          String lastname=std.getLastName();
          String firstname=std.getFirstName();
          
          key=new Key(firstname,lastname);
          studentMap.put(key, std);
          
          }
		//implement
		return studentMap;
	}
}
