import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap; 

public class Machine {
	  
	  
	private HashMap<String,Item> stock;

	private TreeMap<Double, Integer> change;

	private HashMap<Integer, String> menu;

	private double userMoney;


	public void loadChange(Double cat, Integer amount) {
		if (change.get(cat) != null) {
			int oldvalue = change.get(cat);
			change.put(cat, oldvalue + amount);
		}
		else
			change.put(cat, amount);
	}
	public void loadItems(String name,  Double price, Integer amount) {
		if (stock.get(name) != null) {
			Item current = stock.get(name);
			current.setQuantity(current.getQuantity() + amount);
		}
		else {
			Item current = new Item(name, price, amount);
			stock.put(name, current);
		}
	}

	public Machine() {
		stock = new HashMap<String, Item>();

		change = new TreeMap<Double, Integer>();

		menu = new HashMap<Integer, String>();

		userMoney = 0;
	}

	public double getMachineTotal() {
		double total = 0;
		for (Double val : change.keySet())
			total = total + (val * change.get(val));
		return total;
	}


	
	public static void main(String[] args) {
	
//
		
        System.out.println("AUTHORS:\n Mahmood Mehrjoo\n Mohammad Dawood\n Deepan Acharya\n Jose Serna");
        System.out.println("\n CIS 144\n 5/11/2019 \n");

		
	    Scanner input = new Scanner(System.in);
	    boolean mainLoop = true;

	    int choice;
	    while(true){
	        System.out.println("Vending Machine Main Menu\n");
	        System.out.print("1.) Vending Machine\n");
	        System.out.print("2.) HELP and CREDITS \n");
	        System.out.print("3.) Exit\n");
	        System.out.print("\nEnter Your Menu Choice: ");

	        choice = input.nextInt();




	    switch(choice){

	    case 1:
	//main menu selection
		    Scanner inputVend = new Scanner(System.in);
		    boolean VendLoop = true;

		    int choiceVend;
		    while(true){
		        System.out.println("Vending Selection\n");
		        System.out.print("1.) SODA Vending Machine\n");
		        System.out.print("2.) SNACKS Vending Machine\n");
		        System.out.print("3.) HELP and CREDITS \n");
		        System.out.print("4.) Leave Vending Machine\n");
		        System.out.print("\nEnter Your Menu Choice: ");

		        choiceVend = inputVend.nextInt();
		        
		    switch(choiceVend){

		    case 1:
		
	
	    	
	    	
	    	//
			//Definitions
		    	System.out.println("SNACK VENDING MACHINE NEAR BY!\n\n");
		    	Machine airportVending = new Machine();

	        airportVending.menu.put(new Integer(1), "Pepsi");
	        airportVending.menu.put(new Integer(2), "Coca-Cola");
	        airportVending.menu.put(new Integer(3), "DietCoke");
	        airportVending.menu.put(new Integer(4), "Sprite");
	        airportVending.menu.put(new Integer(5),"DietPepsi");
	        airportVending.menu.put(new Integer(6),"Canada Dry");
	        airportVending.menu.put(new Integer(7),"Fanta");
	        airportVending.menu.put(new Integer(8),"Iced Tea");
	        airportVending.loadChange(new Double(0.01), new Integer(100));
	        airportVending.loadChange(new Double(0.02), new Integer(100));
	        airportVending.loadChange(new Double(0.05), new Integer(100));
	        airportVending.loadChange(new Double(0.1), new Integer(100));
	        airportVending.loadChange(new Double(0.2), new Integer(100));
	        airportVending.loadChange(new Double(0.5), new Integer(100));
	        airportVending.loadChange(new Double(1.0), new Integer(100));
	        airportVending.loadChange(new Double(2.0), new Integer(100));


	        airportVending.loadItems("Pepsi", 2.0,  15);
	        airportVending.loadItems("Coca-Cola", 3.20, 18);
	        airportVending.loadItems("DietCoke", 1.75, 19);
	        airportVending.loadItems("Sprite", 4.0, 14);
	        airportVending.loadItems("DietPepsi", 1.5, 13);
	        airportVending.loadItems("Canada Dryt", 2.15, 9);
	        airportVending.loadItems("Fanta", 1.75, 8);
	        airportVending.loadItems("Iced Tea", 2.25, 7);
	        //
	        airportVending.runMachine();
break;
		    case 2:

		    	Machine airportVending2 = new Machine();
		    	System.out.println("DRINK VENDING MACHINE NEAR BY!\n\n");

		    	airportVending2.menu.put(new Integer(9),"Popcorn");
		        airportVending2.menu.put(new Integer(10),"Peanut");
		        airportVending2.menu.put(new Integer(11),"Cashewe");
		        airportVending2.menu.put(new Integer(12),"Jerky");
		        airportVending2.menu.put(new Integer(13),"Almond");
		        airportVending2.menu.put(new Integer(14),"Graham cracker");
		        airportVending2.menu.put(new Integer(15),"Animal cracker");
		        airportVending2.menu.put(new Integer(16),"Cookie");
		        airportVending2.menu.put(new Integer(17),"Pretzel");
		        airportVending2.menu.put(new Integer(18),"Trail mix");
		        airportVending2.menu.put(new Integer(19),"Planters trail");
		        airportVending2.menu.put(new Integer(20),"Boiled egg");
		        
		        airportVending2.menu.put(new Integer(21),"Chips Ahoy");
		        airportVending2.menu.put(new Integer(22),"Fruit by the Foot");
		        airportVending2.menu.put(new Integer(23),"Fruit Gushers");
		        airportVending2.menu.put(new Integer(24),"Pringles");
		        airportVending2.menu.put(new Integer(25),"Pringles® Wavy Classic Salted");
		        airportVending2.menu.put(new Integer(26),"Pringles® Grab & Go Cheddar Cheese");
		        airportVending2.menu.put(new Integer(27),"Pringles® Ranch");
		        airportVending2.menu.put(new Integer(28),"Pringles® Honey Mustard");
		        airportVending2.menu.put(new Integer(29),"Pringles® Jalapeño");
		        airportVending2.menu.put(new Integer(30),"Candy & Chocolate");
		        airportVending2.menu.put(new Integer(31),"Salad");
		        airportVending2.menu.put(new Integer(32),"Gummy");
		        
		        
		        airportVending2.loadChange(new Double(0.01), new Integer(100));
		        airportVending2.loadChange(new Double(0.02), new Integer(100));
		        airportVending2.loadChange(new Double(0.05), new Integer(100));
		        airportVending2.loadChange(new Double(0.1), new Integer(100));
		        airportVending2.loadChange(new Double(0.2), new Integer(100));
		        airportVending2.loadChange(new Double(0.5), new Integer(100));
		        airportVending2.loadChange(new Double(1.0), new Integer(100));
		        airportVending2.loadChange(new Double(2.0), new Integer(100));



		        airportVending2.loadItems("Popcorn", 2.0, 9);
		        airportVending2.loadItems("Peanut", 3.20, 12);
		        airportVending2.loadItems("Cashewe", 1.75, 15);
		        airportVending2.loadItems("Jerky", 4.0, 13);
		        airportVending2.loadItems("Almond", 1.5, 12);
		        airportVending2.loadItems("Graham cracker", 2.15, 17);
		        airportVending2.loadItems("Animal cracker", 1.75, 15);
		        airportVending2.loadItems("Cookie", 2.25, 14);
		        airportVending2.loadItems("Pretzel", 2.75, 13);
		        airportVending2.loadItems("Trail mix", 3.25, 16);
		        airportVending2.loadItems("Planters trail", 3.0, 5);
		        
		        airportVending2.loadItems("Chips Ahoy", 1.5, 7);
		        airportVending2.loadItems("Fruit by the Foot", 2.15, 14);
		        airportVending2.loadItems("Fruit Gushers", 1.75, 11);
		        airportVending2.loadItems("Pringles", 2.25, 10);
		        airportVending2.loadItems("Pretzel", 2.75, 9);
		        airportVending2.loadItems("Pringles® Wavy Classic Salted", 3.25, 5);
		        airportVending2.loadItems("Pringles® Grab & Go Cheddar Cheese", 3.0, 16);
		        
		        airportVending2.loadItems("Pringles® Ranch", 1.5, 13);
		        airportVending2.loadItems("Pringles® Honey Mustard", 2.15, 8);
		        airportVending2.loadItems("Pringles® Jalapeño", 1.75, 23);
		        airportVending2.loadItems("Candy & Chocolate", 2.25, 21);
		        airportVending2.loadItems("Salad", 2.75, 19);
		        airportVending2.loadItems("Gummy", 3.25, 11);
		        airportVending2.runMachine();
			    
	        
		   
		    
		    break;
		    case 3:
                System.out.println("\nThis Vending Machine Includes two Main Menu, DRINK MENU and SNACK MENU \nand it is in different Location of chicago!");
                System.out.println("If One item is out of stock , you can add its quantity.");
                System.out.println("if you have any question, You can Contact me by Email");
                System.out.println("vending.mach@soda.com\n");

                System.out.println("\n\n Mahmood Mehrjoo\n\n Mohammad Dawood\n\n Deepan Acharya\n\n Jose Serna\n\n");
                System.out.println("\nPlease enter a selection, $ to add credit, HELP to get information or EXIT to quit: ");
              
		    	break;
		    case 4: 
		    	 VendLoop = false;

		    	 break;
		    	 

		    }
		    break;
		    }  break;
		   

	    case 2: 
	           System.out.println("\nThis Vending Machine Includes two Main Menu, DRINK MENU and SNACK MENU \nand it is in different Location of chicago!");
               System.out.println("If One item is out of stock , you can add its quantity.");
               System.out.println("if you have any question, You can Contact me by Email");
               System.out.println("vending.mach@soda.com\n");
               System.out.println("\n\n Mahmood Mehrjoo\n\n Mohammad Dawood\n\n Deepan Acharya\n\n Jose Serna\n\n");
               System.out.println("\nPlease enter a selection, $ to add credit, HELP to get information or EXIT to quit: ");
             
 	        break;

	    case 3: 
	        System.out.println("Exiting Program...");
	        System.exit(0);
	         break;
	    default :
	             System.out.println("This is not a valid Menu Option! Please Select Another");
	             break;

	    }
		
	    }
		
		
		
		
		//
		
		
       
        

    }

	
    public void buyItem(Integer sel, double money) {

    	Item current = this.stock.get(this.menu.get(sel));
    	double expected = current.getPrice();
    	if (money > expected) {
    		if (expected - money < this.getMachineTotal()) {
    			this.dispenseItem(current);
    			this.makeChange(money - expected);
                this.userMoney = (double) (money - expected);
                
    		}
    		else
    			System.out.println("Sorry ! Not enough change. Aborting operation");
    	}
    	else
    		System.out.println("Sorry, Insufficent funds ! Please insert  "+(expected - money)+" to buy this item");


    }

