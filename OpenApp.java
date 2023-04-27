import java.io.*;
import java.lang.*;

public class OpenApp {
  public void main(String[] args) {
    System.out.println("Opening App");
    Runtime.exec(new String[]{"open","/Applications/Chess.app"});
  }
}
