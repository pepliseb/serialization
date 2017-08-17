import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("seria.bin");
        Person person = new Person("oskar", "Polak", 4);


        try {
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file)) ;
                objectOutputStream.writeObject(person);

                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                Person openPerson = (Person) objectInputStream.readObject();
            System.out.println("Odczyt klase (" + openPerson.getName() + ")");

            }catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    }

