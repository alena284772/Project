package Checkers;


public class Integer_checker {

    public boolean Number_check(String string) {
        try {
            Integer number=Integer.valueOf(string);
            if(number>=0&&number<=10000){
            return true;}else{
                System.out.println("Неверный формат. Формат входных данных: числа от 0 до 10000");
                return false;
            }
        } catch (NumberFormatException E) {
            System.out.println("Данное число некорректно. Вводимое число должно иметь тип Integer");
            return false;
        }
    }
}
