package cn.studyjams.s1.sj17.fanyulong;

/**
 * Created by fanfan on 2016/4/21.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ListViewForScrollView extends ListView {
    public ListViewForScrollView(Context context) {
        super(context);
    }

    public ListViewForScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListViewForScrollView(Context context, AttributeSet attrs,
                                 int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    /**
     * 重写该方法，达到使ListView适应ScrollView的效果
     */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
    /*
    *三个构造方法完全不用动，只要重写onMeasure方法
    *在xml布局中和Activity中使用的ListView改成这个自定义ListView就行了。
    */