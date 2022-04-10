package Converters;

public class From_2_to_10 {

    public String convert(String number){
        String converted=String.valueOf(Integer.parseInt(number,2));
        return converted;
    }
}
