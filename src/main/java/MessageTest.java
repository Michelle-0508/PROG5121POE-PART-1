
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bring
 */
public class MessageTest {
     //message under 250 characters
    @Test
    public void testMessageLengthSuccess() {
        String message = "hi Mike, can you join us for dinner tonight?";
        assertEquals(
           true,
           message.length() <= 250
        );
    }
    
    //message over 250 characters
     @Test
    public void testMessageLengthFailure() {
        String message = "this a very long message that is being used "
                +"to test what happens when the message exceeds"
                +"the maximum number of characters allowed by"
                +"the quickchat application. the purpose of"
                +"this test is to make sure that the application"
                +"does not accept messages that are too long.";
        assertEquals(
           true,
           message.length() > 250
        );
    }
    
    //valid recipient
    @Test 
    public void testRecipientSuccess() {
        Message message = new Message(
                0,
                "+27718693002",
                "hi Mike, can you join us for dinner tonight?"
        );
        assertEquals(
            "cell phone number successfully captured.",
             message.checkRecipientCell()
        );
    }
    
    //invalid recipient
    @Test
    public void testRecipientFailure() {
        Message message = new Message(
            1,
            "08575975889",
            "hi keegan, did you receive the payment?"
        );
        assertEquals(
            "cell phone number is incorrectly formatted or does not contain an international code."
             + "please correct the number and try again",
             message.checkRecipientCell() 
        );
    }
    
    //message ID 
    @Test
    public void testMessageID() {
        Message message = new Message(
            0,
            "+27718693002",
            "hi Mike, can you join us for dinner tonight?"
        );
        assertEquals(
            true,
            message.checkMessageID()
        );
        assertEquals(
            10,
            message.getMessageID()   
        );
    }
    
    //message hash
    @Test
    public void testMessageHash() {
         Message message = new Message(
            0,
            "+27718693002",
            "hi Mike, can you join us for dinner tonight?"
        );
        String hash = message.getMessageHash();
        /*
         *the first two digits of the ID are random,
         *therefore we check the structure.
         *
         *expected format:
         *
         *XX:0:HITONIGHT
         */
        
        assertTrue(
            hash.matches("\\d{2}:0:HITONIGHT")
        );
    }
    
    //total number
    @Test
    public void testTotalMessages() {
         Message message = new Message(
            0,
            "+27718693002",
            "hi Mike, can you join us for dinner tonight?"
        );
        assertEquals(
            2,
            message.returnTotalMessages()
        );
    }

    private void assertEquals(boolean b, boolean b0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(int i, Object returnTotalMessages) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertTrue(boolean matches) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String string, String checkRecipientCell) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
