package rwcthv;

public class Data {
    String sequenceNumber, nameOfCity;
    double x, y;
    int random1, random2;
    
    Data(String par) {
        String[] tempArray = par.split(";");
        sequenceNumber = tempArray[0];
        
        String[] tempX = tempArray[1].split(",");
        x = Double.parseDouble(tempX[0]) + Double.parseDouble("0." + tempX[1]);
        String[] tempY = tempArray[2].split(",");       
        y = Double.parseDouble(tempY[0]) + Double.parseDouble("0." + tempY[1]);
        
        nameOfCity = tempArray[3];
        random1 = Integer.parseInt(tempArray[4]);
        random2 = Integer.parseInt(tempArray[5]);
    }
    
    public String getNumber() {
        return sequenceNumber;
    }
    
    public String getCity() {
        return nameOfCity;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public int getasd() {
        return random1;
    }
    
    public int getasd1() {
        return random2;
    }
}
