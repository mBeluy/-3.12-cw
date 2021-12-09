import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int bajt_OK;
        FileInputStream fis_OK = null;
        FileOutputStream fos_OK = null;
        try{
            fis_OK = new FileInputStream("C:\\Users\\48883\\Desktop\\plik.txt");
            fos_OK = new FileOutputStream("Zapisano.txt");
            do{
                bajt_OK = fis_OK.read();
                if ((char) bajt_OK == ' ') bajt_OK = '-';
                if(bajt_OK !=-1) fos_OK.write(bajt_OK);
            } while (bajt_OK !=-1);
        } catch (IOException e_OK){
            System.out.println("błąd wejścia - wyjścia");
        }
    }
}
