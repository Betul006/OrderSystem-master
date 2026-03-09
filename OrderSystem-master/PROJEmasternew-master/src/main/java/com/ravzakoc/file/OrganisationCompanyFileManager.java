package com.ravzakoc.file;

import com.ravzakoc.projectoop.OrganisationCompanyRegister;

import java.io.*;

import static com.ravzakoc.projectoop.OrganisationCompanyMemory.company;

public class OrganisationCompanyFileManager {

    private static final String FILE_PATH = "PROJEmasternew-master/src/main/java/com/ravzakoc/file/organisation_company.txt";

    // DOSYADAN OKUMA
    public static void dowloadFromFile() {

        company.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {

            String row;
            while ((row = br.readLine()) != null) {

                String[] p = row.split(";");

                if (p.length == 6) {
                    OrganisationCompanyRegister os = new OrganisationCompanyRegister();

                    os.setCompanyName(p[0]);
                    os.setCompanyEmail(p[1]);
                    os.setPassword(p[2]);
                    os.setCompanyAddress(p[3]);
                    os.setNumberOfEmployees(Integer.parseInt(p[4]));
                    os.setTaxNumber(Long.parseLong(p[5]));

                    company.add(os);
                }
            }

        } catch (FileNotFoundException e) {
            // İlk çalıştırmada dosya yoksa sorun değil
        } catch (IOException e) {
            System.out.println("Failed to read the event organization company file!");
        }
    }

    //  DOSYAYA YAZMA
    public static void saveToFile() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {

            for (OrganisationCompanyRegister os : company) {
                bw.write(
                        os.getCompanyName() + ";" +
                                os.getCompanyEmail() + ";" +
                                os.getPassword() + ";" +
                                os.getCompanyAddress() + ";" +
                                os.getNumberOfEmployees() + ";" +
                                os.getTaxNumber()
                );
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Failed to write to the file!");
        }
    }
}
