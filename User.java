//Abstract class User
 
public abstract class User {
    //instance variables
    protected String username;
    protected String password;

    //default constructor
    public User(String u, String p) {
	username = u;
	password = p;
    }

    //methods
    /*checks if the username and password are correct */
    public boolean check(String u, String p){
	return username.equals(u) && username.equals(p);
    }

    //accessors and mutators
    public String getUser() {
	return username; 
    }

    public String setUser(String u) {
	String tmp = username;
	username = u;
	return tmp;
    }
        
    public String getPass() {
	return password; 
    }

    public String setPass(String p) {
	String tmp = password;
	password  = p;
	return tmp;
    }
    
}
