import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fis_OK;
        try{
            fis_OK = new FileInputStream("C:\\Users\\48883\\Desktop\\plik.txt");
        } catch (FileNotFoundException e_OK){
            System.out.println("Nie ma pliku");
            return;
        }
        try {
            int bajt_OK;
            try{
                do{
                    bajt_OK = fis_OK.read();
                    if (bajt_OK !=-1){
                        System.out.println((char)bajt_OK);
                    }
                }while (bajt_OK !=-1);
            } catch (IOException e_OK) {
                System.out.println("Nie moge otworzyć pliku");
            }
        } finally {
            fis_OK.close();
        }
    }
}
