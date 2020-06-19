package com.swarveda.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.swarveda.R;
import com.swarveda.models.DailyQuotesItem;
import com.swarveda.models.SwamiWaniCategoryItem;

import java.util.List;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Asmita on 10-08-2016.
 */
public class SwamiWaniCategoryAdapter extends RecyclerView.Adapter<SwamiWaniCategoryAdapter.ViewHolder> {
    private List<SwamiWaniCategoryItem> swamiWaniCategoryList;
    private Context context;
    private Animation slide_up_animation;

    public SwamiWaniCategoryAdapter(Context context, List<SwamiWaniCategoryItem> swamiWaniCategoryList) {
        this.swamiWaniCategoryList = swamiWaniCategoryList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvSwamiWaniCategoryTitle;

        //set onclick listener to the entire view
        public ViewHolder(View view) {
            super(view);
            tvSwamiWaniCategoryTitle = view.findViewById(R.id.tvSwamiWaniCategoryTitle);
        }
    }

    //provide holder with onclick listener method.
    //here we perform our actions on Items of recycler view
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.swami_wani_category, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final SwamiWaniCategoryItem swamiWaniCategoryItem = swamiWaniCategoryList.get(position);
        holder.tvSwamiWaniCategoryTitle.setText(swamiWaniCategoryItem.getWaniName());
    }

    @Override
    public int getItemCount() {
        return swamiWaniCategoryList.size();
    }
}
