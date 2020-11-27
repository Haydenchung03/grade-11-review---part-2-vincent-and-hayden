package gr11review.part2;
public class Utility{
  public static int sumNumbers(String str){
    int intLength;
    intLength = str.Length();
    int intCount;
    int intSum = 0;
    String strWord = "";
    for(intCount = 0; intCount < intLength; intCount++){
      if(Character.isDigit(strcharAt(intCount))) {
        if (intCount < intLength-1 && Character.isDigit(strCharAt(intCount+1))){
          strWord += strCharAt(intCount);
        }else{
          strWord += strCharAt(intCount);
          intSum += Integer.parseInt(strWord);
          strWord = "";
        }
      }
    }
    return intSum;
  }
}

import gr11review.part2.Utility.*;
public class Utility {
  public static void main(String[] args){

  }
}