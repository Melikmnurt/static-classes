package com.pluralsight;

public class NameFormatter {
     //Private constructor prevents anyone from creating a NameFormatter object
    //This class is only supposed to contain static methods

    private NameFormatter() {
    }
        //This method formats a first and last name
        public static String format (String firstName, String lastName) {

        //Return the name in the required format.
            return lastName + " , " + firstName;
    }
}
