package LockedMe_Project;

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
		
	}

	private void addFile() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	private void UI_Menu() {
		// TODO Auto-generated method stub
		System.out.println("\n\nWelcome to the Operations Menu : \n");
		System.out.println("1. Add a file");
		System.out.println("2. Delete a file");
		System.out.println("3. Search for a file");
		System.out.println("4. Return to Main Menu\n");

		
	}}
