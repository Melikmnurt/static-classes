package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameFormatterTest {
    @Test
    public void testFormatFirstAndLastName(){

        //Arrange
        String firstName = "Mel";
        String lastName = "Johnson";

        //Act
        String result = NameFormatter.format(firstName, lastName);

        //Assert
        assertEquals("Johnson,Mel", result);
    }
    public void testFormatFullNameWithAllParts(){

        //Arrange
        String prefix = "Dr.";
        String firstName = "Mel";
        String middleName = "B";
        String lastName = "Johnson";
        String suffix = "PhD";

        //Act
        String result = NameFormatter.format(
                prefix,
                firstName,
                middleName,
                lastName,
                suffix
        );
        //Assert
        assertEquals("Johnson, Dr., Mel B, PhD", result);
    }
}
