package cn.studyjams.s2.sj175.jenice;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CardView2Activity extends AppCompatActivity implements View.OnClickListener{
    private Toolbar toolbar;
    private ActionBar actionbar;
    private ImageView iv_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view2);

        iv_1 = (ImageView) findViewById(R.id.iv_2);
        toolbar = (Toolbar) findViewById(R.id.cardview2_toolbar);

        setSupportActionBar(toolbar);
        iv_1.setOnClickListener(this);

        actionbar = getSupportActionBar();
        actionbar.setTitle("Material Design");
        actionbar.setSubtitle("安卓5.0的新特性");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_2:
                Toast.makeText(getApplicationContext(), "感谢阅读本文章，希望对您的学习有很大帮助！", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
