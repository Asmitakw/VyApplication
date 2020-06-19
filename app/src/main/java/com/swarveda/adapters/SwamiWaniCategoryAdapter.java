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

import java.util.List;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Asmita on 10-08-2016.
 */
public class DailyQuoteAdapter extends RecyclerView.Adapter<DailyQuoteAdapter.ViewHolder> {
    private List<DailyQuotesItem> dailyQuotesList;
    private Context context;
    private Animation slide_up_animation;

    public DailyQuoteAdapter(Context context, List<DailyQuotesItem> dailyQuotesList) {
        this.dailyQuotesList = dailyQuotesList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvDailyQuote;
        CardView cvDonateNow;
        ImageView ivQuote;

        //set onclick listener to the entire view
        public ViewHolder(View view) {
            super(view);
            cvDonateNow = view.findViewById(R.id.cvDonateNow);
            tvDailyQuote = view.findViewById(R.id.tvDailyQuote);
            ivQuote = view.findViewById(R.id.ivQuote);
            ivQuote.bringToFront();
        }
    }

    //provide holder with onclick listener method.
    //here we perform our actions on Items of recycler view
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.daily_quote_list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final DailyQuotesItem dailyQuotesItem = dailyQuotesList.get(position);
        holder.tvDailyQuote.setText(dailyQuotesItem.getQuote());
    }

    @Override
    public int getItemCount() {
        return dailyQuotesList.size();
    }
}
