public class stringOperatoins {
    public static void main(String[] args) {

        String welcome = ("Welcome to Coding World");

        // System.out.println(welcome.length()); // karakter sayısını döndürür
        // System.out.println(welcome.toUpperCase()); // büyük harfe çevirir
        // System.out.println(welcome.toLowerCase()); // küçük harfe çevirir
        // System.out.println(welcome.charAt(2)); // 2. index'teki karakteri döndürür
        // System.out.println(welcome.indexOf("to")); // "to" hangi indexteyse onu verir
        // System.out.println(welcome.indexOf("o",5)); // 5. indexten sonraki ilk 'o' harfini arar
        // System.out.println(welcome.lastIndexOf("o")); // en son bulunan 'o' nun indexini verir
        // System.out.println(welcome.substring(13)); // 13. indexten sonrasını döndürür
        // System.out.println(welcome.substring(11,17)); // 11. indexten 17’ye kadar olan kısmı alır
        // System.out.println(welcome.replace("o", "XX")); // bütün 'o' lar yerine XX koyar
        // System.out.println(welcome.replaceFirst("o", "XX")); // sadece ilk 'o' yu değiştirir
        // System.out.println(welcome.trim()); // baştaki ve sondaki boşlukları siler
        // System.out.println(welcome.contains("Coding")); // "Coding" varsa true döndürür
        // System.out.println(welcome.startsWith("Wel")); // "Wel" ile başlıyorsa true döner
        // System.out.println(welcome.endsWith("ld")); // "ld" ile bitiyorsa true döner

        // -------------------------------------------------------------------------
        // Aşağıdaki döngü ile 'o' harfi hangi indexlerde bulunuyor onları buluyoruz
        // for (int i = 0; i <= welcome.length()-1; i++) {
        //     if (welcome.charAt(i) == 'o') {
        //         System.out.println(i);
        //     }
        // }
    }
}
