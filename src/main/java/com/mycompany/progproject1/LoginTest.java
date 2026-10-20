/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progproject1;
import org.junit.Test;
/**
 *
 * @author bring
 */
public class LoginTest {
    Login login = new Login();
    @Test
    public void testUserNameCorrectlyFormatted() {
        assertEquals(true, login.checkUserName("mich_05"));
    }
    @Test
    public void testUserNameIncorrectlyFormatted(){
        assertEquals(false, login.checkUserName("miche_08"));
    }
    @Test
    public void testPasswordMeetsComplexity() {
        assertEquals(true, login.checkPasswordComplexity("@nxati15!"));
    }
    @Test
    public void testPasswordDoesNotMeetComplexity() {
        assertEquals(false, login.checkPasswordComplexity("xilombe"));
    }
    @Test
    public void testCellPhoneCorrectlyFormatted() {
        assertEquals(true, login.checkCellPhoneNumber("+27 89 654 4152"));
    }
    @Test
    public void testCellPhoneIncorrectlyFormatted() {
        assertEquals(false, login.checkCellPhoneNumber("+27 09 876 7654"));
    }
    @Test
    public void testLoginSuccessful() {
        login.registerUser("mich_05", "@nxati15!", "+27 89 654 4152");
        assertTrue(login.loginUser("mich_05", "@nxati15!"));
    }
    @Test
    public void testLoginFailed() {
        login.registerUser("mich_05", "@nxati15!", "+27 89 654 4152");
        assertFalse(login.loginUser("miche_08", "xilombe"));
    }
    @Test
    public void testReturnLoginStatusSuccess() {
        assertEquals("welcome Michelle Shirindza, it is nice to see you again");
        login.returnLoginStatus(true, "michelle", "shirindza");
    }
    @Test
    public void testReturnLoginStatusfailed() {
        assertEquals("password or username incorrect, please try again");
        login.returnLoginStatus(false, "michelle", "shirindza");
    }

    private void assertEquals(String password_or_username_incorrect_please_try) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(boolean b, Object checkUserName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertFalse(boolean loginUser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertTrue(boolean loginUser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private static class Login {

        public Login() {
        }

        private boolean registerUser(String username, String password, String phone) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private boolean loginUser(String loginUsername, String loginPassword) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private boolean returnLoginStatus(boolean success, String firstName, String lastName) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object checkUserName(String mich_05) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object checkPasswordComplexity(String nxati15) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object checkCellPhoneNumber(String _89_654_4152) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
