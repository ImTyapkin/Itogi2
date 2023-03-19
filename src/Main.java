import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение, используя латиницу (пример: x+5=7):");
        String uravnenie = scanner.nextLine();

        char[] Array = uravnenie.toCharArray();
        int xPosition = 0;
        int a = 0, b = 0, c = 0;
        boolean plus = true;

        for(int i = 0; i < Array.length; i++){
            switch (i){
                case (0):
                    if(String.valueOf(Array[i]).equals("x")){
                        xPosition = 1;
                    }else {
                        a = Array[i] - '0';
                    }
                    break;
                case (1):
                    if(String.valueOf(Array[i]).equals("-")){
                        plus = false;
                    }
                    break;
                case(2):
                    if(String.valueOf(Array[i]).equals("x")){
                        xPosition = 2;
                    }else {
                        b = Array[i] - '0';
                    }
                    break;
                case (4):
                    if(String.valueOf(Array[i]).equals("x")){
                        xPosition = 3;
                    }else {
                        c = Array[i] - '0';
                    }
            }
        }

        int result = (xPosition == 3 && plus) ? a + b :
                (xPosition == 3) ? a - b :
                        (xPosition == 2 && plus) ? c - a :
                                (xPosition == 2) ? a - c :
                                        (xPosition == 1 && plus) ? c - b : b - c;

        System.out.println("Ввод:" + uravnenie);
        System.out.println("Вывод:" + result);
    }
}