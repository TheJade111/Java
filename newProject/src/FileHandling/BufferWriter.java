import java.io.*;

public class BufferWriter {
    public static void main(String[] args) {
       try{
        FileWriter content=new FileWriter("V:/newFile.txt",true);
        BufferedWriter bw=new BufferedWriter(content);
        bw.write("This is Buffered content!");
        bw.close();
       }
       catch(IOException e){
        e.printStackTrace();
       }
    }
}
