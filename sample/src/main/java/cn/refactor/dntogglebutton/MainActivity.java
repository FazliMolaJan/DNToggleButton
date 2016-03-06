package cn.refactor.dntogglebutton;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.TextView;

import cn.refactor.library.DNToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private DNToggleButton mToggleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextView
        int resId = (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES)
                ? R.drawable.ic_night : R.drawable.ic_day;
        Drawable drawable= getResources().getDrawable(resId);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());

        mTextView = (TextView) findViewById(R.id.tv);
        mTextView.setCompoundDrawables(drawable, null, null, null);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mToggleBtn.setChecked(!mToggleBtn.isChecked(), true);
            }
        });

        // ToggleButton
        mToggleBtn = (DNToggleButton) findViewById(R.id.dnBtn);
        mToggleBtn.setChecked(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO);
        mToggleBtn.setOnCheckedChangeListener(new DNToggleButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(DNToggleButton toggleButton, boolean isChecked) {

                // filter recreate
                int curMode = isChecked ? AppCompatDelegate.MODE_NIGHT_NO : AppCompatDelegate.MODE_NIGHT_YES;
                if (AppCompatDelegate.getDefaultNightMode() == curMode) {
                    return;
                }

                getDelegate().setLocalNightMode(isChecked ? AppCompatDelegate.MODE_NIGHT_NO : AppCompatDelegate.MODE_NIGHT_YES);
                AppCompatDelegate.setDefaultNightMode(isChecked ? AppCompatDelegate.MODE_NIGHT_NO : AppCompatDelegate.MODE_NIGHT_YES);
                recreate();
            }
        });

    }



}
