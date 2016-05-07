package cn.studyjams.s1.sj17.fanyulong;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

/**
 * 将英雄问答这个界面显示出来
 */
public class HeroQuest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.hero_quest);

        final EditText editText1 = (EditText) findViewById(R.id.edit_text1);
        final EditText editText2 = (EditText) findViewById(R.id.edit_text2);
        Button button1 = (Button) findViewById(R.id.answer_btn1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.answer_btn1://如果点击第一个问题的按钮，那么执行以下
                        String inputText1 = editText1.getText().toString();//获取输入栏的内容
                        if (inputText1.equals("暗夜魔王")) {//用equals()比较内容是否相等
                            displayAnswer1();//答案正确
                        } else {
                            displayAnswer2();//答案错误
                        }
                        break;
                    default:
                        break;
                }

            }

        });
        Button button2 = (Button) findViewById(R.id.answer_btn2);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.answer_btn2://如果点击第二个问题的按钮，那么执行以下
                        String inputText1 = editText2.getText().toString();//获取输入栏的内容
                        if (inputText1.equals("斧王")) {//用equals()比较内容是否相等
                            displayAnswer3();//答案正确
                        } else {
                            displayAnswer4();//答案错误
                        }
                        break;
                    default:
                        break;
                }
            }
        });
    }


    public void displayAnswer1() {
        TextView textView1 = (TextView) findViewById(R.id.show_answer1);
        textView1.setText("正确答案。恭喜你猜对了！");
    }

    public void displayAnswer2() {
        TextView textView1 = (TextView) findViewById(R.id.show_answer1);
        textView1.setText("答案错误，再试一次吧！");
    }

    public void displayAnswer3() {
        TextView textView2 = (TextView) findViewById(R.id.show_answer2);
        textView2.setText("正确答案。恭喜你猜对了！");
    }

    public void displayAnswer4() {
        TextView textView2 = (TextView) findViewById(R.id.show_answer2);
        textView2.setText("答案错误，再试一次吧！");
    }
}