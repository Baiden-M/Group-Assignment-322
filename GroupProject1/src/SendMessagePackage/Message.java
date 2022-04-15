package SendMessagePackage;

public class Message {
    
    String user_name;
    String receive_name;
    String message;
    

    public void send_message(String un, String rn, String m) {
        setUserName(un);
        setReceiveName(rn);
        setMessage(m);
    }
    
    public void setUserName(String un){
        user_name = un;
    }
    
    public String user_name(){
        return user_name;
    }
    
    public void setReceiveName(String rn){
        receive_name = rn;
    }
    
    public String receive_name(){
        return receive_name;
    }
    
    public void setMessage(String m){
        message = m;
    }
    
    public String message(){
        return message;
    }
    
    public void print_Message(){
        System.out.println("From:" + user_name);
        System.out.println("TO: " + receive_name);
        System.out.println("Message:\n");
        System.out.println("     " + message);
    }
    
}
