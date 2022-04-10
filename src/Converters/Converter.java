package Converters;

import Checkers.Binary_checker;
import Checkers.Integer_checker;

import java.util.Scanner;

public class Converter {

    Boolean isworking = true;
    private Scanner fromclient = new Scanner(System.in);
    private Integer_checker integer_checkers = new Integer_checker();
    private Binary_checker binary_checker=new Binary_checker();
    private From_10_to_16 from_10_to_16=new From_10_to_16();
    private From_10_to_2 from_10_to_2=new From_10_to_2();
    private From_2_to_10 from_2_to_10=new From_2_to_10();

    public void say_hello() {
        System.out.println("Здравствуйте. Перед Вами консольное приложение, которое позволит перевести число из одной системы счисления в другую.");
    }

    public void instruction() {
        System.out.println("Для конвертации сначала введите код операции, а затем через пробел число, которое хотите конвертировать.\n"+
                "Формат входных данных: числа от 0 до 10000\n"+
                "Коды операций перевода:\n" +
                "1 - из 10 в 16\n" +
                "2 - из 10 в 2\n" +
                "3 - из 2 в 10\n"+
                "Для выхода из приложения введите команду: exit"
        );
    }

    public void work() {
        say_hello();
        instruction();
        while (isworking) {
            String clientcom = fromclient.nextLine();
            String[] input_ar = clientcom.split(" ");
            try {
                if(input_ar.length!=2&&!(input_ar[0].equals("exit")||input_ar[0].equals("info"))){
                    System.out.println("Введено неверное количество элементов или введенные элементы не соответствуют существующим командам\n" +
                            "Для получения инструкции по использованию приложения введите команду: info");
                }else {
                    switch (input_ar[0]) {

                        case ("exit"):
                            System.out.println("Завершение работы приложения");
                            isworking = false;
                            break;
                        case ("1"):
                            if (integer_checkers.Number_check(input_ar[1])) {
                                String answer1 = from_10_to_16.convert(Integer.valueOf(input_ar[1]));
                                System.out.println("Число в 16-ричной системе счисления: " + answer1);
                            }
                            break;
                        case ("2"):
                            if (integer_checkers.Number_check(input_ar[1])) {
                                String answer2 = from_10_to_2.convert(Integer.valueOf(input_ar[1]));
                                System.out.println("Число в 2-ой системе счисления: " + answer2);
                            }
                            break;
                        case ("3"):
                            if (binary_checker.Number_check(input_ar[1])) {
                                String answer3 = from_2_to_10.convert(input_ar[1]);
                                System.out.println("Число в 10-ричной системе счисления: " + answer3);
                            }
                            break;
                        case("info"):
                            instruction();
                            break;
                        default:
                            System.out.println(input_ar[0] + "  - данная команда не существует. Попробуйте ещё раз");

                    }
                }

            }
            catch (ArrayIndexOutOfBoundsException ae){
                ae.getMessage();
                System.out.println("Не были введены элементы");
            }

        }
    }
}
