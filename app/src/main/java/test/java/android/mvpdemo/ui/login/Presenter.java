package test.java.android.mvpdemo.ui.login;

/**
 * Created by Asus on 12/15/2017.
 */

public interface Presenter {

    interface  LoginView{
        void onShowProgressBar();
        void onHideProgressBar();
        void onUserNameError();
        void onPasswordError();
        void onLoginSuccess();
    }

    interface LoginPresenter{
        void onDestroyView();
        void onLoginCredential(String userName,String pass);
        void setView(LoginView loginView);
    }


}
