package Demo16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class io {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\javaSE\\代码2\\xiao-deng-java\\Demo01\\hello.txt");//创建对象来读取
        BufferedReader br = new BufferedReader(fr);//缓冲流优点可以一行一行读
        String line = null;

        while((line= br.readLine())!=null){//如果最后文件里面是空的就停止
            System.out.println(line);
        }
        fr.close();
        br.close();

    }
}
