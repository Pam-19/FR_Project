package LockedMe_Project;
import java.io.File;
import java.io.IOException;

public class Operations {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Operations_UI() {
		boolean StayInLoop = true;
        while (StayInLoop) {
            UI_Menu();
            
            int choice = getInput();

            switch (choice) {
                case 1:
                    addFile();
                    break;
                case 2:
                    deleteFile();
                    
                    break;
                case 3:
                	searchFile();
                	
                    break;
                case 4:
                	StayInLoop = false;
                    System.out.println("Returning to Main Menu");
                    break;
                default:
                	
                    System.out.println("Invalid option. Please try again.");
                    break;
		
	}}
}



	public int getInput() {
		int ch = 0 ;
		System.out.println("\n");
		InputScanner.initialize();
		ch = InputScanner.nextInt(); 
        //InputScanner.close();
		return ch;
	}
	private void searchFile() {
		// TODO Auto-generated method stub
		
	}

	private void deleteFile() {
		// TODO Auto-generated method stub
		String Filename;
		System.out.println("\nEnter Name of file to be deleted\n");
		InputScanner.initialize();
		Filename = InputScanner.nextLine();
		File dfile = new File(Filename);
        if (dfile.delete()) {
            System.out.println("File " + Filename+" successfully deleted!! ");
        } else {
            System.out.println("File does not exist...Please try again ");
        }
		
	}

	private void addFile() {
		// TODO Auto-generated method stub
		String name;
		System.out.println("\nEnter Name of file\n");
		InputScanner.initialize();
		name = InputScanner.nextLine();
		 File add = new File(name);
	        try {
	            if (add.createNewFile()) {
	                System.out.println("New file added" );
	            } else {   // checks for duplicate names
	                System.out.println("File exists with same name");
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while creating the file: " + e.getMessage());
	        }
		
	}

	private void UI_Menu() {
		// TODO Auto-generated method stub
		System.out.println("\n\nWelcome to the Operations Menu : \n");
		System.out.println("1. Add a file");
		System.out.println("2. Delete a file");
		System.out.println("3. Search for a file");
		System.out.println("4. Return to Main Menu\n");

		
	}}
