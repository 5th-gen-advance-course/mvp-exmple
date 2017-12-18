package test.java.android.mvpdemo.ui.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import javax.inject.Inject;

import test.java.android.mvpdemo.R;
import test.java.android.mvpdemo.entity.Category;

/**
 * Created by ratha on 12/18/2017.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    Context context;
    List<Category> list;
    public CategoryAdapter(Context context){
        this.context =context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View
        View view= LayoutInflater.from(context).inflate(R.layout.category_item_recycler,parent,false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        if(list!=null){
            Category category=list.get(position);
            if(null!=category){
                holder.title.setText(category.getTitle()!=null ? category.getTitle():"");
                holder.phone.setText(category.getPhone()!=null ?category.getPhone():"");
                holder.url.setText(category.getUrl()!=null ?category.getUrl():"");
                holder.icon.setImageResource(category.getIcon());
            }
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
