package android.com.techacademy2;

import android.util.Log;

/**
 * Created by SBM on 1/31/17.
 */

class Human extends Animal implements Thinkable{
    //クラス変数
    static String to_jp = "人間";

    //コンストラクタ
    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    //クラス関数
    public static void introduce(){
        Log.d("Techacademy2","これは人間クラスです。");
    }

    //メンバ関数
    public void say(){
        Log.d("Techacademy2","私の名前は"+this.name+"です。");
        Log.d("Techacademy2","年は"+this.age+"歳です。");
    }

    @Override
    public void think(){
        Log.d("Techacademy2","私は"+this.hobby+"について考える。");
    }

}
