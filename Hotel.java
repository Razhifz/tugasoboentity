class Kamar {
    String nama_kamar ; 
    int ID_hargakamar ; 
    
    void setBuku(String namakamar, int IDhargakamar) {
        this.nama_kamar = namakamar;  
        this.ID_hargakamar = IDhargakamar; 
    }
    
    String getNama(){
        return nama_kamar ; 
    } 
    int getIDharga(){
        return ID_hargakamar;
    }
    void disewa (int jumlahDipinjam) {
        this.ID_hargakamar = ID_hargakamar - jumlahDipinjam ;
    }

    public void dipinjam(int i) {
    }
    
}
class pengunjung {
    String nama_pengunjung ; 
    int umur ; 
    
    void setPengunjung(String newNamaPengunjung, int newNomorKtp){
        this.nama_pengunjung = newNamaPengunjung ; 
        this.umur = newNomorKtp; 
            
    }
    
    String getPengunjung() {
        return nama_pengunjung;
    }
    int getUmur(){
        return umur;
    }
    void sewaKamar (String namakamar) {
        System.out.println(this.nama_pengunjung+" meminjam buku berjudul "+namakamar);
        
    }
}




public class Hotel {
    public static void main(String[] args) {
        kamar kamar1 = new Kamar();
        kamar1.setkamar("prosalina", "istimewa", 3);
        
        pengunjung pengunjung1 = new pengunjung();
        pengunjung1.setPengunjung("Muhammad rashif razanah", 19);
        
        System.out.println("Data kamar 1 adalah : ");
      
        System.out.println(kamar1.getNama());
        System.out.println("sewa kamar: "+kamar1.getIDharga());
        
        System.out.println("Pengunjung 1 adalah ");
        System.out.println(pengunjung1.getPengunjung());
        System.out.println(pengunjung1.getUmur());
        
        
        

        
        pengunjung1.sewaKamar(kamar1.getNama());
        kamar1.dipinjam(1);
        
        System.out.println("Jumlah kamar sekarang: "+kamar1.getNama());
        
    }
  }