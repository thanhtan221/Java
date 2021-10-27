package AutomatedTestingAndTDD;

import java.util.Scanner;

public class FizzBuzz {
    void fizzbuzz() {
        Scanner sc = new Scanner(System.in);
        int core = sc.nextInt();
        if (core % 3 == 0  ) {
            System.out.println("Fizz");
        } else if (core % 5 == 0) {
            System.out.println("Buzz");
        }else if (core % 3 == 0 && core % 5 == 0 ){
            System.out.println("FizzBuzz");
        }else{
            System.out.println(core);
        }
        int DozensandEvenss = 100/10;
        int units = 100/10;
        if (core < 10 || core > 0) {
            System.out.println(unit(core));
        }
        if (core < 20 || core > 10) {
            System.out.println(Dozens(core));
        }
        if (core < 100 || core >= 20) {
            System.out.println( DozensandEvens(core));
            System.out.println(DozensandEvens(DozensandEvenss) + unit(units));

        }
    }

    public static String unit(int numbers){
         String printing = "";
        switch (numbers){
            case 1:
                printing = " Một ";
            case 2:
                printing = " Hai ";
            case 3:
                printing = " Ba";
            case 4:
                printing = " Bốn ";
            case 5:
                printing = " Năm ";
            case 6:
                printing = " Sáu ";
            case 7:
                printing = " Bảy ";
            case 8:
                printing = " Tám ";
            case 9:
                printing = " Chín ";

        }

 return printing;
    }

    public static String Dozens(int Number10and20) {
        String printing = "";
        switch (Number10and20) {
            case 10:
                printing = "ten";
                break;
            case 11:
                printing = "Eleven";
                break;
            case 12:
                printing = "Twelve";
                break;
            case 13:
                printing = "Thirteen";
                break;
            case 14:
                printing = "Fourteen";
                break;
            case 15:
                printing = "Fifteen";
                break;
            case 16:
                printing = "Sixteen";
                break;
            case 17:
                printing = "Seventeen";
                break;
            case 18:
                printing = "Eighteen";
                break;
            case 19:
                printing = "Nineteen";
                break;
        }
        return printing;
    }

    public static String DozensandEvens(int Number20and100) {
        String printing = "";
        switch (Number20and100) {
            case 20:
                printing = "Twenty";
                break;
            case 30:
                printing = "thirty";
                break;
            case 40:
                printing = "forty";
                break;
            case 50:
                printing = "Fifty";
                break;
            case 60:
                printing = "Sixty";
                break;
            case 70:
                printing = "Seventies";
                break;
            case 80:
                printing = "Eighty";
                break;
            case 90:
                printing = "Ninety";
                break;
        }
        return printing;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzbuzz();

    }
}
