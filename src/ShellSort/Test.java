package ShellSort;

public class Test {
    public static void main(String[] args) {
        
        int[] intArray = {12, 1, -20, -12, 30, 4};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;


            }
        }

        for (int j : intArray) {
            System.out.println(j);

        }
    }
}
