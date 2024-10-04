import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileClass {
    public static void main(String []args){
        // File f=new File("V:/hyenatrash-requirements.txt");
        // System.out.println(f.exists());
        // System.out.println(f.canWrite());
        // System.out.println(f.length());
        // System.out.println(f.getName());

        // File newFile=new File("V:/newFile.txt");
        // try{
        //     System.out.println(newFile.createNewFile());
        // }
        // catch(IOException e){
        //     e.printStackTrace();
        // }
        // newFile.delete();

                        // FileOutputStream <--- OutputStream


        FileOutputStream outputObj;
        try{
            outputObj=new FileOutputStream("V:/newFile.txt",true);
            String str="This is newly created data!";
    
            char []ch=str.toCharArray();
            for(char x:ch){
                outputObj.write(x);
            }
            outputObj.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

                        // FileInputStream <--- InputStream
     
    FileInputStream inputStream;
    try{
        inputStream=new FileInputStream("V:/newFile.txt");
        for (int i = inputStream.read(); i != -1; i = inputStream.read()) {
            System.out.print((char) i);
        }
        inputStream.close();
    }
    catch(FileNotFoundException e){
        e.printStackTrace();
    }
    catch(IOException e){
        e.printStackTrace();
    }
    }
}