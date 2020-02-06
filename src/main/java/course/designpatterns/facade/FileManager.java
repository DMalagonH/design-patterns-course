package course.designpatterns.facade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class FileManager {

    public int countCharacters(String filePath) {

        URL resource = getClass().getClassLoader().getResource(filePath);
        if(resource == null) {
            return -1;
        }

        File file = new File(resource.getFile());

        int count = 0;

        try(FileReader fileReader = new FileReader(file)) {
            try(BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line = bufferedReader.readLine();
                while (line != null) {
                    count += line.length();
                    line = bufferedReader.readLine();
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return count;
    }
}
