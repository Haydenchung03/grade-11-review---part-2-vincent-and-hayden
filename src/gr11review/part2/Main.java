package gr11review.part2;

import java.io.*;
import gr11review.part2.Utility.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    String str;
    int intInput;
    str = keyboard.readLine();
    intInput = Utility.sumNumbers(str);
    System.out.println(intInput);
  }
}