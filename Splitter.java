package workie;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by mazha_000 on 10.08.2015.
 */
public class Splitter {


    public static int split() throws FileNotFoundException {
        int myMaxCount =0;
        int count=0;
        IOSys a = new IOSys();
        String line = a.chckDir();

        int[] inLine = new int[line.length()];
        String[] mySLine = new String[line.length()];

        Scanner sc = new Scanner(line);
        if(sc.hasNext()) {
            mySLine = sc.next().split("");
        }
        for (int i = 0 ; i<mySLine.length; i++) {
            inLine[i] = Integer.valueOf(mySLine[i]);
        }
        for (int i = 0; i < inLine.length; i++) {

            if (inLine[i] == 0) {
                count++;
                if (count > myMaxCount) {
                    myMaxCount = count;
                }
            }if(inLine[i] == 1) count = 0;

        }
        System.out.println(myMaxCount);
            return myMaxCount;
        }

}
