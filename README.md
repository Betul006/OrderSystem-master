# **Order System – Ev Yemekleri Sipariş Platformu**
## *Proje Hakkında*

Order System, ev hanımlarının evde hazırladıkları yemekleri satarak gelir elde edebilmelerini sağlayan bir sipariş yönetim sistemidir. Bu proje, müşteriler ile üreticileri (ev hanımları veya şirketler) bir araya getiren basit ama işlevsel bir platform sunar.

## *Amaç*

Bu projenin amacı:

Ev hanımlarının ekonomik kazanç elde etmesini sağlamak
Küçük üreticileri dijital ortama taşımak
Müşteri ile üretici arasında kolay bir sipariş süreci oluşturmak

## *Kullanıcı Tipleri*

🛒 Müşteri (Customer)
Yemek ve içecekleri seçer
Sipariş oluşturur
Siparişler sistemde saklanır

👩‍🍳 Üretici (Ev Hanımı / Şirket)
Sistemde kayıtlıdır
Gelen siparişleri görüntüler
Siparişi kabul edebilir

## *Sistem Nasıl Çalışır?*
Müşteri sistem üzerinden ürün seçer (yemek, içecek vb.)
Sipariş oluşturulur
Sipariş bilgileri .txt dosyasına kaydedilir
Üretici siparişi görüntüler
Sipariş kabul edilirse:
İlgili sipariş txt dosyasından silinir

## *Kullanılan Teknolojiler*
☕ Java
📂 File I/O (TXT dosya işlemleri)
🧩 Object-Oriented Programming (OOP)
🧠 OOP Yapısı

## *Proje yaklaşık 30 sınıftan oluşmaktadır ve aşağıdaki OOP prensiplerini içermektedir:*

Encapsulation (Kapsülleme)
Inheritance (Kalıtım)
Polymorphism (Çok Biçimlilik)
Abstraction (Soyutlama)

## *📁 Proje Yapısı *

 ├──src/main/java 
 
     ├──com/ravzakoc
         -depot
         -file
         -projectoop
         -Main.java
  
     ├──foodtypes
         -NormalFood.java
         -VeganFood.java
         -VegetarianFood.java
  
     ├──order_and_takeorder
         -Order.java
         -TakeOrder.java
  
     ├──orderingtypes
         -OrderOrganisation.java
         -OrderingFood.java
         -OrderingMealAndOrganisatio
    
     ├──organisations
         -Birthday.java
         -ConceptParty.java
         -Graduation.java
         -Kina.java
         -Wedding.java
 
## *Nasıl Çalıştırılır?*
Projeyi bilgisayarına klonla:
git clone <repo-link>
IDE ile aç (IntelliJ IDEA / Eclipse önerilir)


Ana sınıfı çalıştır:
Main.java
