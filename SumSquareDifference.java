public class SumSquareDifference
{
    public static long sumOfTheSquares(int bound)
    {
        long sum = 0;
        for(int i = 0; i <= bound; i++) sum += (long) Math.pow(i, 2);
        return sum;
    }

    public static long squareOfTheSum(int bound)
    {
        long sum = 0;
        for(int i = 0; i <= bound; i++) sum += i;
        return (long)Math.pow(sum, 2);
    }

    public static void printDifference(int bound)
    {
        long difference = Math.abs(sumOfTheSquares(bound) - squareOfTheSum(bound));
        System.out.println("Difference between the sum of the squares of the first " + bound + " natural numbers and the square of the sum: " + difference + ".");
    }

    public static void main(String[] args)
    {
        printDifference(100);
    }
}
