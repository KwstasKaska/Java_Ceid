import java.sql.Timestamp;
import java.util.*;

public class ReplyMessage extends Message{

  
  public ReplyMessage(String text,int likes)
  {
   super(text,likes);
  }
  
  
   public String getText()
    {
     return super.getText();   
    }
    
   
   public int getLikes()
    {
    return super.getLikes();    
    }  
  
   void timestamp()
    {  
     Timestamp ts;  
    }
    
    public String toString(User user1,Timestamp timestamp2)
    {
     return timestamp2 + " " + user1 + " "+getText()+" "+getLikes();   
    }
}