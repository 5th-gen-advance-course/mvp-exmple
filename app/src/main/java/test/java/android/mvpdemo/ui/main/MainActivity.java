package test.java.android.mvpdemo.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import test.java.android.mvpdemo.R;
import test.java.android.mvpdemo.base.BaseActivity;
import test.java.android.mvpdemo.di.App;
import test.java.android.mvpdemo.entity.Category;
import test.java.android.mvpdemo.ui.main.adapter.CategoryAdapter;
import test.java.android.mvpdemo.ui.main.mvp.MainPresenter;
import test.java.android.mvpdemo.ui.main.mvp.MainView;

public class MainActivity extends BaseActivity implements MainView{

    private ProgressBar progressBar;
    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    private MainPresenter presenter;

   @Inject
    public void setPresenter(MainPresenter presenter){
        this.presenter=presenter;
    }

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
        presenter.setView(this);
        progressBar=findViewById(R.id.progressBar);
        recyclerView=findViewById(R.id.categoryRecyclerView);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.categoryAdapter);

        //bind View
        presenter.getCategories();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroyView();
    }

    @Override
    public void onMessageError() {
        Toast.makeText(this, "Have an error while you get category", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onMessageSuccess() {
        Toast.makeText(this, "get​ category success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onShowProgressBar() {
        progressBar.setVisibility(ProgressBar.VISIBLE);
    }

    @Override
    public void onHideProgressBar() {
        progressBar.setVisibility(ProgressBar.INVISIBLE);
    }

    @Override
    public void onUpdateCategoryRecyclerView(List<Category> categories) {
        Log.e("update->",categories.size()+"");
        this.categoryAdapter.setList(categories);
    }
}
