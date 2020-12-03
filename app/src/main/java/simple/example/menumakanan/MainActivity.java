package simple.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnAsinan,btnGadoGado,btnKerakTelur,btnNasiGoreng,btnRendang,btnRujak;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI_HEWAN";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        btnAsinan=findViewById (R.id.tombol_asinan_bogor);
        btnGadoGado=findViewById (R.id.tombol_gado_gado);
        btnKerakTelur = findViewById (R.id.tombol_kerak_telur) ;
        btnNasiGoreng = findViewById (R.id.tombol_nasi_goreng);
        btnRendang = findViewById (R.id.tombol_rendang);
        btnRujak = findViewById (R.id.tombol_rujak_buah);
        btnAsinan.setOnClickListener (v -> {
            Log.d ("Main", "Main Buka Activitiy");
            Intent Asinan = new Intent (this,galeriActivity.class);
            Asinan.putExtra(JENIS_GALERI_KEY, "Asinan");
            startActivity(Asinan);
        });

        btnGadoGado.setOnClickListener (v -> {
            Log.d ( "Main", "Main Buka Activity ");
            Intent intent =new Intent (this,galeriActivity.class);
            intent.putExtra (JENIS_GALERI_KEY,  "GadoGado");
            startActivity (intent);
        });

        btnKerakTelur.setOnClickListener (v -> {
            Log.d ( "Main", "Main Buka Activity ");
            Intent kerakTelur =new Intent (this,galeriActivity.class);
            kerakTelur.putExtra (JENIS_GALERI_KEY,  "KerakTelur");
            startActivity (kerakTelur);
        });

        btnNasiGoreng.setOnClickListener (v -> {
            Log.d ( "Main", "Main Buka Activity ");
            Intent intent =new Intent (this,galeriActivity.class);
            intent.putExtra (JENIS_GALERI_KEY,  "NasiGoreng");
            startActivity (intent);
        });


        btnRendang.setOnClickListener (v -> {
            Log.d ( "Main", "Main Buka Activity ");
            Intent intent =new Intent (this,galeriActivity.class);
            intent.putExtra (JENIS_GALERI_KEY,  "Rendang");
            startActivity (intent);
        });

        btnRujak.setOnClickListener (v -> {
            Log.d ( "Main", "Main Buka Activity ");
            Intent intent =new Intent (this,galeriActivity.class);
            intent.putExtra (JENIS_GALERI_KEY,  "Rujak");
            startActivity (intent);
        });
    }
}