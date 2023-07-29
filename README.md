# Challenge Project
 **Java,SpringBoot**

 1- MVC kavramını açıklar mısınız? Neden ihtiyaç duyuluyor. Java’da nasıl kurgulanıyor. Object Oriented katmanları nelerdir?

--> Yazılım tasarım desenidir. Yazılımı anlaşılması ve bakımı kolay hale, sürdürülebilir ve modüler hale getirir.
Object Oriented Katmanları;
1.Sınıflar
2.Nesneler
3.Kalıtım(İnheritence)
4.Kapsülleme(Encapsulation)
5.Polimorfizm(Polymorphism)

*******************************************************************************************************************************************************************************

2-Birbirinden bağımsız iki platformun birbiriyle haberleşmesi nasıl sağlanabilir. Örneğin, X platformu Java ile yazılmış olsun, Y platform u C# ile. Bu iki platformun bir biri ile iletişim halinde request-response ilişkisi kurması gerekiyor. Bu yapıyı nasıl sağlarız.

--> RESTfull Api (Application Programming Interface) : Platformlar arasında veri alışverişi için kullanılır. İki platform arasında iletişim sağlayan arayüz oluşturur.
Platformdan bağımsız olarak iletişim sağlanması için bu arayüz kullanılabilir.

*******************************************************************************************************************************************************************************

3-Bir web sayfasında ekran sürekli Backend’ den veya bir başka yapı tarafından güncelleniyor. Siz, web sayfasını refresh etmeden bu güncel bilgiyi anlık ekrana nasıl yansıtırsınız.

--> Websocket : Server ve client arasında iki yönlü bağlantı kurarak, taraflardan biri bağlantıyı sonlandırana kadar sürekli veri akışı sağlar.

*******************************************************************************************************************************************************************************

4-Bir for döngüsü ile aşağıdaki çıktıyı yazar mısınız.


--> Asteriks Pattern. Kod örneğini **"Star Pattern"** klasörü içinde bulabilirsiniz.

*********************************************************************************************************************************************************************************

5- Firmada çalışman için sana remote bir linux server verildi. Elinde ip adresi port bilgisi kullanıcı adi ve şifren var. Server a erişimi nasıl test edersin, Server a nasıl erişirsin, Server a nasıl dosya atarsın, Serverdan nasıl dosya çekersin.

--> ssh userName@hostName(ipadres) -p portno seklinde girilir. burada -p port numarasının girilecegini belirtir.
Sunucu burda şifre istediginde şifreyi girerim.Boylece erişim sağlanır.

Server'a dosya atma

scp yerelpcdosyadizin userName@hostName(ipadres): sunucu/dosyadizini/ 

Server'dan dosya çekmek

scp userName@hostName(ipadress):sunucudosyadizini/dosyaAdi yerelPcDosyaDizini/

**********************************************************************************************************************************************************************************

6- Local database kurulumu (mysql, postgresql veya herhangi bir database)
- Java spring uygulaması ayağa kaldırılması,
- İki adet tablo yer alamalı ve bu tabloların birbirleriyle bağı olmalıdır. (Örn: şirket ve çalışan gibi),
- Java spring uygulamasında ekleme,silme,güncelleme,listeleme gibi servisler yer almalıdır ve responseda yapılan işlem detayı return edilmelidir.
- Ekleme,silme,güncelleme,listeleme işlemlerini postman vb ile işlem yapılabilmelidir

--> Kod örneğini **"Crud Operations"** klasörü içinde bulabilirsiniz.

**Delete**

![employe-delete](https://github.com/emreirgoren/challengeProject/assets/131880110/e963f033-e197-4e3f-b6a7-6a7cdef99cf3)


**Create**

![employee-create](https://github.com/emreirgoren/challengeProject/assets/131880110/7278a078-c199-4b7f-a981-9cfd5a5fd9b5)


**Get All**

![employee-getAll](https://github.com/emreirgoren/challengeProject/assets/131880110/099f9e66-d12b-43d6-9ce6-46ca318dd63c)

**Get Employee**

![employee-getEmployee](https://github.com/emreirgoren/challengeProject/assets/131880110/e048d63c-ebf1-499e-9623-14dec3f355c3)

**Update**

![employee-update](https://github.com/emreirgoren/challengeProject/assets/131880110/10697c89-1868-449c-b4db-4bf922fa3b70)


*********************************************************************************************************************************************************************************

7- Apache Solr servisine yazılacak bir query örneği Apache Solr kullanılan sql 
programlarından daha farklı runtime bir database. Solr a hali hazırda kayıtlı bir alan olduğunu 
düşünelim. Alanın ismi “updatedAt” long tipinde tutulan bir alan. Ben 2020 Ocak ayından 
sonraki verileri getir dediğimde solr a nasıl bir query yazılmalı. http://example?query=
kısmını nasıl doldurmalıyım?

--> http://example?query=updateAt:[2020-01-01T00:00:00Z TO * ]

