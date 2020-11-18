import java.sql.Timestamp;
import java.util.*;
import java.util.Scanner;

public class Network{
  ArrayList<String> network=new ArrayList<String>();
  ArrayList<String> common=new ArrayList<String>();
  Scanner scanner= new Scanner(System.in);
  
  
   private Network()
   {
    
   }
   
   public void connection(User user,User user1)
   {
    User.acceptRequest(user,user1);
   }

   public  void inputUser(User user) 
   {    
    network.add(user.toString());
   } 
   
   public void deleteUser(User aUser)
   {
    network.remove(aUser.toString());
   }
   
   public ArrayList<User> returnFriends(User aUser)
   {
     return new User(aUser.getName(),aUser.getEmail()).friends(aUser);  
    }
   
  /*
   * ArrayList<User> findCommonFriends(User user,User user1)
   {
       for(String temp:user.friendsList)
     {
         if (user1.friendsList.contains(temp))
         {
            common.add(temp);
        }
     }
     return common;
   }
   */ 
    
    public static boolean compareList(User user1,User user2) 
   {
    boolean isFound=false;   
       
    for (int i = 0; i < user1.friendsList.size(); i++) 
    {
       if (user1.friendsList.get(i).equals(user2.toString()) && user1 != user2) 
       {
                 isFound=true; 
                 break;
       }
                        
    }
     return isFound;
   }
   
    

}
