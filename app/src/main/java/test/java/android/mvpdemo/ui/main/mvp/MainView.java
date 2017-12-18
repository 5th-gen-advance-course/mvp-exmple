package test.java.android.mvpdemo.ui.main.mvp;

/**
 * Created by ratha on 12/18/2017.
 */

public interface MainView {
    void onMessageError();
    void onMessageSuccess();
    void onShowProgressBar();
    void onHideProgressBar();
}
