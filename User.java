import java.util.*;
import java.util.Scanner;
import java.sql.Timestamp;

public class User{

   private String name;
   private String email;
   ArrayList<User> friendRequests=new ArrayList<User>();
   ArrayList<User> friendsList=new ArrayList<User>();
   ArrayList<String> aWall=new ArrayList<String>();
   ArrayList<User> noFriendsList=new ArrayList<User>();
   

  public User(String name,String email)
  {
    this.name=name;
    this.email=email;
  }
   
   public void setName(String n)
   {
        name=n;
   }
 
   public String getName()
   {
    return name;   
   }  
   
   public void setEmail(String e)
   {
      email=e; 
   }
   
   public String getEmail()
   {
    return email;   
   }
 
 
   public static void sendRequest(User user,User user1)
   {
     user1.friendRequests.add(user);
        
   }
  
   
   
   public static void acceptRequest(User user,User user1)
   {
    if( user != user1 && Network.compareList(user,user1) == false) 
    {  
     user1.friendsList.add(user);
     user.friendsList.add(user1);
     
    }
    else 
    {
     System.out.println("Αυτή η ενέργεια δεν γίνεται καθώς είστε ήδη φίλοι ή πρόκειται για το ίδιο πρόσωπο");     
    }
   }

   public static void rejectRequest(User user,User user1)
   {  
    user1.friendRequests.remove(user);
       
   }
   
   public static void removeFriend(User user,User user1)
   {
    user1.friendsList.remove(user);   
   }

   public void postAtWall(Message aMessage,ReplyMessage aReplyMessage,User user,User user1)
   {
        if(user==user1){
          user.aWall.add(aMessage.toString());
          
    }
    else if (user!=user1 && Network.compareList(user,user1) == true){
          user1.aWall.add(aMessage.toString());
        
    }
    else if(user!=user1 && Network.compareList(user,user1) == true ){
    
          user1.aWall.add(aReplyMessage.toString());
    }
   }

   public boolean likeAmessage(Message message,String like)
   { 
    int x=message.getLikes();
    if(like == "like")
    {  
      x++;
      message.setLikes(x);
      return true;
    }
    else
    {
      return false;
    }
   }
   
   public ArrayList<User> friends(User aUser)
   {
       return aUser.friendsList;
   }
   
   public String toString()
    {
     return name+" με email: "+email;
    }
  
    
  
}




    
  

