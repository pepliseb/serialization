import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//	// write your code here
        File file = new File("leniwiec.jpg");
        File fileCopy = new File("leniwiec1.jpg");

        if(!fileCopy.exists()){
            try {
                fileCopy.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int read = 0;
                List<Integer> bytes = new ArrayList<>();

                while (read != -1) {
//                    System.out.print((char) read);
                    read = fileInputStream.read();
                    bytes.add(read);
//                System.out.print(read);
                }
                fileInputStream.close();

                FileOutputStream fileOutputStream = new FileOutputStream(fileCopy, true);
               for (Integer eByte : bytes) {
                   fileOutputStream.write(eByte);
               }
                fileOutputStream.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

