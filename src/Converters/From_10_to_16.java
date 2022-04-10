package Converters;

public class From_10_to_16 {

    public String convert(Integer number){
        String converted=Integer.toHexString(number).toUpperCase();
        return converted;
    }
}
