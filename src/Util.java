public class Util {
    private int[] array;
    private int size;

    public Util(int size) {
        this.size = size;
        this.array = new int[this.size];

        int max = 1000;
        int min = 1;

        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.round((Math.random() * (max - min)) + min);
        }
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + array[i]);
        }
    }

    public int findFirst(int number) {
        for (int i = 0; i < size; i++) {
            if (number == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public int printOddAndCount() {
        int count = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                System.out.println(element);
                count++;
            }
        }

        return count;
    }

    public double calculateAverageValue() {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }

        return sum / size;
    }
}
