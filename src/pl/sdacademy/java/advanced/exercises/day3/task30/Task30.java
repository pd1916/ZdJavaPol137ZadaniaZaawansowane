package pl.sdacademy.java.advanced.exercises.day3.task30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task30 {
    public static void main(String[] args) throws IOException {
        Path dirPath = Path.of("src/pl/sdacademy/java/advanced/exercises/day3/task30");
        Path inputFile = dirPath.resolve("sda.csv");
        if(!inputFile.toFile().exists()) {
            System.out.println("Plik nie istnieje!");
            return;
        }
        List<String> fileContent = getFileContent(inputFile);
        System.out.println("Original file content: " + fileContent);

        List<String> reversedFileContent = reverseFileContent(fileContent);
        System.out.println("Reversed file content: " + reversedFileContent);

        Path outputFile = reverseFileName(inputFile);
        System.out.println("Output file name: " + outputFile.toFile().getName());

        saveFile(outputFile, reversedFileContent);
    }

    private static List<String> getFileContent(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile);
    }

    private static List<String> reverseFileContent(List<String> content) {
        return content.stream()
                .map(input -> new StringBuilder(input).reverse().toString())
                .toList();
    }

    private static Path reverseFileName(Path inputFile) {
        /*
        sda.csv.csv => rozszerzenie to csv
        sda.csv => dsa.csv
        sda.csv => ads
         */
        String fileName = inputFile.toFile().getName();
        int index = fileName.lastIndexOf('.');
        String extensionWithDot = "";
        if(index > 0) {
            extensionWithDot = fileName.substring(index);
            fileName = fileName.substring(0, index);
        }
        String reversedFileName = new StringBuilder(fileName).reverse().append(extensionWithDot).toString();
        return inputFile.getParent().resolve(reversedFileName);
    }

    private static void saveFile(Path outputFile, List<String> content) throws IOException {
        Files.write(outputFile, content);
    }
}
