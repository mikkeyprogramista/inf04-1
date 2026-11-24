
public class Main {
    public static void main(String[] args) {
        Util util = new Util(25);

        util.printArray();

        int index = util.findFirst(10);
        if (index != -1) {
            System.out.println(index);
        }

        System.out.println("Liczby nieparzyste:");
        int count = util.printOddAndCount();
        System.out.println("Razem nieparzystych: " + count);


        double average = util.calculateAverageValue();
        System.out.println("Średnia wszystkich elementów: " + average);
    }
}
