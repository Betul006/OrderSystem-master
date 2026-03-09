package com.ravzakoc.file;

import com.ravzakoc.projectoop.OrderRegistration;

import java.io.*;

import static com.ravzakoc.projectoop.OrderMemory.customer;

public class OrderCustomerFileManager {
    /*bu classımız içinde müşterilerin dosyadan okuma ve dosyaya yazma işlemlerini tutuyor */
    private static final String FILE_PATH = "PROJEmasternew-master/src/main/java/com/ravzakoc/file/order";

    // 🔹 PROGRAM AÇILIRKEN ÇAĞRILACAK
    public static void dowloadFromFile() {
         customer.clear();
         // her çağırılmada liste temizlenir ve tekrar ekleme işlemi yapılır

         // her yeni girilen kullanıcı da listedekileri dosya ya yazdırıyoruz

        /*  clear() kullanmamızın nedeni listeyi temizlemek çünkü her yeni girilen tek başına dosyaya yazdıırız
         eğer silme işlemi yapmazsak önceki kullanıcıları her seferinde tekrar tekrar yazar */


        // dosyadan okuma kısmı yani eğer çağırırsak terminalde bize bu şekilde gösterecek
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String row;


            // o an okunan satırı temsil eder
            while ((row = br.readLine()) != null) {
                String[] part = row.split(";"); // part kısımları ';' ile birbirinden ayrılır

                OrderRegistration sv = new OrderRegistration();
                sv.setEmail(part[0]);
                sv.setPassword(part[1]);
                sv.setTc(Long.parseLong(part[2])); //parseLong: gelen dosyayı long türüne çevirir
                sv.setaddress(part[3]);

                customer.add(sv); // yeni girilen kullanıcıyı listeye ekler
            }
        } catch (IOException e) {
            // dosya yoksa sorun değil, ilk çalıştırma olabilir
        }
    }

    //  KAYIT OLUNCA ÇAĞRILACAK
    public static void saveToFile(OrderRegistration sv) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            // append: true dosyanın sonuna yazmayı ifade eder

            bw.write(
                    sv.getEmail() + ";" +
                            sv.getPassword() + ";" +
                            sv.gettc() + ";" +
                            sv.getaddress()
            );
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Failed to write to the file!");
        }
        // dosya ya yazma işlemi OrderRegister classından girilen verileri yazma yapar
    }
}
