package javasolutionsforalgorithms.general.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public void writeInFile() throws IOException {
        String basePath = "C:\\Users\\MikeHenry\\JavaProjects\\LeetCoding\\src\\javasolutionsforalgorithms\\general\\files\\testfiles\\";
        String newFileName = basePath + "write_to_file_sample.txt";
        File file = new File(newFileName);

        if (file.createNewFile()) {
            System.out.println("Created new file");
        } else {
            System.out.println("File already exists");
        }

        String sampleContent = "This is in effort ot write to file \nP.S. Let us see";

        FileWriter fileWriter = new FileWriter(newFileName);
        fileWriter.write(sampleContent);
        System.out.println("Completed writing to file");
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        WritingToFile writingToFile = new WritingToFile();
        writingToFile.writeInFile();
    }
}
