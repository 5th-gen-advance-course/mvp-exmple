package test.java.android.mvpdemo.ui.login;

/**
 * Created by Asus on 12/15/2017.
 */

public class LoginPresenterImpl implements Presenter.LoginPresenter,
        LoginInteractor.LoginResponseInteractor {

    public Presenter.LoginView view;
    LoginInteractor interactor;
    //public
    public LoginPresenterImpl(Presenter.LoginView loginView){
        this.view=loginView;
        interactor=new LoginInteractorImpl();
    }
    @Override
    public void onDestroyView() {
        if(view!=null) view=null;
    }

    @Override
    public void onLoginCredential(String userName, String pass) {
        if(view!=null) view.onShowProgressBar();
        interactor.login(userName,pass,this);
    }

    @Override
    public void onUserNameError() {
        if(view!=null){
            view.onUserNameError();
            view.onHideProgressBar();
        }

    }

    @Override
    public void onPasswordError() {
        if(view!=null){
            view.onHideProgressBar();
            view.onPasswordError();
        }
    }

    @Override
    public void onLoginSuccess() {
        if(view!=null){
            view.onLoginSuccess();
            view.onHideProgressBar();
        }

    }
}
