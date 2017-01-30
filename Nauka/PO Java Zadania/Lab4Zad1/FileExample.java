import java.io.File;
import java.io.IOException;
public class FileExample {
    public static void main(String[] args) throws IOException {
        File tmp = new File("/tmp");
        if(tmp.exists()){ //Sprawdzenie czy ścieżka istnieje:
            System.out.println("Ścieżka /tmp istnieje");
        }else{
            System.out.println("Ścieżka /tmp nie istnieje. Kończe program");
        }
        if (tmp.isDirectory()){
            System.out.println("/tmp jest katalogiem!");
        }
        File newFile = new File(tmp, "foobazbar"); // Stworzenie ścieżki wewnątz innej ścieżki
        System.out.println("Nowy plik znajduje się w: " + newFile);
        if(!newFile.exists()){
            newFile.createNewFile(); //Tworzę plik
        }
    }
}

package cwiczenia4.examples;
import javax.swing.JFileChooser;
public class JFileChooserExample {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser(); // Stworzenie klasy
        chooser.setDialogTitle("Wybierz plik"); // Ustawienie tytułu okienka
        int result = chooser.showDialog(null, "Wybierz"); //Otwarcie okienka. Metoda ta blokuje się do czasu wybrania pliku lub zamknięcia okna
        if (JFileChooser.APPROVE_OPTION == result){ //Jeśli użtytkownik wybrał plik
            System.out.println("Wybrano plik: " + chooser.getSelectedFile());
        }else {
            System.out.println("Nie wybrano pliku");
        }
    }
}