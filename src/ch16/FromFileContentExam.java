package ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FromFileContentExam 
{
    
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        Path path = Paths.get("src/ch16/linedata.txt");
        Stream<String> stream;
        stream = Files.lines(path,Charset.defaultCharset());
        stream.forEach(System.out :: println);
        stream.close();
        
       System.out.println();
       File file = path.toFile();
       FileReader filereader = new FileReader(file);
       BufferedReader br = new BufferedReader(filereader);
       stream = br.lines();
       stream.forEach(System.out :: println);
       stream.close();
    }
    
}
