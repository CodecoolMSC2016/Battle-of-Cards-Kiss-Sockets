package cardgame;

import java.net.*;
import java.util.List;
import java.util.Scanner;
import java.awt.image.DataBufferUShort;
import java.io.*;

public class Client {
	
	static Socket socket;
	static DataInputStream in;
	static DataOutputStream out;
	
	public static void main(String[] args) throws Exception {
		System.out.println("Connecting...");
		socket = new Socket("localhost", 1234);
		System.out.println("Connection successfull!");
		in = new DataInputStream(socket.getInputStream());
		System.out.println("Receiving information, waiting for players..");
		String print = in.readUTF();
		System.out.println(print);
		String getHand = in.readUTF();
		System.out.println(getHand);
		
		
	}
	
}
