package cardgame;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer{
  
	Socket csocket;
	
   MultiThreadServer(Socket csocket) {
      this.csocket = csocket;
   }
   public static void main(String args[]) throws Exception {
	   
	   DataOutputStream out;
	   DataOutputStream out2;
	   int players = 2;
	  
      ServerSocket ssock = new ServerSocket(1234);
      System.out.println("Listening");
      
      Socket sock = ssock.accept();
      System.out.println("Connected");
      players --;
      Socket sock2 = ssock.accept();
      System.out.println("Connected");
      players --;
      if(players ==0) {
    	 out = new DataOutputStream(sock.getOutputStream());
  		 out.writeUTF("Enter your name: ");
  		 out2 = new DataOutputStream(sock2.getOutputStream());
 		 out2.writeUTF("Enter your name: ");
 		 System.out.println("The game is starting...");
 		 Player p1 = new Player();
 		 Player p2 = new Player();
 		 Dealer getCards = new Dealer(p1, p2);
 		 getCards.deal();
 		 out.writeUTF(p1.getHandOfPlayer().get(0).toString());
 		 out2.writeUTF(p2.getHandOfPlayer().get(0).toString());
      }
      
   }
}
