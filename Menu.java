import java.util.*;
import java.util.Scanner;
import java.sql.Timestamp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;

public abstract class Menu
{
 public static final String SHOW_WALL_COMMAND = "1";
 public static final String SHOW_FRIENDS_WALL_COMMAND = "2";
 public static final String SEND_FRIEND_REQUESTS_COMMAND = "3";
 public static final String ACCEPT_REJECT_REQUEST_COMMAND = "4";
 public static final String SHOW_FRIENDLIST_COMMAND = "5";
 public static final String BACK_COMMAND = "6";
 public static final String SIGN_OUT_COMMAND = "7";
 public static final String EXIT_COMMAND = "exit";
 public static final String POST_MESSAGE = "9";
 public static final String REPLY_MESSAGE= "10";
 public static final String LIKE = "11";
 
 
  public static void showMainMenu()
  {
    System.out.println("[1] See your wall ");
    System.out.println("[2] See friends wall ");
    System.out.println("[3] Send friend request ");
    System.out.println("[4] Accept/Reject friend request ");
    //System.out.println("[5] Reject friend request ");
    System.out.println("[5] See my friends ");
    System.out.println("[6] Back");
    System.out.println("[7] Sing Out");
    System.out.println("[8] Exit");
    System.out.println(" ");
    System.out.print(" *> ");
  }
 
  public static void showMenu2()
   {
    System.out.println("[9] Post a message ");
    System.out.println("[10] Reply to a message  ");
    System.out.println("[11] Like ");
    
    
    }

    public static void showUsersWall(BufferedReader br,User user)
  {
   System.out.println(user.aWall.toString());
  }
  
  static void showFriendsWall(BufferedReader br,User user)
  {
   int z=0;
   System.out.println(user.aWall.get(z).toString());   
  }
  
  public static void sendRequest1(BufferedReader br,User user)
  {
       int m=0;  
       User.sendRequest(user,user.noFriendsList.get(m));
  }

  public static void acceptRequest1(BufferedReader br,User user)
  { int j=0;
    User.acceptRequest(user,user.friendRequests.get(j));
  }  
  
  public static void rejectRequest1(BufferedReader br,User user)
  { int j=0;
    User.rejectRequest(user,user.friendRequests.get(j));
  }  
  
  public static void showFriends(BufferedReader br,User user)
  { 
    System.out.println("Η λίστα των φίλων του "+ user.getName() +" είναι η: "+user.friendsList.toString());
  }  
  
