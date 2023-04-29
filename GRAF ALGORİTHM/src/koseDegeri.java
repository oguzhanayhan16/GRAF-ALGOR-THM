
public class koseDegeri {
    double kalan;
    double top;
    double[][] malzeme;
    int kisi, kisi2, kisi3, sonLok,agirlik;
    double[][] edgese;
    double[][] lok1;

    double[][] edgese2;
    double[][] lok2;

    double[][] edgese3;
    double[][] lok3;

    double[][] edgese4;
    double[][] lok4;

    //Main fonksiyonundan değerler alınmaktadır.
    koseDegeri(double[][] edgese, double[][] lok1, double[][] edgese2, double[][] lok2, double[][] edgese3, double[][] lok3, double[][] edgese4, double[][] lok4, double[][] malzeme, double kalan, double top,  int kisi, int
            kisi2, int kisi3, int sonLok,int agirlik) {
        this.edgese = edgese;
        this.lok1 = lok1;
        this.edgese2 = edgese2;
        this.lok2 = lok2;
        this.edgese3 = edgese3;
        this.lok3 = lok3;
        this.edgese4 = edgese4;
        this.lok4 = lok4;
        this.kalan = kalan;
        this.top = top;
        this.sonLok=sonLok;
        this.malzeme = malzeme;

        this.kisi = kisi;
        this.kisi2 = kisi2;
        this.kisi3 = kisi3;
        this.agirlik=agirlik;
    }
    //Hesaplama fonksiyonu ile işlemler yapılır.
    public void hesaplama() {

        //Her bir lokasyondaki toplam kişi sayısını bulur.
        for (int i = 0; i < lok1.length; i++) {
            kisi += lok1[i][1];
            kisi2 += lok2[i][1];
            kisi3 += lok3[i][1];
        }
        // Eşyaların tedarik sırasını belirler.
        for (int a = 0; a < malzeme.length; a++) {
            kalan = malzeme[a][1];
             //  İlk lokasyona eşya teslimi yapılır.
            if (malzeme[a][1] - kalan <= kisi) {
                for (int i = 0; i < edgese.length; i++) {
                    //Her lokasyonda ağırlığın ne kadar azaldığını gösteren ifade.
                    agirlik-=lok1[i][1];
                   // Toplam yapılan mesafe
                    top += edgese[i][2];
                    //Tedarik eşyalardan kalan miktar
                    kalan = kalan - lok1[i][1];
                    if (kalan < 0) {
                        // Eğerki o eşyadan kalmadıysa tekrardan ilk lokasyona gidilir ve yeni tedarik eşyasına geçilir.
                        sonLok = (int) lok1[i][0];
                        System.out.println("Eşya tükenmiştir.En son lokasyon " + sonLok + " tedir.");
                        break;
                    }
                    //Tedarik noktasına geri dönüşte ağırlığı tekrardan en fazla duruma gelmesi.
                    agirlik=30;
                }



            }
            if (kalan < 0) {
                //Kalan değerinin (-) değerlere düşmesini engeller.
                kalan = 0;
            }

            //  İkinci lokasyona eşya teslimi yapılır.
            if (kalan == malzeme[a][1] - kisi) {
                for (int i = 0; i < edgese.length; i++) {
                    //Her lokasyonda ağırlığın ne kadar azaldığını gösteren ifade.
                    agirlik-=lok2[i][1];
                    // Toplam yapılan mesafe
                    top += edgese2[i][2];
                    //Tedarik eşyalardan kalan miktar
                    kalan = kalan - lok2[i][1];
                    if (kalan < 0) {
                        // Eğerki o eşyadan kalmadıysa tekrardan ilk lokasyona gidilir ve yeni tedarik eşyasına geçilir.
                        sonLok = (int) lok2[i][0];
                        System.out.println("Eşya tükenmiştir.En son lokasyon " + sonLok + " tedir.");
                        break;
                    }
                    //Tedarik noktasına geri dönüşte ağırlığı tekrardan en fazla duruma gelmesi.
                    agirlik=30;
                }

            }
            if (kalan < 0) {
                //Kalan değerinin (-) değerlere düşmesini engeller.
                kalan = 0;
            }
            //  Üçüncü lokasyona eşya teslimi yapılır.
            if (kalan == malzeme[a][1] - (kisi2 + kisi)) {
                for (int i = 0; i < edgese.length - 1; i++) {
                    //Her lokasyonda ağırlığın ne kadar azaldığını gösteren ifade.
                    agirlik-=lok3[i][1];
                    // Toplam yapılan mesafe
                    top += edgese3[i][2];
                    //Tedarik eşyalardan kalan miktar
                    kalan = kalan - lok3[i][1];
                    if (kalan < 0) {
                        // Eğerki o eşyadan kalmadıysa tekrardan ilk lokasyona gidilir ve yeni tedarik eşyasına geçilir.
                        sonLok = (int) lok3[i][0];
                        System.out.println("Eşya tükenmiştir.En son lokasyon " + sonLok + " tedir.");
                        top += 1;
                        break;
                    }
                    //Tedarik noktasına geri dönüşte ağırlığı tekrardan en fazla duruma gelmesi.
                    agirlik=30;
                }

            }
            if (kalan < 0) {
                //Kalan değerinin (-) değerlere düşmesini engeller.
                kalan = 0;
            }
            //  Dördüncü lokasyona eşya teslimi yapılır.
            if (kalan == malzeme[a][1] - (kisi2 + kisi + kisi3)) {
                for (int i = 0; i < edgese4.length - 1; i++) {
                    //Her lokasyonda ağırlığın ne kadar azaldığını gösteren ifade.
                    agirlik-=lok4[i][1];
                    // Toplam yapılan mesafe
                    top += edgese4[i][2];
                    //Tedarik eşyalardan kalan miktar
                    kalan = kalan - lok4[i][1];
                    if (kalan < 0) {
                        // Eğerki o eşyadan kalmadıysa tekrardan ilk lokasyona gidilir ve yeni tedarik eşyasına geçilir.
                        sonLok = (int) lok4[i][0];
                        System.out.println("Eşya tükenmiştir.En son lokasyon " + sonLok + " tedir.");
                        break;
                    }
                    //Tedarik noktasına geri dönüşte ağırlığı tekrardan en fazla duruma gelmesi.
                    agirlik=30;
                }

            }
            if (kalan < 0) {
                //Kalan değerinin (-) değerlere düşmesini engeller.
                kalan = 0;
            }


            if ( kalan != 0) {
                //Eğerki tedarik edilen eşya tüm lokasyonlara doğru bir şekilde tedarik edildi ise aşşağıdaki veriyi yazdırır.
                System.out.println("Eşyalar baraşıyla dağıtılmıştır kalan eşya sayısı: " + kalan);

            }
            //Toplam gidilen mesafe yazdırılır.
            System.out.println("Toplam gidilen yol : " + top);
        }

    }
}
