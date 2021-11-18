import java.util.Scanner;  // Import the Scanner class

public class hello
{
        public static void main(String[] args)
        {
            // Scanner for taking in input
            Scanner scanner = new Scanner(System.in);

            // Dimensions
            double totalWidth = 0.0;
            double totalHeight = 0.0;
            double canCoverage = 50.0; // metres squared

            // cases for switch
            int cansNeeded = 0;

            // How many walls do they want to cover
            System.out.print("Hello! We'd like to help you work out how many tubs of paint to buy \n");
            System.out.print("How many walls would you like to cover");
            int numberOfWalls = scanner.nextInt();

            // Create arrays for heights and width - amount of items in array equals amount input by user
            float[] wallHeights = new float[numberOfWalls];
            float[]  wallWidths = new float[numberOfWalls];

            for(int i = 0; i < numberOfWalls; i++)
            {
                    System.out.print("What is the height of wall number " + (i + 1) + " in metres: ");
                    wallHeights[i] = scanner.nextFloat();
                    System.out.print("What is the width of wall number " + (i + 1) + " in metres: ");
                    wallWidths[i] = scanner.nextFloat();

                // Add new variables to total
                totalWidth += wallWidths[i];
                totalHeight += wallHeights[i];
            }

           // add together the length of all the walls and then multiply the number by the height of the room, from floor to ceiling
            double squareM = (totalWidth * totalHeight) * numberOfWalls; // fix

            // get number of cans needed
           double numCansNeededFloat = (squareM / canCoverage);

            if(squareM <= 50)
             {
                 cansNeeded = 1;
             }
             else if(squareM >50 && squareM <100)
             {
                 cansNeeded = 2;
             }

             switch(cansNeeded)
             {
                 case (1):
                     System.out.print("You need one tin of paint");
                     break;
                 case (2):
                     System.out.print("You need two tins of paint");
                     break;
                 default:
                     System.out.print("Error calculating how many tins needed");
             }
        }
    }



