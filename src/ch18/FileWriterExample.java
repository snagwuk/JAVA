package ch18;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

    public static void main(String[] args) throws Exception {
	File file = new File("C:/java/file.txt");
	FileWriter fw = new FileWriter(file,true);
	fw.write("FileWriter�� �ѱ۷� ��"+"\r\n");
	fw.write("���ڿ��� �ٷ� ����� �� �ִ�."+"\r\n");
	fw.flush();
	fw.close();
	System.out.println("���Ͽ� ����Ǿ����ϴ�.");
    }

}
