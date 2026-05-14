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

            //Add a space and the middle name
            formattedName += " " + middleName;
        }
        //Check if the suffix exists
        if (suffix != null && !suffix.isEmpty()){

            //Add a comma, space, and the suffix
            formattedName += ", " + suffix;

        }
        //Return the completed formatted name
        return formattedName;

    }
    //This method formats a complete full name string
    public static String format (String fullName){
        String suffix = "";

        //Check if the full name contains comma
        if (fullName.contains(",")) {

            //Split the name into two parts using the comma
            String[] parts = fullName.split(",");

            //Store the name part before the comma
            fullName = parts[0].trim();

            //Store the suffix after the comma
            suffix = parts[1].trim();
        }
        //Split the remaining full name into separate words
        String[] nameParts = fullName.split(" ");

        //Create variables for each part of the name
        String prefix = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";

        //Check if the first word is a prefix
        if (nameParts[0].endsWith(".")) {

            //Store the prefix
            prefix = nameParts[0];

            //Store the first name
            firstName = nameParts[1];

            //Check if a middle name exists
            if (nameParts.length == 4) {

                //Store the middle name
                middleName = nameParts[2];

                //Store the last name
                lastName = nameParts[3];

            } else {
                //Store the last name when there is no middle name
                lastName = nameParts[2];
            }
        }else {
            //Store the first name
            firstName = nameParts[0];

            //Check if a middle name exists
            if (nameParts.length ==3){

                //Store the middle name
                middleName = nameParts[1];

                //Store the last name
                lastName = nameParts[2];

            }else{
                //Store the last name when there is no middle name
                lastName = nameParts[1];

            }
        }
        //Call the overloaded format method to build the final formatted name
        return format (prefix, firstName, middleName, lastName, suffix);
    }
}
