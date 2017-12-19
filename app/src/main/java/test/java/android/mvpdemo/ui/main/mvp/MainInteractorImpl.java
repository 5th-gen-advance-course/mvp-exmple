package test.java.android.mvpdemo.ui.main.mvp;

import android.util.Log;

import java.util.List;

import test.java.android.mvpdemo.entity.Category;
import test.java.android.mvpdemo.repository.CategoryRepository;

/**
 * Created by ratha on 12/19/2017.
 */

public class MainInteractorImpl implements MainInteractor {


    CategoryRepository repository;
    public MainInteractorImpl(CategoryRepository repository){
        this.repository=repository;
    }
    @Override
    public void getCategories(MainInteractorListener listener) {
        List<Category> categories=repository.getCategories();
        Log.e("size->",categories.size()+"");
        if (categories.isEmpty()){
            listener.onGetCategoryError();
        }else listener.onGetCategorySuccess(categories);
    }
}
