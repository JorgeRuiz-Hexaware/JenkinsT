/** 
 * The HelloWorldApp class implements an application that simply prints "Hello World" to standard output.
 */
public class OpenApp {
  public static void main(String[] args) {
    System.out.println("Opening App");
    Process process = Runtime.getRuntime().exec("open /System/Applications/Books.app");
  }
}
