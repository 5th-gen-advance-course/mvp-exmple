package test.java.android.mvpdemo.ui.main.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import test.java.android.mvpdemo.R;

/**
 * Created by ratha on 12/18/2017.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    TextView title,phone,url;
    ImageView icon;
    public CategoryViewHolder(View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.title);
        phone=itemView.findViewById(R.id.phone);
        url=itemView.findViewById(R.id.url);
        icon=itemView.findViewById(R.id.imageView);
    }
}
