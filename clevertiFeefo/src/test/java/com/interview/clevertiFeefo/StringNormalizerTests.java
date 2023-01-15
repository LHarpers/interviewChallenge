package com.interview.clevertiFeefo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringNormalizerTests {
    @Autowired
    StringNormalizer stringNormalizer;

    @Test
    public void testJavaEngineerNormalize(){
        Assertions.assertEquals("Software Engineer",
                stringNormalizer.normalizeWords("Java Engineer"));
    }

    @Test
    public void testCEngineerNormalize(){
        Assertions.assertEquals("Software Engineer",
                stringNormalizer.normalizeWords("C# Engineer"));
    }

    @Test
    public void testAccountantNormalize(){
        Assertions.assertEquals("Accountant",
                stringNormalizer.normalizeWords("Accountant"));
    }

    @Test
    public void testChiefAccountantNormalize(){
        Assertions.assertEquals("Accountant",
                stringNormalizer.normalizeWords("Chief Accountant"));
    }

    @Test
    public void testArchitectNormalize(){
        Assertions.assertEquals("Architect",
                stringNormalizer.normalizeWords("Architect"));
    }

    @Test
    public void testSeniorArchitectNormalize(){
        Assertions.assertEquals("Architect",
                stringNormalizer.normalizeWords("Senior Architect"));
    }

    @Test
    public void testQuantitySurveyorNormalize(){
        Assertions.assertEquals("Quantity Surveyor",
                stringNormalizer.normalizeWords("Quantity Surveyor"));
    }

    @Test
    public void testSeniorQuantitySurveyorNormalize(){
        Assertions.assertEquals("Quantity Surveyor",
                stringNormalizer.normalizeWords("Senior Quantity Surveyor"));
    }

}
