package importerTXT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImporterTXT {
    // Reader

    // public List<String> take10000WorstPass() throws FileNotFoundException, IOException {
    public List<String> take10000WorstPass(String path) throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        List<String> passwords = new ArrayList<String>();
        try {
            // Apertura del fichero y creacion de BufferedReader
            // archivo = new File ("C:\\top10000-worst-passwords.txt");
            archivo = new File (path);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura
            String line;
            while((line = br.readLine()) != null) {
                passwords.add(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar fichero si esta bien como tambien si salta una excepcion
            try {
                if(null != fr){
                    fr.close();
                }
            } catch(Exception e2){
                e2.printStackTrace();
            }
        }
        return passwords;
    }

}
