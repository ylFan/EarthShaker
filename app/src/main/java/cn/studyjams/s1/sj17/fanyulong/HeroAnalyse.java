package cn.studyjams.s1.sj17.fanyulong;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * 将英雄分析这个界面显示出来
 */
public class HeroAnalyse extends AppCompatActivity {

    private List<Hero> heroList1 = new ArrayList<>();
    private List<Hero> heroList2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.hero_analyse);
        initHeroes();   //初始化Hero数据
        HeroAdapter adapter1 = new HeroAdapter(HeroAnalyse.this, R.layout.hero_item, heroList1);
        ListView listView1 = (ListView) findViewById(R.id.list_view);
        listView1.setAdapter(adapter1);
        HeroAdapter adapter2 = new HeroAdapter(HeroAnalyse.this, R.layout.hero_item, heroList2);
        ListView listView2 = (ListView) findViewById(R.id.list_view2);
        listView2.setAdapter(adapter2);
    }

    private void initHeroes() {//用于传入对应的数据
        Hero hero1 = new Hero("上古巨神", R.drawable.hero1, "大小牛的组合早就成为一对非常IMBA的组合，大牛的裂地沟壑配合小牛的沟壑使大量敌人难以规避，而大牛的光环可被先祖灵魂继承，对于ES的AOE伤害是非常可观的提升。");
        heroList1.add(hero1);
        Hero hero2 = new Hero("噬魂鬼", R.drawable.hero2, "作为阵容百搭的英雄，ES同很多英雄都能形成强大组合；前期没有跳刀的情况下，ES可以在远距离为小狗提供留人、反手和消耗，小狗甚至可以上去就咬。拥有跳刀做先手之后，小狗利用大招也可以瞬间切入战场，形成强大AOE。");
        heroList1.add(hero2);
        Hero hero3 = new Hero("幽鬼", R.drawable.hero3, "对于团战需要先手跳大的ES来说，幽鬼是令其一个非常头疼的。由于SPE大招的存在，ES往往不能第一时间跳大；若是拥有辉耀的SPE降临想秒掉ES，控制技能就往往不得不浪费在了SPE身上而不能创造团战收益。");
        heroList2.add(hero3);
        Hero hero4 = new Hero("风暴之灵", R.drawable.hero4, "同幽鬼一样，风暴之灵也是ES十分忌惮的对手。团战前一旦被风暴之灵发现，一个飞身紫苑一套技能打脸。纵使未被秒杀，团战能力也会被大幅削弱。");
        heroList2.add(hero4);
    }

}
