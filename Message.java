import java.util.Date;
import java.sql.Timestamp;
import java.util.*;

public class Message{

  private String text=null;    
  private int likes=0;
 
   public Message(String text,int likes)
   {
     this.text=text; 
     this.likes=likes;
   }
   
   void setText(String text)
    {
       this.text=text; 
    }
   
   public String getText()
    {
     return text;   
    }
    
   void setLikes(int likes)
    {
     this.likes=likes;   
    }
   
   public int getLikes()
    {
    return likes;    
    }  
    
   void timestamp()
   {  
     Timestamp ts;  
    }

   public  String toString(User user,Timestamp timestamp1)
    {   
     return timestamp1+" "+user+" " + text + " " + likes ; 
    } 
    
}