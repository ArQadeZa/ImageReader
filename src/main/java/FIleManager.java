import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FIleManager {
    private static File pickFile() {
        JFileChooser fileChooser = new JFileChooser("c://");
        fileChooser.showOpenDialog(new JFrame());
        return fileChooser.getSelectedFile();
    }

    public static void writeToFile() throws IOException {
        File file = pickFile();

        File home = new File(FileSystemView.getFileSystemView().getHomeDirectory() + "\\GeneratedSources");

        File generatedSourcesFile = new File(home + "\\" + file.getName().replace(".PNG", ".txt").replace(".png", ".txt"));
        home.mkdirs();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(generatedSourcesFile));
        bufferedWriter.write(ImageCracker.crackImage(file.getPath()));
        bufferedWriter.close();


        JOptionPane.showMessageDialog(new JFrame(), "File Created");
        System.exit(0);


    }

}
