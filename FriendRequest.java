import java.sql.Timestamp;
import java.util.*;

public class FriendRequest  {
  
  
   public FriendRequest(User user1,User user2)
   {
    user1=user1;
    user2=user2;
   }  
   
   
   void timestamp()
    {  
     Timestamp st;  
    }
  
    static void situation(User user,User user1,Timestamp timestamp1)
    {
      
     if(Network.compareList(user,user1) == true)
      {   
       System.out.println("Το αίτημα φιλίας έγινε αποδεκτό"+" "+timestamp1);   
      }
     else if(Network.compareList(user,user1) == false)
      {
       System.out.println(" Το αίτημα φιλίας δεν έγινε αποδεκτό"+" "+timestamp1);
      }
     else 
      {
       System.out.println(" Το αίτημα φιλίας εκκρεμή" + " " + timestamp1);   
      }
    
    } 
}