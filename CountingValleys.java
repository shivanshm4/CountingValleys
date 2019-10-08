import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        char ch;
        int level=0, valley=0, seaLevel=0, inValley=0;

        for(int i=0;i<n;i++)
        {
            ch=s.charAt(i);
            if(ch=='D')
            {
                level-=1;
                {
                    if(level<seaLevel && inValley==0)
                    {
                        valley+=1;
                        inValley=1;
                    }
                }

            }

            else
            {
                level+=1;
                if(level==seaLevel)
                {
                    inValley=0;
                }
            }
        }

        return valley;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
