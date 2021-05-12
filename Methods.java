package rwcthv;

import java.io.*;  
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    ArrayList<Data> array;
    
    Methods() {
        array = new ArrayList<Data>();
    }
    
    public void read() throws FileNotFoundException{
            //Az elérési útvonal változhat!
            File file = new File("C:\\Users\\Felhasználó\\Desktop\\Egyetem\\Szoftfej\\zh\\sg500.csv");
            Scanner in = new Scanner(file);
            
            while (in.hasNext()) {
                String temp = in.next();               
                array.add(new Data(temp));
            }
    }
    
    public ArrayList<Data> getArray() {
        return array;
    }
}
