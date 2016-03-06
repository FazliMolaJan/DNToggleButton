package cn.refactor.dntogglebutton;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * 作者 : andy
 * 日期 : 16/3/6 14:48
 * 邮箱 : andyxialm@gmail.com
 * 描述 :
 */
public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }

}
