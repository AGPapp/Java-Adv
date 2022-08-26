import java.util.Random;
public class Zadanie3Array {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        int maxMinus = -10;
        int minPlus = 10;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getRandom();
            System.out.print(myArray[i] + " ");
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) {
                if (myArray[i] < minPlus) {
                    minPlus = myArray[i];
                }
            } else if (myArray[i] < 0) {
                if (myArray[i] > maxMinus) {
                    maxMinus = myArray[i];
                }
            }
        }
        System.out.print("\n");
        System.out.println("Максимальный отрицательный "+maxMinus);
        System.out.println("Минимальный положительный "+minPlus);

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == maxMinus) {
                myArray[i] = minPlus;
            } else if (myArray[i] == minPlus) {
                myArray[i] = maxMinus;
            }else continue;

        }
        System.out.print("\n");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

    }

    static int getRandom(){
        int min = -10;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }

}
