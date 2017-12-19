package test.java.android.mvpdemo.di.module;

import android.app.Application;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import test.java.android.mvpdemo.entity.Category;
import test.java.android.mvpdemo.repository.CategoryRepository;
import test.java.android.mvpdemo.ui.login.LoginInteractor;
import test.java.android.mvpdemo.ui.login.LoginInteractorImpl;
import test.java.android.mvpdemo.ui.login.LoginPresenterImpl;
import test.java.android.mvpdemo.ui.login.Presenter;
import test.java.android.mvpdemo.ui.main.adapter.CategoryAdapter;
import test.java.android.mvpdemo.ui.main.adapter.CategoryViewHolder;
import test.java.android.mvpdemo.ui.main.mvp.MainInteractor;
import test.java.android.mvpdemo.ui.main.mvp.MainInteractorImpl;
import test.java.android.mvpdemo.ui.main.mvp.MainPresenter;
import test.java.android.mvpdemo.ui.main.mvp.MainPresenterImpl;

/**
 * Created by ratha on 12/18/2017.
 */

@Module
public class ActivityModule {

    private Application context;
    private List<Category> categories=new ArrayList<>();
    public ActivityModule(Application context){
        this.context=context;
    }

    @Provides
    @Singleton
    public Context getContext(){
        return context;
    }

    @Provides
    @Singleton
    public Presenter.LoginPresenter provideLoginPresenter(LoginInteractor loginInteractor){
        return new LoginPresenterImpl(loginInteractor);
    }
    @Provides
    @Singleton
    public LoginInteractor provideLoginInteractor(){
        return  new LoginInteractorImpl();
    }

    @Provides
    @Singleton
    public MainPresenter provideMaiinPresenter(MainInteractor interactor){
        return new MainPresenterImpl(interactor);
    }

    @Provides
    @Singleton
    public MainInteractor provideMainInteractor(CategoryRepository repository){
        return new MainInteractorImpl(repository);
    }

    @Provides
    @Singleton
    public CategoryAdapter provideCategory(){
        return new CategoryAdapter(context,this.categories);
    }

    @Provides
    @Singleton
    public CategoryRepository provideCategoryRepository(){
        return new CategoryRepository();
    }

}
