package ch16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExam
{
    
    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        Path path = Paths.get("C:\\Users\\user\\git\\SIST_JAVA\\src\\ch16\\");
        Stream<Path> stream = Files.list(path);
        stream.forEach( p -> System.out.println(p.getFileName())); 
        
        
    }
    
}
