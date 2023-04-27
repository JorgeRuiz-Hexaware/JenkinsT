import java.io.*;
import java.lang.*;

public class OpenApp {
  
  String [] a = new String[]{"open","/Applications/Chess.app"};
  public static void main(String[] args) {
    System.out.println("Opening App");
    Runtime.exec(a);
  }
}
