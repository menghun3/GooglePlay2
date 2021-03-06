package com.example.googleplay.factory;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.widget.ListView;

import com.example.googleplay.utils.UIUtils;

public class ListViewFactory {

    public static ListView createListView() {
        ListView listView = new ListView(UIUtils.getContext());
        //简单设置
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            listView.setNestedScrollingEnabled(true);
        }
        listView.setCacheColorHint(Color.TRANSPARENT);
        listView.setFastScrollEnabled(true);
        //设置选中透明，去掉蓝色背景
        listView.setSelector(new ColorDrawable(Color.TRANSPARENT));
        return listView;
    }

}
