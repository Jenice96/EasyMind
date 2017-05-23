package cn.studyjams.s2.sj175.jenice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private DatabaseReference mDatabase; // database

    private TextView tvTest;
    private Button btnTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To read data from the database, you need an instance of DatabaseReference
        mDatabase = FirebaseDatabase.getInstance().getReference();

        tvTest= (TextView) findViewById(R.id.tv_test);
        btnTest = (Button) findViewById(R.id.btn_test);

        btnTest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_test:

                break;
        }
    }
}
