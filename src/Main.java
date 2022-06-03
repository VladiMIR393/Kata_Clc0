import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Main {
        public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        String p1 = pr.nextLine();
        String[] calc = p1.split(" ");
        /*for (int i = 0; i < calc.length; i++)
        {
                System.out.println(calc[i]);
                }   */


                int a, b;
                String c;


                if (calc.length!=3) {
                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                } else {
                        if ()

                        a = Integer.valueOf(calc[0]);
                        b = Integer.valueOf(calc[2]);
                        c = calc[1];
                        if(c.equals("+")){
                                System.out.println(a+b);
                        }
                        if(c.equals("-")){
                                System.out.println(a-b);
                        }
                        if(c.equals("*")){
                                System.out.println(a*b);
                        }
                        if(c.equals("/")){
                                if(b != 0){
                                        System.out.println(a/b);
                                } else{
                                        System.out.println("throws Exception // т.к. деление на 0");
                                }

                        }

                }
                String Rm15 = "IIX";
                int result1 = RomanToArabic.RomanToArabic(Rm15);
                System.out.println(result1);

                int ArXXVII = 27;
                String result2 = ArabicToRoman.arabicToRoman(ArXXVII);
                System.out.println(result2);

        }

}