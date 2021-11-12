import java.util.Arrays;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        // Generates 7 random numbers. 5 numbers are between 1 and 50. 7 numbers are between 1 and 12.
        // Numbers are then sorted into order


        int[] mainNumbers = new Random().ints(1, 50).limit(5).toArray();
        System.out.println("Numbers generated: " + Arrays.toString(mainNumbers));

        int[] bonusNumbers = new Random().ints(1, 11).limit(2).toArray();
        System.out.println("Numbers generated: " + Arrays.toString(bonusNumbers));

    }


}
