import javax.swing.*;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {

        try {
            FIleManager.writeToFile();
        }catch (Exception e){
            JOptionPane.showMessageDialog(new JOptionPane(),e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

    }
}
