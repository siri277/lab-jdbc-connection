package controller;

import java.io.IOException;
import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws IOException {	
	// Fill your code
		ConnectionManager cm = new ConnectionManager();
		cm.getConnection();	
	}
}
