public class Tugas2_PBO {
    public static void main(String args[]){

        //Deklarasi variabel
        String nama, kota_lahir, hobi, alamat, keahlian, bulan_lahir, pendidikan, univ;
        int tgl_lahir, th_lahir;

        nama= "Alfarelzi";
        kota_lahir="padang";
        hobi="tidur";
        alamat="sukamerah";
        keahlian="menggunakan GPT";
        bulan_lahir="juli";
        pendidikan="Sarjana S1 Teknik Telekomunikasi";
        univ= "Telkom University";
        tgl_lahir=31;
        th_lahir=2023;


        //Output variabel
        System.out.println("\tHalo, perkenalkan nama saya " +nama+ ". Saya lahir pada " +tgl_lahir+" " +bulan_lahir+" "+th_lahir+".\n" +
                "Saya lahir di kota "+kota_lahir+". Saat ini saya sedang menempuh pendidikan\n" +pendidikan+ " di " +univ+". Saat ini saya\n" +
                "tinggal di sebuah Kost daerah "+alamat+ ". Saya memiliki hobi yaitu "+hobi+"\ndan keahlian saya adalah "+keahlian+".");

    }
}
