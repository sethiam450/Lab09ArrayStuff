import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        Scanner in = new Scanner(System.in);
        int val = rnd.nextInt(100) + 1;
        int index = rnd.nextInt(dataPoints.length);
        int targetVal;
        int targetCount = 0;
        int sum = 0;
        boolean pointFound = false;
        double average = 0;

        for (int k = 0; k < dataPoints.length; k++)
        {
            dataPoints[k] = rnd.nextInt(100) + 1;


        }


        for (int k : dataPoints)
        {
            sum += k;


        }


        average = (double) sum / dataPoints.length;

        System.out.println(" The data set's sum is " + sum + " The data set's average is " + average);

        targetVal = SafeInput.getRangedInt(in, "Enter the target number to be found in the set: ", 1, 100);

        for (int k = 0; k < dataPoints.length; k++)
        {
            if (dataPoints[k] == targetVal)
            {
                targetCount++;
                pointFound = true;
            }
        }
        System.out.println("The entered value appears " + targetCount  + " times in the array");

        for(int k= 0; k < dataPoints.length; k++)
        {
            if (dataPoints[k] == targetVal)
            {
                System.out.println("The target value at the position " + k + " in the array");
                pointFound = true;
                break;
            }
        }
        int max = dataPoints[0];
        int min = dataPoints[99];
        for(int k:dataPoints)
        {
            if(k > max )
            {
                max = k;


            }
            if (k < min )
            {
                min = k;


            }
        }
        System.out.println(" The min is " + min+ " and the max is " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        int sum = 0;
        double average = 0;
        for (int o : values)
        {
            sum += o;

        }
        average = (double) sum / values.length;

        return average;

    }
}