package rwcthv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Methods console = new Methods();
        console.read();
        
        MainInterface GUI = new MainInterface(console.getArray());
        GUI.setVisible(true);
        
        //Az elérési útvonal változhat!
        URL url = new URL("http://localhost/database/send.php");

        ArrayList<URLConnection> conns = new ArrayList<URLConnection>();     
        ArrayList<PrintStream> sends = new ArrayList<PrintStream>();
        
        for (int i = 0; i < console.getArray().size(); i++) {
            conns.add(url.openConnection());
            conns.get(i).setDoOutput(true);
            sends.add(new PrintStream(conns.get(i).getOutputStream()));
        }
        
        for (int i = 0; i < console.getArray().size(); i++) {
            sends.get(i).print("&Sequence=" + console.getArray().get(i).getNumber());
            sends.get(i).print("&Name=" + console.getArray().get(i).getCity());
            sends.get(i).print("&X=" + console.getArray().get(i).getX());
            sends.get(i).print("&Y=" + console.getArray().get(i).getY());
            sends.get(i).print("&random1=" + console.getArray().get(i).getasd());
            sends.get(i).print("&random2=" + console.getArray().get(i).getasd1());
            
            conns.get(i).getInputStream();           
        }        
        
        for (int i = 0; i < console.getArray().size(); i++) {
            sends.get(i).close();
        }
        System.out.println("Feltöltés befejezve");
    }    
}
