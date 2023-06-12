package LockedMe_Project;

public class MainMenu {
	
	public void DisplayMainMenu(){
		
		 boolean StayInLoop = true;
	        while (StayInLoop) {
	            UI_Menu();

	            int choice = getUserInput();

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
	                    System.out.println("Returning to the main menu.");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	            }
	        }
	    }

	private void UI_Menu() {
		// TODO Auto-generated method stub
		
	}

	private void searchFile() {
		// TODO Auto-generated method stub
		
	}

	private void deleteFile() {
		// TODO Auto-generated method stub
		
	}

	private void addFile() {
		// TODO Auto-generated method stub
		
	}

	private int getUserInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

}

}
