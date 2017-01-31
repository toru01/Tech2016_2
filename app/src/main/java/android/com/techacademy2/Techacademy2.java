package android.com.techacademy2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Techacademy2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techacademy2);

        Human hm = new Human("菊地", 28, "料理");

        hm.say();
        hm.think();

    }
}
