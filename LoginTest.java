/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import com.mycompany.poe1.Login;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *Unit test for the Login class.
 * These tests ensure that the authentication login behaves correctly
 * 
 * @author ketet
 */
public class LoginTest {
    
    private Login login;
    
    //Setup method runs before each test
    @BeforeEach
    public void setUp() {
        login = new Login("user_1", "Password123!", "Martha", "Adams");
        System.out.println("Setup complete: Login object created.");
    }
    
    //Teardown method runs after each test
    @AfterEach
    public void tearDown() {
        login = null;
        System.out.println("Teardown complete: Login object cleared.");
    }
    
    @Test
    public void testSuccessfullLogin() {
        String result = login.getLoginStatus("user_1", "Password123!");
        assertEquals("Welcome Martha, Adams, it is great to see you again.", result);
    }
    
    @Test
    public void testFailedLogin() {
        String result = login.getLoginStatus("wrongUser", "wrongPass");
        assertEquals("Username or password incorrect, please try again.", result);
    }
    
   
}
