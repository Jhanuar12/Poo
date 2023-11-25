

package Friends_actividad_6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;



class DisplayFriends {
    
    public static void main(String data[])
    {
 
        try {
            String log_dir = System.getProperty("user.home") + "\\Desktop" + "\\friendsContact.txt";
            String nameNumberString;
            String name;
            String newName = "Pablo";
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File(log_dir);
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
 
            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Traversing the file
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit   = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // Print the contact data
                if(name.equals(newName)){
                    System.out.println("The contact name is " + name);
                    System.out.println("The contact number " + number);
                        found = true;
                }
            }
        
        }
            catch (IOException ioe)
            {
 
                System.out.println(ioe);
            }
            catch (NumberFormatException nef)
            {
 
                System.out.println(nef);
            }
        }
    }
