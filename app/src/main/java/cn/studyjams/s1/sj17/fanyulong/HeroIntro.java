package cn.studyjams.s1.sj17.fanyulong;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 将英雄介绍这个界面显示出来
 */
public class HeroIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.hero_introduce);
    }
}
