package cardgame;

import java.net.*;
import java.io.*;

public class Server {
	
	static ServerSocket server;
	static Socket socket;
	static DataOutputStream out;
	
	public static void main(String[] args) throws Exception{
		System.out.println("Server started... ");
		server = new ServerSocket(7776);
		System.out.println("Server started");
		socket = server.accept();
		System.out.println("Connection from: " + socket.getInetAddress());
		out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF("Bleeeh");
		System.out.println("Data has been sent.");
	}
}
