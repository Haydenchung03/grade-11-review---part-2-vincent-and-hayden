package gr11review.part2;

import java.io.*;
import java.io.FileReader;

public class Utility{
  public static int sumNumbers(String str){
    int intLength;
    intLength = str.length();
    int intCount;
    int intSum = 0;
    String strWord = "";
    for(intCount = 0; intCount < intLength; intCount++){
      if(Character.isDigit(str.charAt(intCount))) {
        if (intCount < intLength-1 && Character.isDigit(str.CharAt(intCount+1))){
          strWord += str.CharAt(intCount);
        }else{
          strWord += str.CharAt(intCount);
          intSum += Integer.parseInt(strWord);
          strWord = "";
        }
      }
    }
    return intSum;
  }
}
