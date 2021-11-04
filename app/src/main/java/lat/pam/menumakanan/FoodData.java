package lat.pam.menumakanan;

import android.annotation.SuppressLint;
import android.content.Context;

import java.util.ArrayList;

public class FoodData {
    @SuppressLint("UseCompatLoadingForDrawables")
    public static ArrayList<Food> getData(Context context) {    //List from foods with price and description
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Masakan Sunda dari Indonesia dibuat dari daging ikan tenggiri cincang, meskipun jenis makanan laut lainnya seperti tuna, makarel, dan udang juga dapat digunakan.", 5000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Salad Hitam", 9000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Caphuchino", "minuman khas Italia yang dibuat dari espreso dan susu, tetapi referensi lain juga ada yang menyebutkan bahwa kapucino berawal dari biji biji kopi tentara Turki yang tertinggal setelah peperangan yang di pimpin oleh Kara Mustapha Pasha di Wina, Austria melawan tentara gabungan Polandia-Germania. Kapucino biasanya didefinisikan sebagai 1/3 espreso, 1/3 susu yang dipanaskan dan 1/3 susu yang dikocok hingga berbusa. Definisi yang lain menyebutkan 1/3 espresso dan 2/3 mikrofoam. Kapucino berbeda dengan latte macchiato, yang kebanyakan terdiri dari susu dan sedikit busa. (Kapucino kering mengandung lebih sedikit susu.)", 6000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake", "makanan penutup manis yang terdiri dari satu atau lebih lapisan. Lapisan utama dan paling tebal terdiri dari campuran keju segar yang lembut (biasanya keju cottage, keju krim atau ricotta), telur, dan gula. Jika ada lapisan bawah, paling sering terdiri dari kerak atau alas yang terbuat dari kue kering (atau biskuit pencernaan), biskuit graham, kue kering, atau terkadang kue bolu. Cheesecake dapat dipanggang atau tidak dipanggang (dan biasanya didinginkan).", 9000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cireng", "Aci goreng, bahasa Sunda untuk 'tepung kanji goreng' adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka. Makanan ringan ini sangat populer di daerah Priangan, dan dijual dalam berbagai bentuk dan variasi rasa. Makanan ini cukup terkenal pada era 80-an. Bahan makanan ini antara lain terdiri dari tepung kanji, tepung terigu, air, merica bubuk, garam, bawang putih, kedelai, daun bawang dan minyak goreng.", 5000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Donut", "Kue yang bolong", 5000, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Kopi Hitam", "Kopi yg Hitam", 6000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Mie Goreng", "Mie di Goreng", 5000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Nasi Goreng", "Nasi di Goreng", 9000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Sparkling Tea", "Sparkling Tea yg sangat Segar", 5000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}