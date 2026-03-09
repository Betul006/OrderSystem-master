package com.ravzakoc.file;

import com.ravzakoc.projectoop.TakeOrderRegister;

import java.io.*;

import static com.ravzakoc.projectoop.TakeOrderMemory.organisations;

public class OrderProviderFileManager {
    private static final String FILE_PATH = "PROJEmasternew-master/src/main/java/com/ravzakoc/file/take_order.txt";

    //  DOSYADAN OKUMA
    public static void dowloadFromFile() {
        organisations.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {

            String row;
            while ((row = br.readLine()) != null) {

                String[] part = row.split(";");

                if (part.length == 4) {
                    TakeOrderRegister sa = new TakeOrderRegister();

                    sa.setEmail(part[0]);
                    sa.setPassword(part[1]);
                    sa.setTc(part[2]);
                    sa.setaddress(part[3]);

                    organisations.add(sa);

                }
            }

        } catch (FileNotFoundException e) {
            // İlk çalıştırmada dosya yoksa sorun değil
        } catch (IOException e) {
            System.out.println("Failed to read from the file.");
        }
    }

    //  DOSYAYA YAZMA
    public static void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {

            for (TakeOrderRegister sa : organisations) {
                bw.write(
                        sa.getEmail() + ";" +
                                sa.getPassword() + ";" +
                                sa.gettc() + ";" +
                                sa.getaddress()
                );
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Failed to write to the file!");
        }
    }
}
