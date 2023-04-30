import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private Map<String, Double> dataMap = new HashMap<>();
    private static Database instance = null;

    private Database() {
        File file = new File("src/data.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String data = sc.nextLine();
                String[] arrData;
                arrData = data.split("-");
                dataMap.put(arrData[0], Double.parseDouble(arrData[1]));
            }

            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getData(String name){
        return dataMap.get(name);
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

}