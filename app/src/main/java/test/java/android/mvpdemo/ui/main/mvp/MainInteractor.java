package test.java.android.mvpdemo.ui.main.mvp;

import java.util.List;

import test.java.android.mvpdemo.entity.Category;

/**
 * Created by ratha on 12/19/2017.
 */

public interface MainInteractor  {

    interface MainInteractorListener{
        void onGetCategoryError();
        void onGetCategorySuccess(List<Category> categories);
    }

    void getCategories(MainInteractorListener listener);
}
