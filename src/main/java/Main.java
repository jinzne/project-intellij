public class Main 
{
    public static void main(String[] args)
    {
        printHeader();
        printMessage("Hello, world!");
        
        printHeader();
        printMessage("By: Giang N");
    }
    private static void printMessage(String message)
    {
        System.out.println(message);
    }
    private static void printHello()
    {
        System.out.println("Hello");
    }
    private static void printHeader()
    {
        System.out.println("******************************");
    }
}
