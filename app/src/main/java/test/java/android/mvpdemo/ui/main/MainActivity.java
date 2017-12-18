package test.java.android.mvpdemo.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import javax.inject.Inject;

import test.java.android.mvpdemo.R;
import test.java.android.mvpdemo.base.BaseActivity;
import test.java.android.mvpdemo.di.App;
import test.java.android.mvpdemo.ui.main.adapter.CategoryAdapter;

public class MainActivity extends BaseActivity {

    private ProgressBar progressBar;
    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;

    @Inject
    public void setCategoryAdapter(CategoryAdapter categoryAdapter){
        this.categoryAdapter=categoryAdapter;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define dagger injection where dagger interface will be use
        ((App) getApplicationContext()).getComponent().inject(this);

        progressBar=findViewById(R.id.progressBar);
        recyclerView=findViewById(R.id.categoryRecyclerView);


    }
}
