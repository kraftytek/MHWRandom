

import java.util.Random;

public class RamNumb {

    public static int RanNum(int num) {
        Random rn = new Random();
        int number = rn.nextInt(num - 0);
        return number;
    }
}
