package cn.studyjams.s2.sj175.jenice;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private CardView cardView1,cardView2,cardView3,cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        cardView1 = (CardView) findViewById(R.id.cardview1);
        cardView2 = (CardView) findViewById(R.id.cardview2);
        cardView3 = (CardView) findViewById(R.id.cardview3);
        cardView4 = (CardView) findViewById(R.id.cardview4);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);

        setSupportActionBar(toolbar);
    }

    //toolbar右端
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_1:
                startActivity(new Intent(MainActivity.this,AboutActivity.class), ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardview1:
                startActivity(new Intent(MainActivity.this,CardView1Activity.class), ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.cardview2:
                startActivity(new Intent(MainActivity.this,CardView2Activity.class), ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.cardview3:
                startActivity(new Intent(MainActivity.this,CardView3Activity.class), ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.cardview4:
                startActivity(new Intent(MainActivity.this,CardView4Activity.class), ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
        }
    }
}
