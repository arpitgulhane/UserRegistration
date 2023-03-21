package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
//        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)

//        boolean result = Pattern.matches("[6-9]{1}[0-9]{9}", "6888889999");
//        boolean result = Pattern.matches("[a-zA-Z0-9]+[@][a-z]+[.][a-z]{2,}", "GOUTHAM123@microsoft.in");
        boolean result = Pattern.matches("[A-Za-z]{3,10}", "GOOD");
        System.out.println("Given input is RIGHT ? \n"+result);
    }

}
