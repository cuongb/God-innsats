package slitclient;

/**
 *
 * @author ola
 */
public class ActiveUser {
    private String name;
    boolean loggedIn;
    
    public ActiveUser(String name, boolean loggedIn) {
    
        name = this.name;
        loggedIn= this.loggedIn;
        
}
    
    public String getName(){
    return name;
    }
    
    public boolean getStatus(){
        return loggedIn;
    }
    
}
   
