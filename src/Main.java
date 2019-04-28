import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reDo();
		
		
	}

	private static void reDo() {
		System.out.println("Enter your Name");
		Scanner a = new Scanner(System.in);
		
		Function function = new Function();
		
		function.name = a.nextLine();
		
		
		System.out.println("Enter your choice \n 1 for Rock, \n 2 for Paper,\n and 3 for Scissors");
		
		int userInput =a.nextInt();
		
		

		switch (function.computerValue())
        {
           case 1:
              System.out.println ("Computer value is Rock.");
              if (userInput == 3)
            	  System.out.println(" winner = COMPUTER");
              else
                 if (userInput == 2)
                	 System.out.println(" winner = " + function.getName() );
                 else
                	 System.out.println(" winner = TIE");
              break;

           case 2:
              System.out.println ("Computer value is Paper.");
              if (userInput == 1)
            	  System.out.println("winner = COMPUTER");
              else
                 if (userInput == 3)
                	 System.out.println("  winner =" + function.getName() );
                 else
                	 System.out.println(" winner = TIE");
              break;

           case 3:
              System.out.println (" Computer value is Scissors.");
              if (userInput == 2)
            	  System.out.println("winner = COMPUTER");
              else
                 if (userInput == 1)
                	 System.out.println(" winner =" + function.getName());
                 else
                	 System.out.println("winner = TIE");
        }
		
		Scanner b = new Scanner(System.in);
		
		System.out.println("If you want to PLAY AGAIN Please type \n'Y' for Yes  \n and \n 'N' for No");
		
		
		String reDo = b.nextLine();
		

		if (reDo.equalsIgnoreCase("y")) {
			reDo();
		}
		b.close();
		

		}
	

	}
	
