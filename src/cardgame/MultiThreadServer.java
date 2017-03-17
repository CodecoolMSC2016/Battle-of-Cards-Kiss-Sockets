package cardgame;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer implements Runnable {
	static DataOutputStream out;
   static int players = 2;
   Socket csocket;
   MultiThreadServer(Socket csocket) {
      this.csocket = csocket;
   }
   public static void main(String args[]) throws Exception { 
      ServerSocket ssock = new ServerSocket(1234);
      System.out.println("Listening");
      
      while (true) {
         Socket sock = ssock.accept();
         System.out.println("Connected");
         players --;
         out = new DataOutputStream(sock.getOutputStream());
 		 out.writeUTF("Enter your name: ");
         new Thread(new MultiThreadServer(sock)).start();
         if(players == 0){
     		System.out.println("Game is starting..");
         }
        	 
      }
   }
   public void run() {
      try {
         PrintStream pstream = new PrintStream(csocket.getOutputStream());
         for (int i = 100; i >= 0; i--) {
            pstream.println(i + " dont know what will this be yet");
         }
         pstream.close();
         csocket.close();
      } catch (IOException e) {
         System.out.println(e);
      }
   }
}
