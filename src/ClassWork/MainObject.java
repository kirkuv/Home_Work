package ClassWork;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к  файлу или папке: ");
        String inputPath = scanner.nextLine();
        File file = new File(inputPath);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("Ошибка: это файл");
            } else if (file.isDirectory()){
                List<File> txtFiles = new ArrayList<>();
                scanDirectory(file,txtFiles);
                System.out.println("Найденные файлы с расширением .txt");
                for (File txtFile : txtFiles){
                    System.out.println(txtFile.getAbsolutePath());
                }
            }
        }else {
            System.out.println("Ошибка: Указанный путь не существует");
        }
        scanner.close();
    }
    private static void scanDirectory (File directory, List<File> txtFile){
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files){
                if (file.isDirectory()){
                    scanDirectory(file, txtFile); // для подпапок
                } else if (file.isFile() && file.getName().endsWith(".txt")) {
                    txtFile.add(file);
                }
            }
        }
    }
}
