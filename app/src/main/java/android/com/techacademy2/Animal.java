package android.com.techacademy2;

/**
 * Created by SBM on 1/31/17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

abstract class Animal  {
    //メンバ変数
    String name; //名前
    int age; //年齢
    String hobby; //趣味

    abstract public void say();
}
