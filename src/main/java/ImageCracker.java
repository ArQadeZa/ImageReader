import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ImageCracker {
    public static String crackImage(String filepath){
        File imageFile = new File(filepath);
        ITesseract instance = new Tesseract();
        try {
            return instance.doOCR(imageFile);
        }catch (TesseractException e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
