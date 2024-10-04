import java.io.*;

public class BufferReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("V:/newFile.txt");
            BufferedReader br = new BufferedReader(fr);

            // for (int i = br.read(); i != -1; i = br.read()) {
            //     System.out.print((char) i);
            // }
           String str;
           while((str=br.readLine())!=null){
            System.out.print(str);
           }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
