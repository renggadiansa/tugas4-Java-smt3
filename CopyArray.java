import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 0; i < destinationArray.length; i++) {
            System.out.print(destinationArray[i] + " ");
        }
    }
}
