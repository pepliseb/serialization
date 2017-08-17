import java.io.*;
import java.io.*;


public class Main3 {
    public static void main(String[] args) {
        File file = new File("monster.bin");
        Monster monster = new Monster(2,2,"seb");


        try {
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file)) ;
            objectOutputStream.writeObject(monster);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Monster openMonster = (Monster) objectInputStream.readObject();
            System.out.println("Odczyt klase (" + openMonster.getName() + ")");

        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


