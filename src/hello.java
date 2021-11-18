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
            wallHeights[i] = Float.parseFloat(scanner.next()); // change to .next() which converts to string
            System.out.print("What is the width of wall number " + (i + 1) + " in metres: ");
            wallWidths[i] = Float.parseFloat(scanner.next());

            // Add new variables to total
            totalWidth += wallWidths[i];
            totalHeight += wallHeights[i];
        }


        // Get area of each wall and add together
        int index = 0;
        double squareM = 0.0;
        double[] wallAreas = new double[numberOfWalls];

        // Get area of each wall
        while(index < numberOfWalls);
        {
            wallAreas[index] = wallWidths[index] * wallWidths[index];
            index += 1;
            squareM = squareM + wallAreas[index];
        }

        // get number of cans needed
        double numCansNeededFloat = (squareM / canCoverage);

        // Determine number of cans needed
        if(squareM <= 50)
        {
            cansNeeded = 1;
        }
        else if(squareM >50 && squareM <100)
        {
            cansNeeded = 2;
        }

        // Output number of cans needed
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
