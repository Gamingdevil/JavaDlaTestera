public class HomeworkOne {
    public static void main(String[] args) {
//      1. 4 int variables
//      2. Check if the sum of two first is even or odd
//      3. Check if the sum of third and four is even or odd
//      4. Check if both sums are even or odd

        int numOne = 34;
        int numTwo = 3;
        int numThree = 42;
        int numFour = 16;
        
        sumEvenOrOdd(sumEvenOrOdd(numOne,numTwo),sumEvenOrOdd(numThree,numFour));
    }
    
    private static int sumEvenOrOdd(int first, int second) {
        int sum = first + second;
        string resultText = "The sum of " + first + " and " + second + " is ";
        if (sum % 2 == 0) {
            System.out.println(resultText + "even.")
        } else {
            System.out.println(resultText + "odd.")
        }
        return sum;
    }
}
