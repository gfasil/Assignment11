package L11HW.prob1;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
        
        public boolean equals(Object obj){
        
        if(obj==null) return false;
        
        if(obj.getClass()!=this.getClass()) return false;
        
        Key key=(Key) obj;
        
        return key.firstName.equals(this.firstName) && key.lastName.equals(this.lastName);
        
        }
        
      public int hashCode(){  
            
           int result = 17; //seed
		int hashFirst = firstName.hashCode();
		int hashSecond = lastName.hashCode();
		result += 31 * result + hashFirst;
		result += 31 * result + hashSecond;
		return result;
        
        }  
}
