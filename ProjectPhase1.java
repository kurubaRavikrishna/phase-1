package phase1mainproject;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class  ProjectPhase1  {
	 static String MY_Dir;
	    File myFolder;

	    public  ProjectPhase1() {
	    	MY_Dir = System.getProperty("user.dir");
	    	myFolder = new File("C:\\Users\\ADMIN\\eclipse-workspace\\assignment\\src\\com");
	        if (!myFolder.exists())
	        	myFolder.mkdirs();
	        System.out.println(" MyFilePath : "+ myFolder.getAbsolutePath());
	        
	    }
	    
	   private static final String WELCOME_TO_MY_COMPANY_PORTAL =
			   
	   "\n Welcome to Project Phase_1  " + "  " + "\n By Ravikrishna company Pvt.Ltd " + " " + "\n my name is : Ravikrishna";
	    
	   private static final String operationview_Need =
	            "\nMAIN MENU - Select any of the following operationviews: \n"+
	                    "1 -> List the types of files in directory\n"+
	                    "2 -> Perfotm functions like Add, Delete or Search\n"+
	                    "3 -> Exit Program";

	    private static final String THE_FUNCTIONALITY_PART =
	            "   \nSelect any of the following  operationviews: \n"+
	                    "   1 -> Add a file\n"+
	                    "   2 -> Delete a file\n"+
	                    "   3 -> Search a file\n"+
	                    "   4 -> GoBack to Logic Part";

	    void menuview() {
	        System.out.println(operationview_Need);
	        try(Scanner scanner = new Scanner(System.in)){
	        	System.out.println("enter your operationview choice based on main menu");
	        	int option = scanner.nextInt();
	        	
	            switch (option){
	                case 1 : {
	                
	                	showListOfFiles();
	                    menuview();
	                }
	                case 2 : {
	                    operationview();
	                }
	                case 3 : {
	                    System.out.println("succesfully closed Thank You");
	                    System.exit(0);
	                }
	                default: menuview();
	            }
	        }
	        catch (Exception e){
	            System.out.println("Please enter 1, 2 or 3");
	            menuview();
	        }
	    }

	    void operationview() {
	        System.out.println(THE_FUNCTIONALITY_PART);
	        try(Scanner scanner = new Scanner(System.in))
	        {
	            char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
	            char logic = input[0];
	            switch (logic){
	                case '1' : {
	                    System.out.print("Please Enter a File Name you want to Add : ");
	                    String filename = scanner.next().trim().toLowerCase();
	                    addFileMethod(filename);
	                    break;
	                }
	                case '2' : {
	                    System.out.print("Please Enter a File Name you want to Delete : ");
	                    String filename = scanner.next().trim();
	                    deleteFileMethod(filename);
	                    break;
	                }
	                case '3' : {
	                    System.out.print("Please Enter a File Name you want to Search For : ");
	                    String filename = scanner.next().trim();
	                    searchFileMethod(filename);
	                    break;
	                }
	                case '4' : {
	                    System.out.println("Going back to main logic part");
	                    menuview();
	                    break;
	                }
	                default : System.out.println("Please enter correct values to search the data in list");
	            }
	            operationview();
	        }
	        catch (Exception e){
	            System.out.println("Please enter correct values to search the data in list");
	            operationview();
	        }
	    }

	    void showListOfFiles() {
	        if (myFolder.list().length==0)
	            System.out.println("The folder is empty");
	        else {
	            String[] list = myFolder.list();
	            System.out.println("The files in "+ myFolder +" are :");
	            Arrays.asList(list);
	            for (String str:list) {
	                System.out.println(str);
	            }
	        }
	    }
	    void addFileMethod(String filename) throws IOException {
	        File filepath = new File(myFolder +"/"+filename);
	        String[] list = myFolder.list();
	        for (String file: list) {
	            if (filename.equalsIgnoreCase(file)) {
	                System.out.println("File " + filename + " already exists at " + myFolder);
	                return;
	            }
	        }
	        filepath.createNewFile();
	        System.out.println("File "+filename+" added to "+ myFolder);
	    }

	    void deleteFileMethod(String filename) {
	        File filepath = new File(myFolder +"/"+filename);
	        String[] list = myFolder.list();
	        for (String file: list) {
	            if (filename.equals(file) && filepath.delete()) {
	                System.out.println("File " + filename + " deleted from " + myFolder);
	                return;
	            }
	        }
	        System.out.println("Delete operationview failed. FILE NOT FOUND");
	    }

	    void searchFileMethod(String filename) {
	        String[] list = myFolder.list();
	        for (String file: list) {
	            if (filename.equals(file)) {
	                System.out.println("FOUND : File " + filename + " exists at " + myFolder);
	                return;
	            }
	        }
	        System.out.println("File Not found (FNF)");
	    }

	    public static void main(String[] args) {
	        System.out.println(WELCOME_TO_MY_COMPANY_PORTAL); 
	        ProjectPhase1 menu = new ProjectPhase1();
	        menu.menuview();
	    }

}


