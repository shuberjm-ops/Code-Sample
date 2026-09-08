import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * CSE 271 Lab W13 Starter Code
 */

public class AddressBook {

    // This is a static instance property that you will add/remove Contact
    // objects from as the user specifies.
    private static ArrayList<Contact> contacts = new ArrayList<Contact>();

    public static void main(String[] args) {
        // When the program begins, we should load in any Contact objects that
        // are already in AddressBook.bin. Also, if that file does not already
        // exist, we should create it.
        Path in = Paths.get("AddressBook.bin");

        if (Files.exists(in)) {
            // AddressBook.bin file already exists, so we should load in the
            // Contacts currently stored in it. Call your load method here.
            
            // ACTION: Call load() method here once implemented!
            load();
        } else {
            try {
                // AddressBook.bin does not exist, so we should make that file
                // so we can later write Contacts to it.
                Files.createFile(in);
                System.out.println(in.toString() + " has been created!");
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        
        // ====================================================== Begin your solution here:
        
        // Getting Started: Create a loop that will continue displaying/executing the menu
        // options for the user until they choose to exit.
        boolean loop = true;
        while(loop == true) {
        	System.out.println("1. Add a contact");
        	System.out.println("2. Remove a contact");
        	System.out.println("3. Save Contacts");
        	System.out.println("4. Load Contacts");
        	System.out.println("5. Display contacts");
        	System.out.println("6. Search for contacts");
        	System.out.println("6. Exit");
        	System.out.print("Please enter your choice: ");
        	Scanner s = new Scanner(System.in);
        	String choice = s.next();
        	if (choice == "1") {
        		add();
        	} else if (choice == "2") {
        		remove();
        	} else if (choice == "3") {
        		save();
        		System.out.println("Contacts saved");
        	} else if (choice == "4") {
        		load();
        		System.out.println("Contacts loaded");
        	}  else if (choice == "6") {
        		search();
        	}
        	else if (choice == "7") {
        		exit();
        		loop = false;
        	} else {
        		System.out.println("Choice could not be recognized. Please try again.");
        	}
        }
    }
    
    // Here is where you will write methods to carry out the menu options...here are sugguestions
    // to get started: 
    
    public static void add() {
    	boolean canAdd = true;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the contact's first name: ");
        String fName = s.next();
        System.out.print("Enter the contact's last name: ");
        String lName = s.next();
        System.out.print("Enter the contact's phone number: ");
        String pNum = s.next();
        System.out.print("Enter the contact's email: ");
        String email = s.next();
        System.out.print("Enter the contact's address: ");
        String address = s.next();
        s.close();
        for (Contact c : contacts) {
        	if (c.getPhoneNum() == pNum) {
        		canAdd = false;
        		break;
        	}
        }
        if (canAdd == true) {
        	Contact con = new Contact(fName, lName, pNum, email, address);
        	contacts.add(con);
        } else if (canAdd == false) {
        	System.out.println("Could not add the contact: duplicate phone number");
        } else {
        	System.out.println("Could not add the contact: something has gone horrifically wrong");
        }
    }
    
    public static void remove() {
    	int holdIndex = 0;
    	boolean isRemoved = false;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the phone number of the contact to be removed: ");
        String pNum = s.next();
        for (Contact c : contacts) {
        	if (c.getPhoneNum() == pNum) {
        		contacts.remove(holdIndex);
        		isRemoved = true;
        		holdIndex -= 1;
        	}
        	holdIndex += 1;
        }
        if (isRemoved == true) {
        	System.out.println("All contacts with phone number" + pNum + " has been removed");
        } else if (isRemoved == false) {
        	System.out.println("Could not remove the contact: number could not be found");
        } else {
        	System.out.println("Could not remove the contact: something has gone horrifically wrong");
        }
        s.close();
    }
    
    public static void displayAll() {
    	for (Contact c: contacts) {
    		System.out.println(c.toString());
    	}
    }
    
    public static void save() {
    	for (Contact c : contacts) {
    		try {
	    		ObjectOutputStream out = new ObjectOutputStream( new
	    				FileOutputStream("AddressBook.bin"));
	    				out.writeObject(c);
    		} catch (FileNotFoundException e) {
    			System.out.println("Error, file could not be found");
    		} catch (IOException ex) {
    			System.out.println("Error, file could not be written to");
    		}

    	}
    }
    
    public static void load() {
    	try {
	    	ObjectInputStream in = new ObjectInputStream( new
	    			FileInputStream("AddressBook.bin"));
	    			while (in.readObject() != null) {
	    				Contact c = (Contact) in.readObject();
	    				contacts.add(c);
	    			}
    	} catch (FileNotFoundException e) {
			System.out.println("Error, file could not be found");
		} catch (IOException ex) {
			System.out.println("Error, file could not be written to");
		} catch (ClassNotFoundException exc) {
			System.out.println("Error, object class could not be found");
		}
    }
    
    public static void exit() {
    	save();
    	System.out.println("All files were saved before exiting");
    }
    
    public static void search() {
    	System.out.print("Enter that phrase being searched for: ");
    	Scanner s = new Scanner(System.in);
    	String looking = s.next();
    	for (Contact c : contacts) {
    		String cont = c.toString();
    		if (cont.contains(looking) == true) {
    			System.out.println(cont);
    		}
    	}
    	s.close();
    }

}
