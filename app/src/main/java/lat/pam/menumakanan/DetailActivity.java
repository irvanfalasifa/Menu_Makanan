package lat.pam.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Detail Menu");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getIntExtra("id", -1);

        ArrayList<Food> list = FoodData.getData(getApplicationContext());
        Food food = list.get(id);

        if (food != null) {
            ImageView image = findViewById(R.id.detail_photo);
            TextView judulTV = findViewById(R.id.detail_judul);
            TextView hargaTV = findViewById(R.id.detail_harga);
            TextView deskripsiTV = findViewById(R.id.detail_deskripsi);


            image.setImageDrawable(food.image);
            judulTV.setText(food.judul);
            hargaTV.setText(String.valueOf(food.harga));
            deskripsiTV.setText(food.deskripsi);
        }
    }
}