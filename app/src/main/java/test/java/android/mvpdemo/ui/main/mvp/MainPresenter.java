package test.java.android.mvpdemo.ui.main.mvp;

import java.util.List;

import test.java.android.mvpdemo.entity.Category;

/**
 * Created by ratha on 12/18/2017.
 */

public interface MainPresenter {

    void getCategories(List<Category> categories);
    void onDestroyView();
    void setView(MainView mainView);
}
