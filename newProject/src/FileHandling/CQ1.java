import java.util.Scanner;
import java.util.*;
import java.io.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
      String fileName=in.next();
      printDuplicateWords(fileName);
    }
  public static void printDuplicateWords(String fileName){
    String result="";
    LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
    try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
    {
      String temp;
      while((temp=br.readLine())!=null){
        String tokens[]=temp.split(" ");
        for(int i=0;i<tokens.length;i++){
          if(map.containsKey(tokens[i])){
          map.put(tokens[i],map.get(tokens[i])+1);
        }
        else{
          map.put(tokens[i],1);
        }
        }
      }
    }
    catch(IOException e){}
    try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
    {
      String temp;
      while((temp=br.readLine())!=null){
        String []tokens=temp.split(" ");
        for(int i=0;i<tokens.length;i++){
          if(map.containsKey(tokens[i]) && map.get(tokens[i])>1){
            result=result+tokens[i]+"*"+map.get(tokens[i]);
            if(i<tokens.length-1){
              result+=" ";
            }
            map.remove(tokens[i]);
          }
        }
        result+="\n";
      }
    }
    catch(IOException e){}
    System.out.println(result);
  }
}