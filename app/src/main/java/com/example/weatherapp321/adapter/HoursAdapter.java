package com.example.weatherapp321.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp321.R;
import com.example.weatherapp321.bean.HoursBean;

import java.util.List;


public class HoursAdapter extends RecyclerView.Adapter<HoursAdapter.HoursViewHolder> {
    private Context mContext;
    private List<HoursBean> mHoursBean;

    public HoursAdapter(Context mContext, List<HoursBean> mHoursBean) {
        this.mContext = mContext;
        this.mHoursBean = mHoursBean;
    }

    @NonNull
    @Override
    public HoursViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(mContext).inflate(R.layout.hours_item_layout,parent,false);

        return new HoursViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HoursViewHolder holder, int position) {
        HoursBean hoursBean=mHoursBean.get(position);
        holder.tvHour.setText(hoursBean.getHours());
        holder.tvHourtem.setText(hoursBean.getTem() + "°C");
        holder.tvHourwea.setText(hoursBean.getWea());
    }

    @Override
    public int getItemCount() {
        return (mHoursBean==null)?0:mHoursBean.size();
    }

    class HoursViewHolder extends RecyclerView.ViewHolder{
        TextView tvHour,tvHourtem,tvHourwea;
        public HoursViewHolder(@NonNull View itemView) {

            super(itemView);
            tvHourwea=itemView.findViewById(R.id.tv_hourwea);
            tvHourtem=itemView.findViewById(R.id.tv_hourtem);
            tvHour=itemView.findViewById(R.id.tv_hour);
        }
    }
}

