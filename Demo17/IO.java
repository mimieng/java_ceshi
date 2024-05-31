package Demo17;

import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("D:\\javaSE\\代码2\\xiao-deng-java\\Demo01\\deng.txt");
        BufferedWriter br = new BufferedWriter(fr);
        String line = null;
        int i=0;
       for (i=0;i<5;i++){
            br.write("哈哈哈\r\n");
        }
        br.close();
        fr.close();

    }
}
