package Sesi4Pbo;
//Nama  : Muhammad Ikhwan Widiansyah
//NIM   : 20210040059
//kelas : TI21E
public class Overloading {
    
    //tipe data int
    public static int tambah (int x, int y){
        return x+y;
    }
    
    //tipe double
    public static double tambah (double x, double y){
        return (double) x+y;
    }
    
    //tipe data gabungan
    public static double tambah(int x, double y){
        return (double) x+y;
    }
    
    public static void main(String[] args) {
        Overloading Matematika = new Overloading(); 
        
        int a = Matematika.tambah(2, 18);//20
        System.out.println(a);
        int b = Matematika.tambah(2, 8);//10
        System.out.println(b);
        int c = Matematika.tambah(4, 7); //11
        System.out.println(c);
    }
}
