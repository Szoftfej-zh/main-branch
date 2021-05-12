package rwcthv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Methods console = new Methods();
        console.read();
        
        MainInterface GUI = new MainInterface(console.getArray());
        GUI.setVisible(true);
        
        //Az elérési útvonal változhat!
        URL url = new URL("http://localhost/database/send.php");
        URLConnection conn = url.openConnection();
        
        conn.setDoOutput(true);
        PrintStream send = new PrintStream(conn.getOutputStream());
        
        
        
        for (int i = 0; i < console.getArray().size(); i++) {
            send.print("&Sequence=" + console.getArray().get(i).getNumber());
            send.print("&Name=" + console.getArray().get(i).nameOfCity);
            send.print("&X=" + console.getArray().get(i).getX());
            send.print("&Y=" + console.getArray().get(i).getY());
            send.print("&random1=" + console.getArray().get(i).getasd());
            send.print("&random2=" + console.getArray().get(i).getasd1());
            
            conn.getInputStream();
        }
        
        send.close();
    }    
}
