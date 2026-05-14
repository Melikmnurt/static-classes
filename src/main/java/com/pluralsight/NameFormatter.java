package com.pluralsight;

public class NameFormatter {
     //Private constructor prevents anyone from creating a NameFormatter object
    //This class is only supposed to contain static methods

    private NameFormatter() {
    }
        //This method formats a first and last name
        public static String format (String firstName, String lastName) {

        //Return the name in the required format.
            return lastName + ", " + firstName;
    }
    //This method formats a full name with optional parts
    public static String format (String prefix,
                                 String firstName,
                                 String middleName,
                                 String lastName,
                                 String suffix){
        //String building the formatted name with the last name.
        String formattedName = lastName + ", ";

        //Check if the prefix exists.
        if (prefix != null && !prefix.isEmpty()){

            //Add the prefix and a space
            formattedName += prefix + " ";
        }
        //Add the first name
        formattedName += firstName;

        //Check if the middle name exists
        if (middleName != null && !middleName.isEmpty()){

            formattedName += ", " + suffix;

            //Add a space and the middle name
            formattedName += " " + middleName;
        }
        //Check if the suffix exists
        if (suffix != null && !suffix.isEmpty()){

        }
        //Return the completed formatted name
        return formattedName;

    }
    //This method formats a complete full name string
    public static String format (String fullName){

    }
}
