package LockedMe_Project;


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
	                    System.out.println("Closing the application");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	            }
	        }
	    }



	private void displayFiles() {
		// TODO Auto-generated method stub
		
	}

	private void mainMenu() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Main Menu : \n");
		System.out.println("1. Display existing files");
		System.out.println("2. Operate on files");
		System.out.println("3. Close the app");
	}


	public int getUserInput() {
		// TODO Auto-generated method stub
		int ch = 0 ;
		InputScanner.initialize();
		ch = InputScanner.nextInt(); 
        //InputScanner.close();
		return ch;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

}

}
