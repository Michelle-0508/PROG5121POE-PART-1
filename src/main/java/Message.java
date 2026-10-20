
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bring
 */
class Message {
    private int messageNumber;
      private String recipient;
      private String messageID;
      private String messageText;
      private int totalMessages = 0;
      private String getMessageHash;
      
public Message (int messageNumber, String recipient, String messageText) {
    this.messageNumber = messageNumber;
    this.recipient  = recipient;
    this.messageText  = messageText;
    
    Random rand  = new Random();
    StringBuilder sb = new StringBuilder(); 
    
    for (int i = 0; i < 10; i++) {
    }
    this.messageID = sb.toString();
    totalMessages++;
    
}

    public String checkRecipientCell() {
         String clean = recipient.replaceAll("\\s", "");
         if (clean.matches("^\\+27\\d{9}$")) {
             return "cell phone number successfully captured";
         } else {
             return "cell phone number is incorrectly formatted or does not contain an international code"
                + "please correct the number and try again";
         }
        
    }
    public boolean checkMessageID() {
         return messageID != null && messageID.length() == 10;
    }
    
    
    public String getMessageHash() {
        String[] words = messageText.trim().split("\\s+");
        String first = words[0];
        String last = words[words.length - 1];
        String cleanLast = last.replaceAll("[^a-zA-Z0-9]", "");
        String hashText = (first + cleanLast).toUpperCase();
        return messageID.substring(0, 2) 
                + ":" 
                + messageNumber 
                + ":" 
                + hashText;
    }
    
    public int returnTotalMessage() {
        return totalMessages;
    }
    
    public String printMessages() {
        return "MessageID: " + messageID
                +"\nMessage Hash: " + getMessageHash
                +"\nMessage: " + messageText;      
    }

    public Object returnTotalMessages() {
        return totalMessages;
    }

    public String getMessageID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
