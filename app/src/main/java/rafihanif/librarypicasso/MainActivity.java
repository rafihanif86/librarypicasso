package rafihanif.librarypicasso;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    private Context context;
    private ImageView ivHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String imageUri = "http://senpuu.com.br/wp-content/uploads/2013/03/1172317494990.jpg"; //url gambar
        ivHero = (ImageView) findViewById(R.id.iv_hero);
        context = getApplicationContext();
        Picasso.with(context).load(imageUri).into(ivHero); //memanggil gambar dan diletakkan pada ivHero
        Picasso.with(context).load(imageUri).resize(250,250).into(ivHero); //fungsi resize dapat kita atur sesuka hati
        Picasso.with(context).load(imageUri).rotate(90).into(ivHero); //fungsi rotate dapat kita atur sesuka hati
        Picasso.with(context)
                .load(imageUri)
                .placeholder(R.drawable.ic_profile)
                .error(R.drawable.ic_eror)
                .into(ivHero);
    }
}
