import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.reverse(number));
    }
}

class Solution {
    public int reverse(int number) {
        boolean isPositive = number >= 0;
        if (!isPositive) {
            number = -number;
        }
        String strNumber = String.valueOf(number);

        StringBuilder reStrNumber = new StringBuilder(strNumber);
        reStrNumber.reverse();
        strNumber = String.valueOf(reStrNumber);
        while (strNumber.charAt(0) == '0' && strNumber.length() > 1) {
            strNumber = strNumber.substring(1);
        }
        if (!isPositive) {
            strNumber = "-" + strNumber;
        }

        try {
            number = Integer.parseInt(strNumber);
        } catch (Exception e) {
            number = 0;
        }
        return number;
    }
}
