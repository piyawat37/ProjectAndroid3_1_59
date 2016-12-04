package com.example.evitected.math_piece;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Evitected on 24/11/2559.
 */
public class CustomAdapter extends BaseAdapter {
    Context mContext;
    int[] NumberResourceID;

    public CustomAdapter(Context mContext, int[] NumberResourceID) {
        this.mContext = mContext;
        this.NumberResourceID = NumberResourceID;
    }

    @Override
    public int getCount() {
        return NumberResourceID.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder myHolder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.activity_layout__gridview, null);
            myHolder = new ViewHolder();
            myHolder.operateLine = (ImageView) convertView.findViewById(R.id.operateLine);
            myHolder.operateLine.setOnLongClickListener(new LongPressListener());
            convertView.setTag(myHolder);
        } else{
            myHolder = (ViewHolder) convertView.getTag();
        }
        myHolder.operateLine.setImageResource(NumberResourceID[position]);
        return convertView;
    }
    public class ViewHolder{
        ImageView operateLine;
    }
    class LongPressListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View view) {
            final ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
            view.startDrag(data, shadowBuilder, view, 0);
            view.setVisibility(View.INVISIBLE);
            return true;
        }
    }
}
