package test.java.android.mvpdemo.entity;

/**
 * Created by ratha on 12/18/2017.
 */

public class Category {
    private String title;
    private String url;
    private String phone;
    private int icon;

    public Category(){}
    public Category(String title,String phone,String url,int icon){
        this.title=title;this.phone=phone;this.url=url;this.icon=icon;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
