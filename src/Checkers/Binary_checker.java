package Checkers;


public class Binary_checker {

    public boolean Number_check(String value) {
        for (int i = 0; i < value.length(); i++) {
            int tempB = value.charAt(i);
            if (tempB != '0' && tempB != '1') {
                System.out.println("Введено число не в 2-ой системе счисления");
                return false;
            }
        }
        return true;
    }
}
