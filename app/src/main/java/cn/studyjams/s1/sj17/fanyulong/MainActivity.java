package cn.studyjams.s1.sj17.fanyulong;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);   //找到英雄介绍这个按钮的id
        button1.setOnClickListener(new OnClickListener() {       //注册英雄介绍这个按钮的监听

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HeroIntro.class);
                startActivity(intent);
            }//重写onClick方法，使其跳转到英雄介绍页面

        });

        Button button2 = (Button) findViewById(R.id.button2);   //找到英雄技能这个按钮的id
        button2.setOnClickListener(new OnClickListener() {      //注册英雄技能这个按钮的监听
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HeroSkill.class);
                startActivity(intent);
            }//重写onClick方法，使其跳转到英雄技能页面
        });

        Button button3 = (Button) findViewById(R.id.button3);   //找到英雄分析这个按钮的id
        button3.setOnClickListener(new OnClickListener() {      //注册英雄分析这个按钮的监听
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HeroAnalyse.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }//重写onClick方法，使其跳转到英雄分析页面
        });

        Button button4 = (Button) findViewById(R.id.button4);   //找到英雄出装这个按钮的id
        button4.setOnClickListener(new OnClickListener() {      //注册英雄出装这个按钮的监听
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HeroEquipment.class);
                startActivity(intent);
            }//重写onClick方法，使其跳转到英雄出装页面
        });

        Button button5 = (Button) findViewById(R.id.button5);   //找到英雄加点这个按钮的id
        button5.setOnClickListener(new OnClickListener() {      //注册英雄加点这个按钮的监听
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HeroSkillLearn.class);
                startActivity(intent);
            }//重写onClick方法，使其跳转到英雄加点页面
        });

        Button button6 = (Button) findViewById(R.id.button6);   //找到英雄问答这个按钮的id
        button6.setOnClickListener(new OnClickListener() {      //注册英雄问答这个按钮的监听
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HeroQuest.class);
                startActivity(intent);
            }//重写onClick方法，使其跳转到英雄问答页面
        });
    }

}
