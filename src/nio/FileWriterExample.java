package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriterExample {
public static void main(String[] args) throws IOException {
	Path path=Paths.get("test.txt");
	String s= "this is file through file writer\n";
	Files.write(path, s.getBytes(),StandardOpenOption.APPEND);
}
}
