# Java String İşlemleri

Bu dosyada (`stringOperations.java`) **String üzerinde yapılan basit işlemler** bulunuyor.  
Profesyonel değil, tamamen öğrenme amaçlı küçük denemeler 

---

## 📌 İçerik

- **Uzunluk**:  
  `length()` → String’in karakter sayısını döndürür.  

- **Büyük / Küçük Harf Dönüşümü**:  
  `toUpperCase()` → Hepsini büyük harfe çevirir.  
  `toLowerCase()` → Hepsini küçük harfe çevirir.  

- **Karakter ve Konum İşlemleri**:  
  `charAt(i)` → İstediğin index’teki karakteri döndürür.  
  `indexOf("x")` → Belirli bir harf/kelimenin ilk geçtiği yeri verir.  
  `indexOf("x", n)` → Aramayı `n` indexinden başlatır.  
  `lastIndexOf("x")` → Belirli bir harfin/kelimenin son geçtiği yeri verir.  

- **Alt String Alma**:  
  `substring(n)` → Belirtilen indexten sonrasını alır.  
  `substring(a, b)` → `a` ile `b` indexleri arasındaki kısmı alır.  

- **Değiştirme**:  
  `replace("o", "XX")` → Bütün `o` harflerini `XX` ile değiştirir.  
  `replaceFirst("o", "XX")` → Sadece ilk `o` harfini değiştirir.  

- **Boşluk ve Kontroller**:  
  `trim()` → Baştaki ve sondaki boşlukları siler.  
  `contains("kelime")` → Kelime varsa `true`, yoksa `false`.  
  `startsWith("abc")` → Belirtilen kelime ile başlıyorsa `true`.  
  `endsWith("xyz")` → Belirtilen kelime ile bitiyorsa `true`.  

- **Döngü ile Arama**:  
  Bir `for` döngüsü kullanarak string içinde geçen tüm `'o'` harflerinin indexlerini bulur.  

---

## 💡 Not
- Hepsi `System.out.println()` ile test ediliyor.  
- Çalıştırmak için istediğin satırların başındaki `//` yorum işaretini kaldırman yeterli.  
