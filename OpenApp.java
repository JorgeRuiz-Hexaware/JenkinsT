import java.io.*;
import java.lang.*;

public class OpenApp {
  public static void main(String[] args) {
    System.out.println("Opening App");
    Process process = Runtime.getRuntime().exec("open /System/Applications/Books.app");
  }
}
