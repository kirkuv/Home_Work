package Home_Work_5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;


public class RandomGenerate {
    public static final Random random = new Random();
    public static String generateRandomString(){
        int lenght = 5 + random.nextInt(6);
        StringBuilder sb = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++) {
            sb.append((char)(random.nextInt(26)+'a'));
        }
        return sb.toString();
    }
    public static String generateRandomRussianString(){
        int lenght = random.nextInt(20);
        StringBuilder sb = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++) {
            sb.append((char)(random.nextInt(32)+1072));
        }
        return sb.toString();
    }
    public static String generateRandomStringN(String [] names){
        return names[random.nextInt(names.length)];
    }
    public static String generateAllSymbol (){
        int lenght = random.nextInt(20);
        StringBuilder sb = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++) {
            sb.append((char)(random.nextInt(255)));
        }
        return sb.toString();
    }
    public static String generateRandomFromFile (String filename) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            List<String> lines = new ArrayList<>();

            while ((line=br.readLine())!=null) {
                if (!line.isEmpty()) {
                    lines.add(line);
                } else if (br.readLine()==null) {
                    throw new IOException("Файл пустой!");
                }
            }
            //if (br.readLine()==null){
             //   throw new IOException("Файл пустой!");}
            if (!lines.isEmpty()) {
                return lines.get(random.nextInt(lines.size()));}
            /*
            if (!lines.isEmpty()) {
                return lines.get(random.nextInt(lines.size()));
            } else if  (br.readLine()==null){
                throw new IOException("Файл пустой!");
            }
            {
                throw new IOException("Файл пустой!");
            }
            */

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден!");
        } catch (IOException e) {
            throw new IOException("Файл пустой!");
        }
return "";
    }
}
