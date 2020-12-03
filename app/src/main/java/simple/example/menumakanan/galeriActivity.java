package simple.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class galeriActivity extends AppCompatActivity {

    String jenisMakanan;
    TextView txJenis,txDeskripsi,txJudul;
    ImageView ivFotoMakan;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_galeri);
        Intent intent= getIntent();
        jenisMakanan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
//        inisialisasiView();
        if(jenisMakanan.equalsIgnoreCase ("Asinan")){
            inisialisasiView();
            txJenis.setText("asinan");
            txDeskripsi.setText("kuliner khas Indonesia yang bernama soto Kudus. Soto yang berasal dari Kudus, Jawa Tengah ini merupakan soto dengan suwiran daging ayam atau kerbau. Pilihan daging kerbau digunakan karena masyarakat Kudus sangat menghormati kepercayaan umat Hindu yang menyucikan sapi.");
            ivFotoMakan.setImageResource (R.drawable.asinan_bogor);
        } else if(jenisMakanan.equalsIgnoreCase ("gadoGado")){
            inisialisasiView();
            txJenis.setText("Gado-Gado");
            txDeskripsi.setText("Gado-gado, menu makanan Indonesia ini sangat terkenal dari Sabang hingga Merauke. Salah satu kejuaraan memasak internasional Napoli tahun 2010 menobatkan gado-gado sebagai masakan yang menampilkan sajian estetika.");
            ivFotoMakan.setImageResource (R.drawable.gado_gado);
        }else if(jenisMakanan.equalsIgnoreCase ("NasiGoreng")){
            inisialisasiView();
            txJenis.setText("Nasi Goreng");
            txDeskripsi.setText("Nasi goreng sendiri sudah lahir sekitar 4000 tahun sebelum Masehi. Berasal dari kebiasaan masyarakat Tionghoa yang tak menyukai makanan dingin, nasi goreng kini mulai mendunia. Banyaknya masyarakat Tionghoa yang merantau ke daerah lain, membuat menu nasi goreng yang dibuat oleh mereka menggunakan bumbu dan variasi bahan makanan yang ada di sekitar tempat tinggalnya.");
            ivFotoMakan.setImageResource (R.drawable.nasi_goreng);
        }else if(jenisMakanan.equalsIgnoreCase ("KerakTelur")){
            inisialisasiView();
            txJenis.setText("KeraK Telur");
            txDeskripsi.setText("Ibu kota punya kerak telor khas Betawi sebagai makanan tradisionalnya. Berbahan dasar telur bebek atau ayam, yang dicampur dengan beras ketan, serundeng, udang, bawang goreng, dan bumbu lain. Kerak telor memiliki rasa gurih dan manis yang menggoyang lidahmu.");
            ivFotoMakan.setImageResource (R.drawable.kerak_telur);
        }else if(jenisMakanan.equalsIgnoreCase ("Rendang")){
            inisialisasiView();
            txJenis.setText("Rendang");
            txDeskripsi.setText("Dinobatkan sebagai makanan paling lezat di seluruh dunia, rendang Padang ternyata masuk dalam makanan yang sulit dibuat. Kaya akan rempah membuatnya sangat nikmat dan menggiurkan. Selain sulit, waktu yang diperlukan untuk memasaknya juga cukup lama.");
            ivFotoMakan.setImageResource (R.drawable.rendang);
        }else if(jenisMakanan.equalsIgnoreCase ("Rujak")){
            inisialisasiView();
            txJenis.setText("Rujak");
            txDeskripsi.setText("Menu tradisional berbahan dasar buah-buahan berikut datang dari Pulau Jawa. Aneka menu rujak tersedia disini, mulai dari Rujak Cemplung, Rujak Letok, Rucak Kecut, hingga Rujak Dulit. Meskipun bukan termasuk makanan pengenyang perut, rujak-rujak ini wajib kamu cicipi.");
            ivFotoMakan.setImageResource (R.drawable.rujak_buah);
        }else{
            finish ();
        }


    }

    private void inisialisasiView() {
        txJenis = findViewById(R.id.txJudul);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoMakan = findViewById(R.id.gambarMakanan);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Jenis "+jenisMakanan);
    }


}
