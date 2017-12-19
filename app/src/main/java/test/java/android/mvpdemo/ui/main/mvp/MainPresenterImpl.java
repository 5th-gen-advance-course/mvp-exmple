package test.java.android.mvpdemo.ui.main.mvp;

import android.util.Log;
import android.view.View;

import java.util.List;

import javax.inject.Inject;

import test.java.android.mvpdemo.entity.Category;

/**
 * Created by ratha on 12/19/2017.
 */

public class MainPresenterImpl implements MainPresenter {


    MainInteractor interactor;
    MainView view;

    @Inject
    public MainPresenterImpl(MainInteractor interactor){
        this.interactor=interactor;
    }

    @Override
    public void getCategories() {
        if(null!=view){
            view.onShowProgressBar();
        }
        this.interactor.getCategories(new MainInteractor.MainInteractorListener() {
            @Override
            public void onGetCategorySuccess(List<Category> categories) {
                Log.e("category call back->",""+categories.size());
                if (view != null){
                    view.onUpdateCategoryRecyclerView(categories);
                    view.onMessageSuccess();
                    Log.e("category->",""+categories.size());
                    view.onHideProgressBar();
                }
            }
            @Override
            public void onGetCategoryError() {
                if(null !=view){
                    view.onHideProgressBar();
                    view.onMessageError();
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        if(view!=null)
            this.view=null;
    }

    @Override
    public void setView(MainView mainView) {
        this.view=mainView;
    }
}
