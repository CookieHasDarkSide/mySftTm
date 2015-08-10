package workie;


import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by mazha_000 on 1    0.08.2015.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    Splitter testSpl = new Splitter();
        IOSys testIO = new IOSys();

        testIO.write(String.valueOf(testSpl.split(testIO.chckDir())));
    }
}
