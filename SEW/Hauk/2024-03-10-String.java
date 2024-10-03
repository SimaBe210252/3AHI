package at.litec;
import java.io.File;
import java.util.Properties;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WordProcessor
{

    public static void main(String[] args)
    {

        try {
            Properties p = System.getProperties();
            String userdir =  p.getProperty("user.dir");
            String dir = userdir + "/" + "2024-09-20-String" + "/" + "src/main/resources/input.txt";

            Scanner input = new Scanner(new File(dir));
            input.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File: input.txt not found",e);
        }


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String result = ProcessWord(s);

        System.out.println(result);
    }
    public static String ProcessWord(String s)
    {

        StringBuilder sb = new StringBuilder();


        for (String c : s.split(" "))
        {

            if(c.startsWith("_"))
            {
                c = c.toUpperCase().substring(1);

            }

            if(c.charAt(c.length()-1)== '_' ) {
                c =  c.toLowerCase().substring(0,c.length()-1);

            }

            sb.append(c).append(" ");
        }
        return sb.toString();


    }
}