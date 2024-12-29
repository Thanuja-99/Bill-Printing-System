import java.util.*;
class BillPrintingSystem{
	public static void main(String args[]){
		System.out.println("================================================================================================================================");
		System.out.println(" ");
		System.out.println("__          __  _                             _           _ __  __            _");
		System.out.println("\\ \\        / / | |                           | |         (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___   _ __ ___  ___   | |_ ___     _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/_ \\| '_`  _  \\/ _ \\  | __/ _ \\   | | |\\/| |/ _` | '__| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/  | || (_) |  | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__ \\___/   |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println(" ");
		System.out.println("================================================================================================================================");
  
      		System.out.println(" ");
		System.out.println(" ");


                Scanner Input=new Scanner(System.in);

			System.out.print("Enter Customer Phone Number - ");
			String phoneNumber =Input.nextLine();

		System.out.println(" ");
			
			System.out.print("Enter Customer Name - ");
			String name =Input.nextLine();
		
		
			

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================================================================================================================");
		System.out.println(" ");
		System.out.println(" ");
			
			System.out.print("Basmathi Qty(Kg) -");
			Integer Basmathi=Input.nextInt();
			System.out.println(" ");

			System.out.print("Dhal Qty(Kg) -");
			Integer Dhal=Input.nextInt();
			System.out.println(" ");

			System.out.print("Suger Qty(Kg) -");
			Integer Suger=Input.nextInt();
			System.out.println(" ");

			System.out.print("Higland Qty -");
			Integer Higland=Input.nextInt();
			System.out.println(" ");

			System.out.print("Yoghurt Qty -");
			Integer Yoghurt=Input.nextInt();
			System.out.println(" ");


			System.out.print("Flour Qty(Kg) -");
			Integer Flour=Input.nextInt();
			System.out.println(" ");
			
			System.out.print("Soap Qty -");
			Integer Soap=Input.nextInt();
			System.out.println(" ");

		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|                                             _   __  __          _____ __________                                             |");
		System.out.println("|                                            (_) |  \\/  |   /\\   |  __  \\___   ___|                                            |");
		System.out.println("|                                             _  | \\  / |  /  \\  | |__)  |  | |                                                |");
		System.out.println("|                                            | | | |\\/| | / /\\ \\ |  _   /   | |                                                |");
		System.out.println("|                                            | | | |  | |/ ____ \\| | \\  \\   | |                                                |");
		System.out.println("|                                            |_| |_|  |_|_/    \\_\\_|   \\_\\  |_|                                                |");
		System.out.println("|                                                  225,Galle Road,Panadura.                                                    |");
		System.out.println("|                                                                                                                              |");
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		System.out.print  ("|                                                     # Tel  : "+ phoneNumber);
		System.out.println("                                                      |");                                                    
		System.out.print("|                                                     # Name : "+  name);   
		System.out.println("                                                           |");                                                                   
		
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");		
		System.out.print("|                        |");
		System.out.print("        Qty            |");
		System.out.print("      unit price                   |");
		System.out.println("              Price                      |");
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");

///////////////////////////////////////////////////////////////////////////////////////
		System.out.print("|    # Basmathi         ");
		System.out.print(" |         "+ Basmathi);
		System.out.print("            |        250.0                      ");

		double basmathi= 250.0*Basmathi;

		System.out.print("|               "+ basmathi);
		System.out.println("                    |");

/////////////////////////////////////////////////////////////////////////////////////

		System.out.print("|    # Dhal             ");
		System.out.print(" |         "+ Dhal);
		System.out.print("             |        180.0                      ");

		double dhal= 180.0*Dhal;

		System.out.print("|               "+ dhal);
		System.out.println("                     |");

/////////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # Suger            ");
		System.out.print(" |         "+ Suger);
		System.out.print("             |        150.0                      ");

		double suger= 150.0*Suger;

		System.out.print("|               "+ suger);
		System.out.println("                     |");

////////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # Higland         ");
		System.out.print("  |         "+ Higland);
		System.out.print("             |        1200.0                     ");

		double highland= 1200.0*Higland;

		System.out.print("|               "+ highland);
		System.out.println("                    |");

/////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # Youghurt         ");
		System.out.print(" |         "+ Yoghurt);
		System.out.print("             |        50.0                       ");

		double youghurt= 50.0*Yoghurt;

		System.out.print("|               "+ youghurt);
		System.out.println("                     |");


///////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # flour            ");
		System.out.print(" |         "+ Flour);
		System.out.print("             |        120.0                     ");

		double flour= 120.0*Flour;

		System.out.print(" |               "+ flour);
		System.out.println("                     |");


//////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # Soap            ");
		System.out.print("  |         "+ Soap);
		System.out.print("             |        160.0                      ");

		double soap= 160.0*Soap;

		System.out.print("|               "+ soap);
		System.out.println("                     |");

/////////////////////////////////////////////////////////////////////////////////


		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		



		System.out.print("|                   ");
		System.out.print("                             ");
	
		System.out.print("|    Total                          ");

		double total=(basmathi+dhal+suger+highland+youghurt+flour+soap);


		System.out.print("|              "+total);
		System.out.println("                     |");

	        System.out.println("|                                                +-----------------------------------------------------------------------------+");

//////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|                   ");
		System.out.print("                             ");
	
		System.out.print("|    discount(10%)                  ");

		double Discount=(total*10)/100;


		System.out.print("|               "+Discount);
		System.out.println("                     |");





		System.out.println("|                                                +-----------------------------------------------------------------------------+");



/////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|                   ");
		System.out.print("                             ");
	
		System.out.print("|    Price                          ");

		double price=(total-Discount);


		System.out.print("|              "+price);
		System.out.println("                     |");



		System.out.println("+------------------------------------------------+-----------------------------------------------------------------------------+");







		
		}
	}