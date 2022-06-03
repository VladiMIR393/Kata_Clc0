import java.util.Scanner;
import java.util.Arrays;
class Main {
        public static void main(String[] args) throws IllegalArgumentException {
                Scanner pr = new Scanner(System.in);

                String p1 = pr.nextLine();
                String[] calc = p1.split(" ");
                int a, b;
                String c;
                int k;
                c = calc[1];
                String [] arb = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
                String [] rom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                if (calc.length != 3) {
                        throw new IllegalArgumentException("// т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                } else if (Arrays.asList(arb).contains(calc[0]) && Arrays.asList(arb).contains(calc[2])){
                        k = 0;
                        }else if(Arrays.asList(rom).contains(calc[0]) && Arrays.asList(rom).contains(calc[2])) {
                        k = 1;
                }else {
                        throw new IllegalArgumentException("// т.к. один или оба операнда не удовлетворяют условию");
                }
                        try {
                                a = Integer.valueOf(calc[0]);
                                b = Integer.valueOf(calc[2]);

                        } catch (NumberFormatException e) {
                                a = RomanToArabic.RomanToArabic(calc[0]);
                                b = RomanToArabic.RomanToArabic(calc[2]);
                        }
                        if (c.equals("+")) {
                                if (k == 1) {
                                        int d = a + b;
                                        System.out.println(ArabicToRoman.arabicToRoman(d));
                                } else {
                                        System.out.println(a + b);
                                }
                        }if (c.equals("-")) {
                                        if ((k == 1) & (b > a)) {
                                                throw new IllegalArgumentException("т.к. в римской системе нет отрицательных чисел");
                                        } else if (k == 1) {
                                                int d = a - b;
                                                System.out.println(ArabicToRoman.arabicToRoman(d));
                                        } else {
                                                System.out.println(a - b);
                                        }

                        }
                        if (c.equals("*")) {
                                        if (k == 1) {
                                                int d = a * b;
                                                System.out.println(ArabicToRoman.arabicToRoman(d));
                                        } else {
                                                System.out.println(a * b);
                                        }
                        }
                        if (c.equals("/")) {
                                if (k == 1) {
                                        int d = a / b;
                                        System.out.println(ArabicToRoman.arabicToRoman(d));
                                } else if (b != 0) {
                                        System.out.println(a / b);
                                } else {
                                        throw new IllegalArgumentException("// т.к. деление на 0");
                                }

                        }

        }
}