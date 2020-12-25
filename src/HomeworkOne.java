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
        
        boolean sumOne = sumEvenOrOdd(numOne,numTwo);
        boolean sumTwo = sumEvenOrOdd(numThree,numFour);
        
        if(sumOne && sumTwo) {
            System.out.println("Both sums are even.");
        } else if (!sumOne && !sumTwo) {
            System.out.println("Both sums are odd.");
        } else {
            System.out.println("The sums are not both even or odd.");
        }
    }
    
    private static boolean sumEvenOrOdd(int sum) {
        int sum = first + second;
        string resultText = "The sum of " + first + " and " + second + " is ";
        boolean evenOrOdd = sum % 2 == 0;
        if (evenOrOdd) {
            resultText += "even";
            System.out.println(resultText + "even.");
        } else {            
            resultText += "odd.";
        }
        System.out.println(resultText);
        return evenOrOdd;
    }
}
