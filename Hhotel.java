class hotel {
    String nama_hotel, nama_pemilik, nomor_telfon, tipe_kamar ;
    int harga, total_kamar;

    public hotel(String nama_hotel, String nama_pemilik, String nomor_telfon, String tipe_kamar, int total_kamar, int harga){
        this.nama_hotel = nama_hotel;
        this.nama_pemilik = nama_pemilik;
        this.nomor_telfon = nomor_telfon;
        this.tipe_kamar = tipe_kamar;
        this.total_kamar = total_kamar;
        this.harga = harga;
    }
    String getNamahotel(){
        return "Nama hotel: " + nama_hotel;
    }
    String setNamaPemilik(){
        return "Nama Pemilik: " +nama_pemilik;
    }
    String setNomorTelfon(){
        return "Nomor Telfon: " +nomor_telfon;
    }
    String getTipeKamar(){
        return "Tipe Kamar: " + tipe_kamar;
    }
    int getTotalKamar(){
        return total_kamar;
    }
    int setharga(){
        return harga;
    }
}

class penghuni {
    String jenis_kelamin, nama_penghuni, nomor_telfon, status;
    int usia;

    public penghuni(String jenis_kelamin, String nama_penghuni, String nomor_telfon, String status, int usia){
        this.jenis_kelamin = jenis_kelamin;
        this.nama_penghuni = nama_penghuni;
        this.nomor_telfon = nomor_telfon;
        this.status = status;
        this.usia = usia;
    }
    String getJenisKelamin(){
        return "Jenis Kelamin: "+jenis_kelamin;
    }
    String getNamaPenghuni(){
        return "Nama Penghuni: "+nama_penghuni;
    }
    String setNomorTelfon(){
        return "Nomor Telfon: "+nomor_telfon;
    }
    String setStatus(){
        return "Status Penguni: "+status;
    }
    int setUsia(){
        return usia;
    }
}

public class Hhotel{
    public static void main(String[] args){
        hotel hotel1 = new hotel ("bougenvile hotel", "thaaaa lionel", "081234567899", "Suits", 15, 2700000);
        System.out.println("=================Hotel================");
        System.out.println(hotel1.getNamahotel());
        System.out.println(hotel1.setNamaPemilik());
        System.out.println(hotel1.setNomorTelfon());
        System.out.println(hotel1.getTipeKamar());
        System.out.println("Total Kamar: "+hotel1.getTotalKamar());
        System.out.println("Harga kamar: "+hotel1.setharga());
        System.out.println("______________");
        System.out.println("=================PENGHUNI================");
        penghuni Penghuni1 = new penghuni("Laki laki", "rashif razanah", "082134513432424", "Mahasiswa", 20);
        System.out.println(Penghuni1.getJenisKelamin());
        System.out.println(Penghuni1.getNamaPenghuni());
        System.out.println(Penghuni1.setNomorTelfon());
        System.out.println(Penghuni1.setStatus());
        System.out.println("Usia Penghuni: " +Penghuni1.setUsia());
        System.out.println("______________");
    }
}