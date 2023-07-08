/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatest;
import static org.junit.Assert.*;

/**
 *
 * @author Bibhakta lamsal
 */
public class ForgotPassTest {
    public static void main(String[] args) {
        // Set up test data
        String username = "bib123";
        String password = "123456";
        String food = "momo";
        
        // Invoke the forgetPassword() method
        String result = forgetPassword(username, password, food);

        // Verify the result
        assertEquals("bib123, 123456, momo", result);   
    }

    public static String forgetPassword(String username, String password, String food){
        return username +  ", " + password + ", " + food;
    }
}
