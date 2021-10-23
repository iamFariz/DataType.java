public class DataType {
    //Perhatikan perbedaan penulisan antara
    //TypeData Primitive dan Non Primitive

    //Contoh Tipe Data Non Primitive
    //Dapat membuat sendiri tipe data non primitive

    private static class Dila{
        //disini Dila akan digunakan sebagai tipe data atau atribut pada main program
        //yang diimplementasikan didalam void main

        private int number1;
        private int number2;

        //mendeklarasikan method untuk dapat digunakan dalam void main
        //bersifat optional

        private int CalculateNumber(){
            return number1*number2;
        }
    }

    public static void main(String[] args) {
        //tipe data primitive;
        //menghitung penjumlhan dua angka;
        int angka1;
        int angka2;
        int jumlahAngka;

        angka1 = 20;
        angka2 = 40;

        jumlahAngka = angka1 + angka2;
        System.out.println("Jumlahnya Adalah = " + jumlahAngka);

        double angkaPecahan1;
        double angkaPecahan2;
        double jumlahpecahan;

        angkaPecahan1 = 20.4;
        angkaPecahan2 = 80.6;

        jumlahpecahan = angkaPecahan1 +angkaPecahan2;
        System.out.println("Jumlah Angka Pecahan = " + jumlahpecahan);

        float angkaFloat1;
        float angkaFloat2;
        float jumlahAngkaFloat;

        angkaFloat1 = 46.7f; //pada akhir ditambahkan huruf f;
        angkaFloat2 = 78.3f;

        jumlahAngkaFloat = angkaFloat1 + angkaFloat2;
        System.out.println("Jumlah Angka Float " + jumlahAngkaFloat);

        //TIPE DATA NON PRIMITIVE, MENGAMBIL APA YANG SUDAH DICODE DIATAS
        Dila PerkalianAngka; //mendeklarasikan PerkalianAngka sebagai Data TYpe Dila
        PerkalianAngka = new Dila();

        PerkalianAngka.number1 = 5; //memasukan nilai 5 kedalam variable number1
        PerkalianAngka.number2 = 6; //memasukan nilai 6 kedalam variabel number2

        int hasilPerkalian;
        hasilPerkalian = PerkalianAngka.CalculateNumber();

        System.out.println("Hasil Perkalian dari Data Type Non Primitive = " + hasilPerkalian);

    }

}
