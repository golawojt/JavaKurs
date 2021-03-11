public class HomeWorkOne {
    public static void homeWork() {
        int first = 345;
        int second = 3049;
        int third = 20934;
        int fourth = 203;

        int sumOne = first + second;
        int sumTwo = third + fourth;

        if (sumOne % 2 == 0) {
            System.out.println("suma1 parzysta");
        } else {
            System.out.println("suma1 nieparzysta");
        }

        if (sumTwo % 2 != 0) {
            System.out.println("suma2 nieparzysta");
        } else {
            System.out.println("suma2 parzysta");
        }

        if (sumOne % 2 == 0 && sumTwo % 2 == 0) {
            System.out.println("obie sumy są parzyste");
        } else {
            System.out.println("jedna z sum nie jest parzysta");
        }
    }
}
