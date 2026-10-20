package com.mycompany.progproj1;
import java.util.Scanner;


public class PROGproj1{

    private static int option;
    public static void main(String[] args) {
            Scanner myInput = new Scanner(System.in);
            System.out.print("enter first name:");
            String firstName = myInput.nextLine();
            System.out.print("enter last name:");
            String lastName = myInput.nextLine();
            System.out.print("enter Username:");
            String username = myInput.nextLine();
            System.out.print("enter Password:");
            String password = myInput.nextLine();
            System.out.print("enter cell phone number:");
            String phone = myInput.nextLine();
            Login login = new Login();
            System.out.println(login.registerUser(username, password, phone));
            System.out.println();
            System.out.print("login Username:");
            String loginUsername = myInput.nextLine();
            System.out.print("login Password:");
            String loginPassword = myInput.nextLine();

            boolean success = login.loginUser(loginUsername, loginPassword);
            System.out.println(login.returnLoginStatus(success, firstName, lastName));

            

            
            System.out.println("please choose an option");
            System.out.println("1. send messages");
            System.out.println("2. show recently sent messages");
            System.out.println("3. quit");
            System.out.println("enter option");
            option = myInput.nextInt();
            int option = 0;
            myInput.nextLine();
            boolean running = true;
            while (running) {
                System.out.println("\n--- Menu---");
                System.out.println("1. send messages");
                System.out.println("2. show recently sent messages");
                System.out.println("3. quit");
                System.out.println("enter option");

                String line = myInput.nextLine().trim();
                line = line.replace(".", "").trim();

                try {
                    option = Integer.parseInt(line);
                } catch (Exception e) {
                    System.out.println("invalid option. please choose 1, 2 or 3 ");
                }
            }

            switch (option) {
                case 1: {
                    sendMessages(myInput);
                }
                case 2:
                    System.out.println("coming soon");
                    break;
                case 3:
                    System.out.println("goodbye");
                    running = false;
                    break;
                default:
                    System.out.println("invalid option. please chose 1, 2 or 3");
                    break;
            }
 

        Scanner scanner = new Scanner(System.in);
        int numberOfMessages = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 1; i <= numberOfMessages; i++) {
            System.out.println();
            System.out.println("===== Message" + i + "=====");
            System.out.println("enter recipient number");
            String recipient = scanner.nextLine();
            System.out.println("enter your message");
            String messageText = scanner.nextLine();
           
            
            if (messageText.length() > 250) {
                System.out.println("Message exceeds 250 characters" + "please reduce the size");
                i--;
            }
            Message message = new Message(i, recipient, messageText);
                boolean recipientResult = message.checkRecipientCell();
            System.out.println(recipientResult);
            
            if (message.checkMessageID()) {
                System.out.println("messageID generated" + message.getMessageID());
            } else {
                System.out.println("messageID is invalid");
                i--;
            }
            
            System.out.println("message hash" + message.getMessageHash());
            System.out.println("send message");
            System.out.println("disregard message");
            System.out.println("store message to send later");
            System.out.println("choose an option");
            int messageChoice = Integer.parseInt(scanner.nextLine().trim());
           
            
            switch (messageChoice) {
                case 1:
                   System.out.println("message successfully sent");
                   System.out.println();
                   System.out.println("message.printMessages()");
                   break;
                case 2:
                    System.out.println("press 0 to delete the message");
                    break;
                case 3:
                    storeMessage(message);
                    System.out.println("message successfully stored");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
            
            if (messageText.length() > 250) {
                System.out.println("Message exceeds 250 characters" + "please reduce the size");
                i--;
            }
            message = new Message(i, recipient, messageText);
            System.out.println(recipientResult);
            
            if (message.checkMessageID()) {
                System.out.println("messageID generated" + message.getMessageID());
            } else {
                System.out.println("messageID is invalid");
                i--;
            }
            
            System.out.println("message hash" + message.getMessageHash());
            System.out.println("send message");
            System.out.println("disregard message");
            System.out.println("store message to send later");
            System.out.println("choose an option");
            
            switch (messageChoice) {
                case 1:
                   System.out.println("message successfully sent");
                   System.out.println();
                   System.out.println("message.printMessages()");
                   break;
                case 2:
                    System.out.println("press 0 to delete the message");
                    break;
                case 3:
                    storeMessage(message);
                    System.out.println("message successfully stored");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }  
        }
    }
    
    public static void storeMessage(Message message) {
        System.out.println("message stored in messages.json");
    }
    
    public static void sendMessages(Scanner scanner) {
        System.out.println("how many messages do you want to send?");
        int count;
        try {
            count = Integer.valueOf(scanner.nextLine().trim());  

        } catch (Exception e) {
            count = 1;
        }
        for (int i = 1; i <= count; i++) {
            System.out.println("\nenter recipient: ");
            String recipient = scanner.nextLine().trim();
            String text = null;
            Message msg = new Message(i - 1, recipient, text);
            System.out.println(msg.checkRecipientCell());
            System.out.println("MessageID: " + msg.getMessageID());
            System.out.println(msg.printMessages());
        }
    }
}    


