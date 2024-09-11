public class Main {

    public static void main(String[] args) {
        printFactors(6);
        System.out.println();
        printFactors(32);
        System.out.println();
        printFactors(10);
        System.out.println();
        printFactors(-1);

    }

    private static void printFactors(int number) {
        if (number < 1){
            System.out.println("Invalid Number Choice");
        }

        for (int i = 1; i <= number; i++){

            if (number % i == 0){
                System.out.print(i + " ");
            }
            //If so print it use System.out.print() not System.out.println().  Don't forget a space between
            //If not don't do anything
        }


    }

}
