
public class Main {
    public static void main(String[] args) {


        double kalan = 0, top = 0;
        int  kisi = 0, kisi2 = 0, kisi3 = 0, sonLok = 0, agirlik = 30;
        double[][] edgese = {{1, 9, 0.400}, {9, 11, 0.500}, {11, 8, 0.900}, {8, 1, 0.450}};
        double[][] lok1 = {{9, 9}, {11, 11}, {8, 10}, {1, 0}};

        double[][] malzeme = {{1, 100, 1}, {2, 100, 1}, {3, 70, 3}, {4, 70, 2}};

        double[][] edgese2 = {{1, 10, 0.140}, {10, 6, 0.350}, {6, 7, 0.650}, {7, 1, 0.400}};
        double[][] lok2 = {{10, 9}, {6, 7}, {7, 11}, {1, 0}};

        double[][] edgese3 = {{1, 2, 0.800}, {2, 3, 0.650}, {3, 5, 0.390}, {5, 1, 0.750}};
        double[][] lok3 = {{2, 8}, {3, 10}, {5, 6}, {1, 0}};

        double[][] edgese4 = {{1, 4, 1}, {4, 1, 1}};
        double[][] lok4 = {{4, 7}};

        //Değerler kose değeri classına gönderirilir ve orda işlemler yapılır.
        koseDegeri kose = new koseDegeri(edgese, lok1, edgese2, lok2, edgese3, lok3, edgese4, lok4,malzeme, kalan, top,  kisi, kisi2, kisi3, sonLok,agirlik);
       kose.hesaplama();











        }
    }

