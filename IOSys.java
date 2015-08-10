package workie;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.Files.exists;

/**
 * Created by mazha_000 on 10.08.2015.
 */
public class IOSys {
    private static String url = null;
        public String chckDir() throws FileNotFoundException {
            Scanner sc = new Scanner(System.in);
            url = sc.nextLine();
            IOSys.exists(url);
            String line = IOSys.read(url);
            return line;
        }

    private static void exists(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        File nicol = new File(url);
        exists(fileName);
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(nicol.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();}
}
