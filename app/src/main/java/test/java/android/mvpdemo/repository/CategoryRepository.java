package test.java.android.mvpdemo.repository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import test.java.android.mvpdemo.R;
import test.java.android.mvpdemo.entity.Category;

/**
 * Created by ratha on 12/19/2017.
 */

public class CategoryRepository {

    private List<Category> categories;

    public CategoryRepository(){
        categories=new ArrayList<>();
        for(int i=0;i<50;i++){
            categories.add(new Category(" BONGTHOM"," +(855-17) 333 885"," http://www.tverka.com", R.drawable.ball));
        }
    }

    public List<Category> getCategories() {
        return categories;
    }
}
