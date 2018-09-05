package csv_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {

    private Path fileLocation;

    public Reader(String fileName){
        this.fileLocation = Paths.get(fileName);
        try{
            BufferedReader input = Files.newBufferedReader(fileLocation);
        }
        catch (IOException e){
            System.out.println("The file " + fileName + " could not be opened.");
        }
    }
}