  public static void LogIn(ArrayList<User> users)
  {
     Scanner scanner= new Scanner(System.in);
     System.out.print("Enter your username: ");
     String username = scanner.nextLine();
    
    
  }
  
  
  public static void main(String args[]) throws IOException
    {
     
        
        
     ArrayList<ReplyMessage> messages1=new ArrayList<ReplyMessage>();
     
     Timestamp timestamp1=new Timestamp(System.currentTimeMillis());
     Timestamp timestamp2=new Timestamp(System.currentTimeMillis());
     
     Scanner scanner= new Scanner(System.in);
     Scanner scannerMessage= new Scanner(System.in);
     Scanner scannerL= new Scanner(System.in);
     Scanner scannerReplyMessage= new Scanner(System.in);
     
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     User user=new User("kwstas","kwstas@gmail.com");
     User user1=new User("mariada","mariada@gmailcom");
     User user2=new User("dimitris","dimitris@gmail.com");
     User user3=new User("maria","maria@gmail.com");
     User user4=new User("giwrgos","giwrgos@gmail.com");
     User user5=new User("giannis","giannis@gmail.com");

     
     ReplyMessage aReplyMessage=new ReplyMessage("ek ",2);
     ReplyMessage aReplyMessage1=new ReplyMessage("er ",4);
     ReplyMessage aReplyMessage2=new ReplyMessage("epq ",6);
     ReplyMessage aReplyMessage3=new ReplyMessage("epqq ",8);
     
     user.noFriendsList.add(user1);
     user.noFriendsList.add(user2);
     
     
     user1.noFriendsList.add(user);
     user1.noFriendsList.add(user5);
     user1.noFriendsList.add(user3);     
     
     user2.noFriendsList.add(user);
     user2.noFriendsList.add(user4);
     
     user3.noFriendsList.add(user1);
     user3.noFriendsList.add(user5);
     
     user4.noFriendsList.add(user2);
     
     user5.noFriendsList.add(user1);
     user5.noFriendsList.add(user3);
     
     User.sendRequest(user1,user);
     User.sendRequest(user2,user1);
     User.sendRequest(user4,user5);
     User.sendRequest(user3,user);
     User.sendRequest(user5,user2);
     
     Message aMessage=new Message("pe",5);
     user.aWall.add(aMessage.toString());
     user.aWall.add(aReplyMessage.toString()); 
     
    ArrayList<User> users=new ArrayList<User>();
    users.add(user);
    users.add(user1);
    users.add(user2);
    users.add(user3);
    users.add(user4);
    users.add(user5);
    
    System.out.print("Enter your username: ");
    String username = scanner.nextLine();
    
    for(int w=0;w<users.size();w++)
    {
        if(username.equals(users.get(w).getName()))
        {
          users.get(w);
          
      
        
        while(true)
        {
            
            showMainMenu();
            String input = br.readLine();
            System.out.println(input);
            
           /* do{
                    try{
                        input= scanner.nextLine();
                    }catch (InputMismatchException exception) {
                        System.out.println("Integers only, please.");
                        System.out.println("[*] > ");
                        scanner.nextLine();
                    }
                } while(false);
            */
            System.out.println("...your response goes here...");
            System.out.println();
            

            if(input.length() == EXIT_COMMAND.length() && input.toLowerCase().equals(EXIT_COMMAND))
            {
                System.out.println("Exiting.");
                return;
            }
            else if(input.length() == SHOW_WALL_COMMAND.length() && input.toLowerCase().equals(SHOW_WALL_COMMAND))
            {
                Menu.showUsersWall(br,users.get(w));
            }
            else if(input.length() == SHOW_FRIENDS_WALL_COMMAND.length() && input.toLowerCase().equals(SHOW_FRIENDS_WALL_COMMAND))
            {
                while(true)
              {
                showMenu2();
                 System.out.println("Η λίστα των φίλων σου είναι : "+users.get(w).friendsList.toString());    
                System.out.println("Διάλεξε το φίλο για δείς τον τοίχο του: ");    
                int z = scanner.nextInt();    
                Menu.showFriendsWall(br,users.get(w).friendsList.get(z));
                //showMenu2();
                String input1 = br.readLine();

           
                   if (input1.length() == POST_MESSAGE.length() && input1.toLowerCase().equals(POST_MESSAGE))
                    {
                     System.out.println("Enter your message");
                     String oneMessage=scannerMessage.nextLine();
                     users.get(z).aWall.add(oneMessage);
                     /*Εξαιρέσεις
                      * try{
                         if(Network.compareList(users.get(w),users.get(w).friendsList.get(j)) ==false)
                         { throw new Exception();
                            }
                        } catch (Exception exception)
                           {System.out.println("These two users aren't friends...");
                              break;
                            }
                       */ 
                
                    }
                    else if(input1.length() == REPLY_MESSAGE.length() && input1.toLowerCase().equals(REPLY_MESSAGE))
                    {
                        Enumeration<String> enm= Collections.enumeration(users.get(w).aWall);
                        while(enm.hasMoreElements())
                   
                        { for(int l=0;l<users.get(w).aWall.size();l++)
                            {
                           System.out.println(l+" "+ enm.nextElement());
                            }
                           System.out.println("Choose a message ");
                           int t=scannerL.nextInt();
                           System.out.println(users.get(w).aWall.get(t));
                           System.out.println("Enter your message ");
                            String oneReplyMessage=scannerMessage.nextLine();
                             users.get(z).aWall.add(oneReplyMessage);
                           
                        } 
                      }
                     else if(input1.length() == LIKE.length() && input1.toLowerCase().equals(LIKE))
                   {
                      Enumeration<String> enm= Collections.enumeration(users.get(w).aWall);
                      while(enm.hasMoreElements())
                      {
                   
                         for(int l=0;l<users.get(w).aWall.size();l++)
                            {
                           System.out.println(l+" "+ enm.nextElement());
                            }
                            System.out.println("Choose a message");
                           int t=scannerL.nextInt();
                           System.out.println(users.get(w).aWall.get(t).toString());
                       
                      }
                 }
             }
          }
        else if(input.length() == SEND_FRIEND_REQUESTS_COMMAND.length() && input.toLowerCase().equals(SEND_FRIEND_REQUESTS_COMMAND))
            {   
               
                System.out.println("H λίστα των χρηστών που δεν είναι φίλοι με τον "+users.get(w).getName() +" είναι "+users.get(w).noFriendsList);
                System.out.println();
                System.out.print("Επιλέξτε  χρήστη απο την λίστα: ");
                int m=scanner.nextInt();
                System.out.println();
                Menu.sendRequest1(br,users.get(w));
                System.out.println();
                System.out.println("Ο  χρήστης " + users.get(w).toString() + " έστειλε αίτημα φιλίας στον/στην " + users.get(w).noFriendsList.get(m).toString());
                /*Εξαιρέσεις
                 * try
                {
                   if(Network.compareList(users.get(w),users.get(w).noFriendsList.get(m)) == false)
                   {
                       throw new Exception();
                   }
                }
                catch (Exception exception)
                {
                    System.out.println("these two users aren't friends...");
                    break;
                }
                */
            } 
            else if(input.length() == ACCEPT_REJECT_REQUEST_COMMAND.length() && input.toLowerCase().equals(ACCEPT_REJECT_REQUEST_COMMAND))
            {  
               
               System.out.println("Η λίστα αιτημάτων φιλίας του "+ users.get(w).getName() +" είναι η: "+users.get(w).friendRequests);
               System.out.println();
               System.out.print("Επιλέξτε  χρήστη απο την λίστα αιτημάτων ");
               int j=scanner.nextInt(); 
               System.out.println();

               System.out.print("1 για Αποδοχή ,2 για Απόρριψη του αιτήματος: ");
               int q=scanner.nextInt(); 
               
               switch(q)
               { 
               case 1: Menu.acceptRequest1(br,users.get(w));
                       System.out.println();
                       System.out.println("O χρήστης "+users.get(w).getName()+" είναι πλέον φίλος με τον χρήστη "+users.get(w).friendRequests.get(j).getName());
                       break;
               case 2: Menu.rejectRequest1(br,users.get(w));
                       System.out.println();
                       System.out.println("Ο χρήστης " + users.get(w).getName() + " απέρριψε το αίτημα φιλίας του χρήστη "+users.get(w).friendRequests.get(j).getName());
                       break;
              }
           }
            else if(input.length() == SHOW_FRIENDLIST_COMMAND.length() && input.toLowerCase().equals(SHOW_FRIENDLIST_COMMAND))
            {
                System.out.println();
                Menu.showFriends(br,users.get(w));
                System.out.println();
            }
            else if(input.length() == BACK_COMMAND.length() && input.toLowerCase().equals(BACK_COMMAND))
            {
              System.out.println(" ");  
              int back=scanner.nextInt();
              switch(back)
              {
              case 1:
              
              case 2:
              
              case 3:
              
              case 4:
              
              case 5:
              
              }
                
            }
            else if(input.length() == SIGN_OUT_COMMAND.length() && input.toLowerCase().equals(SIGN_OUT_COMMAND))
            {
               
              System.out.print("Πατήστε 1 για Αποσύνδεση: ");
              int exit=scanner.nextInt();
              System.out.println();
              
            
             
             
              System.out.print("Θέλετε να συνδεθείτε με άλλο λογαριασμό?Type 1 for Yes or type 2 for No ");
              int connect=scanner.nextInt();
             switch(connect)
               {
              case 1: Menu.LogIn(users); 
               
              case 2: return ;
             }
             
               
            } 
      }   
    } 
  }
         System.out.println();
          System.out.println();
 }   
}
