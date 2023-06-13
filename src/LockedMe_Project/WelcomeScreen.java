package LockedMe_Project;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WelcomeScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		        displayWelcomeScreen();
		        try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
				}

		        MainMenu m = new MainMenu();
		        m.DisplayMainMenu();
		        	

		       
		        }
		    

		    private static void displayWelcomeScreen() {
		        System.out.println("Welcome to LockedMe.com");
		        System.out.println("This project is owned and operated by Company Lockers Pvt Limited");

		        System.out.println("Developer: Anupam Hari");
		        System.out.println();
		    }


	}


