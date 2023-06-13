package LockedMe_Project;

import java.util.Scanner;

public class MainMenu {
	
	public void DisplayMainMenu(){
		
		 boolean StayInLoop = true;
	        while (StayInLoop) {
	            mainMenu();

	            int choice = getUserInput();

	            switch (choice) {
	                case 1:
	                    displayFiles();
	                    break;
	                case 2:
	                    ManageFiles k = new ManageFiles();
	                    k.displayUI();
	                    
	                    break;
	                case 3:
	                	StayInLoop = false;
	                    System.out.println("Closing the application");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	            }
	        }
	    }

	private void manageFiles() {
		// TODO Auto-generated method stub
		
	}

	private void displayFiles() {
		// TODO Auto-generated method stub
		
	}

	private void mainMenu() {
		// TODO Auto-generated method stub
		System.out.println();
		
	}


	private int getUserInput() {
		// TODO Auto-generated method stub
		int ch = 0 ;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter your choice as an integer!! ");
		ch = sc.nextInt();
		
		return ch;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

}

}
