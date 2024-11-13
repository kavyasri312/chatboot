import java.util.Scanner;
public class SimpleChatbot {
public static String chatbotResponse(String userInput) 
{
userInput =userInput.toLowerCase();
if(userInput.contains("hello") || userInput.contains("hii"))
{
return "Hello! How can i assist you today?";
}
else if
(userInput.contains("how are you"))
{
return "Iam just a bot,but I'm doing well! What about you?";
}
else if
(userInput.contains("your name"))
{
return "I'm a simple rule based chatbot.";
}
else if (userInput.contains("bye") || userInput.contains("goodbye"))
{
return "Goodbye! Have a great day!";
}
else if (userInput.contains("thank you") || userInput.contains("thanks"))
{
return "You are welcome! I'm here to help.";
}
else if(userInput.contains("weather"))
{
return "I can't check the weather,but I hope  it's nice where you are!";
}
else if(userInput.contains("help"))
{
return "I'm here to assist you with basic queries like greetings,or saying goodbye.";
}
else if(userInput.contains("your age"))
{
return "I don't have any age,but I'm always learning!";
}
else{
return "Sorry,I didn't get that.Can you rephrase?";
}
}
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Chatbot: Hello! Type 'exit' to end the conversation.");
while(true)
{
System.out.println("You:");
String userInput = scanner.nextLine();
if(userInput.equalsIgnoreCase("exit"))
{
System.out.println("Chatbot:Goodbye!");
break;
}
String response = chatbotResponse(userInput);
System.out.println("Chatbot: " +response);
}
scanner.close();
}
}
