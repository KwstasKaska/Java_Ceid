import java.util.*;
import java.sql.Timestamp;

public class Wall{

  private String posts=null;
  private String replies=null;
  private int likes;
  
  ArrayList<Wall> wall=new ArrayList<Wall>();

  public Wall(String posts,String replies,int likes)
  {
   this.posts=posts;
   this.replies=replies;
   this.likes=likes;
  }
   
  
  
    void acceptPost(User user,User user1,Message aMessage)
  {
   if(Network.compareList(user,user1) == false)  
   {
     System.out.println("Δεν μπορείτε να δημοσιεύσετε στον τοίχο του χρήστη"); 
   }
   else if(Network.compareList(user,user1) == true || user==user1)
   {
    System.out.println(aMessage.toString());   
   }
  }
}