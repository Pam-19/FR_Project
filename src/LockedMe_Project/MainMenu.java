package LockedMe_Project;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
	                    Operations k = new Operations();
	                    k.Operations_UI();
	                    
	                    break;
	                case 3:
	                	StayInLoop = false;
	                    System.out.println("Closing the application...");
	                    System.out.println("X--------------------------------------X");

	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.\n ");
	                    break;
	            }
	        }
	    }



	private void displayFiles() {
		// TODO Auto-generated method stub
		String Path = System.getProperty("user.dir");
        List<String> Names = new ArrayList<String>();
        File folder = new File(Path);
        File[] FileList = folder.listFiles();

        if (FileList!=null) {   // to ensure that the list of file names exists and its not an empty folder
                for (File file : FileList) {
                    if (file.isFile()) {   //this check is to ensure that no folders are included in the list of names.
                        Names.add(file.getName());
                    }
                }
               Collections.sort(Names);

                System.out.println(Names);
            }  
            
            else { 
            	System.out.println("Folder is empty");	
            }
        }	        

	private void mainMenu() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Main Menu : \n");
		System.out.println("1. Display existing files");
		System.out.println("2. Operate on files");
		System.out.println("3. Close the app\n");
	}


	public int getUserInput() {
		// TODO Auto-generated method stub
		int ch = 0 ;
		System.out.println("\n");
		InputScanner.initialize();
		
		try {
			ch = InputScanner.nextInt();
			
		} catch (Exception e) {
			System.out.println("Enter only integers");
		}
        //InputScanner.close();
		return ch;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

}

}
