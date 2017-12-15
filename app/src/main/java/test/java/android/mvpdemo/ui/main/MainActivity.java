package test.java.android.mvpdemo.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import test.java.android.mvpdemo.R;
import test.java.android.mvpdemo.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
