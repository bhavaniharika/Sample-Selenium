package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingValidation {
@Test
public void test1() {
String mystr="Bhavani";
Assert.assertTrue(mystr.contains("Bhavani"), "Name are matching");
}
@Test
public void test2() {
String mystr="harika";
Assert.assertTrue(mystr.contains("ammu"), "Name are not matching");
}
@Test
public void test3() {
Assert.assertEquals(12, 13, "Dropdown count does not match plz check with developer");


}
@Test
public void test4() {
Assert.assertEquals(13, 13, "Dropdown count does not match plz check with developer");


}
}