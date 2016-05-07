package cn.studyjams.s1.sj17.fanyulong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * 自定义一个Hero适配器，这个适配器继承ArrayAdapter，并将泛型指定为Hero类
 */
public class HeroAdapter extends ArrayAdapter<Hero> {
    private int resourceId;

    public HeroAdapter(Context context,int textViewResourceId,List<Hero> objects){//重写父类构造函数，用于将上下文，ListView子项布局id和数据传递进来
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){//重写getView方法，这个方法在每个子项被滚动到屏幕的时候会被调用
        Hero hero = getItem(position); //获取当前项的Hero实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView heroImg = (ImageView) view.findViewById(R.id.hero_img);
        TextView heroName = (TextView) view.findViewById(R.id.hero_name);
        TextView heroInfo = (TextView) view.findViewById(R.id.hero_information);
        heroImg.setImageResource(hero.getImgId());
        heroName.setText(hero.getName());
        heroInfo.setText(hero.getIntroduce());
        return view;
    }
}
