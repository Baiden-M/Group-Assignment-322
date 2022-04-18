package SendMessagePackage;

public class Message {
    
    String user_name;
    String receive_name;
    String message;
    
    //parameter un is username, rn is receiver, m is message and no return
    public void send_message(String un, String rn, String m) {
        setUserName(un);
        setReceiveName(rn);
        setMessage(m);
    }
    
    //input user name
    public void setUserName(String un){
        user_name = un;
    }
    
    //get user name
    public String user_name(){
        return user_name;
    }
    
    //input recevier name
    public void setReceiveName(String rn){
        receive_name = rn;
    }
    
    //get receiver name
    public String receive_name(){
        return receive_name;
    }
    
    //input message
    public void setMessage(String m){
        message = m;
    }
    
    //get message
    public String message(){
        return message;
    }
    
    //print out the user name, receiver name and the message
    public void print_Message(){
        System.out.println("From:" + user_name);
        System.out.println("TO: " + receive_name);
        System.out.println("Message:\n");
        System.out.println("     " + message);
    }
    
}