    public void dispenseItem(Item newItem) 
 
    {
    	
    	newItem.setQuantity(newItem.getQuantity()-1);
    	
    	if ((newItem.getQuantity() < 0))
    			{
    		
    		
    		System.out.println(newItem.getName() + " is out of stock");
    
            
    		Scanner input1 = new Scanner(System.in);
    		System.out.println("How many " + newItem.getName() + "do you want to add ?");
    		int n = input1.nextInt();
    		newItem.setQuantity(newItem.getQuantity()+ n);
    		System.out.println("Now " + newItem.getName() + " is stack");
    		 System.out.println("Item " +  newItem.getName() + " : " + n + " left");
    			}
    	else
    	
    	
    	{	
    		
            Random rand = new Random();
            int rand_int1 = rand.nextInt(+900000000);
            int rand_int2 = rand.nextInt(+900000000);
    	System.out.println("==================== Print Receipt ====================");
    	System.out.println("Please take the " + newItem.getName() + " from the drawer");
    	System.out.println("The Serial Number of "  +  newItem.getName() + " Sn#" + rand_int1);
    	System.out.println("Your Transaction : " + rand_int2);
    	System.out.println("Item " +  newItem.getName() + " : "+ newItem.getQuantity() + " left");
    }

    }
  
    
    
    
    
    
    
    
    public void runMachine() {

    	
    	
        String[] arr={"Lincoln Ave", "Western Ave", "Ashland Ave", "Wilson Ave", "Addison Ave"};
        String[] arr1={"Lincoln Ave", "Western Ave", "Ashland Ave", "Wilson Ave", "Addison Ave"};
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
        int randomNumber1=r.nextInt(arr1.length);
    	
    	
    	
    	System.out.println("===== Welcome to JAVA Vending Machine ===== \n");
					Scanner input = new Scanner(System.in);
			    	System.out.println("=MACHINE 1: DRINK MENU");
			    	System.out.println("=Location : " + arr[randomNumber]);
			    	
			    	
			    	
			    	for (Integer number : this.menu.keySet())
			        {
			        	String name = this.menu.get(number);
			        	if(this.stock.get(name) != null)
	
			    			        		
			        	if((int) number <=8)
			        		
			       {

			        		System.out.println("	Press " + (int) number + " for "+ name + " price "+ this.stock.get(name).getPrice() + "$ == " + this.stock.get(name).getQuantity() + " in Stock");
			        }
			        	
			        	
			        }
			    	System.out.println("");
			    	System.out.println("=MACHINE 2 : SNACK MENU");
			     	System.out.println("=Location : " + arr1[randomNumber1]);
			        	
			    	for (Integer number : this.menu.keySet())
			        {
			        	String name = this.menu.get(number);
			        	if(this.stock.get(name) != null)
	
			    			        		
			        	if((int) number >8)
			        		
			       {

			        		System.out.println("	Press " + (int) number + " for "+ name + " price "+ this.stock.get(name).getPrice() + "$ == " + this.stock.get(name).getQuantity() + " in Stock");
			        }
			        	
			        	
			        }
			    	
			    	
			    	
			        System.out.println("");
			        System.out.println("Please enter coins and bills followed by * to start selection: ");
			        boolean exit = false;
			        while (true)
			        {
			        	while (input.hasNext()) {

			        		if (input.hasNextDouble())
			        			this.userMoney = this.userMoney + input.nextDouble();
			        		else if (input.next().equals("*"))
			        			break;
			        	}
			            while (!exit) {

			                System.out.println("Amount credited: "+this.userMoney);
			                
			                System.out.println("Please enter a selection, $ to add credit, HELP to get information or EXIT to quit: ");

			            	if(input.hasNextInt()) {
			            		int selection = input.nextInt();
			                    if (this.menu.containsKey(selection))
			                        buyItem(selection, this.userMoney);
			            		else
			            			System.out.println("Enter a valid menu item");
			            	}
			                else {

			                    String command = input.next();
			                    if (command.equals("$")) {

			                        System.out.println("Please enter coins and bills followed by * to add credit");
			                        while (input.hasNext()) {
			                            if (input.hasNextDouble())
			                            this.userMoney = this.userMoney + input.nextDouble();
			                            else if (input.next().equals("*"))
			                            break;
			                        }

			                    }
			                    
			                    else if (command.equals("Help") || command.equals("HELP") || command.equals("help")) {

			                        System.out.println("\nThis Vending Machine Includes two Main Menu, DRINK MENU and SNACK MENU \nand it is in different Location of chicago!");
			                        System.out.println("If One item is out of stock , you can add its quantity.");
			                        System.out.println("if you have any question, You can Contact me by Email");
			                        System.out.println("\n\n Mahmood Mehrjoo\n\n Mohammad Dawood\n\n Deepan Acharya\n\n Jose Serna\n\n");
			                        System.out.println("\nPlease enter a selection, $ to add credit, HELP to get information or EXIT to quit: ");
			                        break;
			                    }
			                    
			                    
			                    
			                    
			                    else if (command.equals("EXIT") || command.equals("Exit") || command.equals("exit")) {

			                        System.out.println("Goodbye ! Have a nice day");
			                        System.exit(0);
			                    }
			                }
			            }

			        }
			    }
				


    public void makeChange(Double needed)
    {
        System.out.println("Change needed :"+needed);
    	double temp = needed;
    	for (Double value : this.change.descendingMap().keySet()) {

    		int numCoins = (int) (temp  / value.doubleValue());
    		temp = temp % value.doubleValue();
    		if (numCoins > 0) {
    			int old = this.change.get(value).intValue();
    			if (numCoins < old) {
    				this.change.put(value, new Integer(old - numCoins));
    				System.out.println("Please take your " + numCoins + " coin of "+ value);
    			}
    		}
    	}
    }
}