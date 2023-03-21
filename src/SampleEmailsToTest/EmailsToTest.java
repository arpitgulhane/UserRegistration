package SampleEmailsToTest;

import java.util.regex.Pattern;

public class EmailsToTest {
    public static void main(String[] args) {
//        boolean Email = Pattern.matches("[a-zA-Z0-9]+[@][a-z]+[.][a-z]{2,}", "arpit99@microsoft.in");
        boolean Email = Pattern.matches("[a-zA-Z0-9]+[@][a-z]+[.][a-z]{2,}", "abc100@yahoo.com");
        System.out.println("Email is Valid ? \n"+Email);

    }
}
