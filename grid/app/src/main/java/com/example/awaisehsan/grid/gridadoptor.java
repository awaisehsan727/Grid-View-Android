package com.example.awaisehsan.grid;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class gridadoptor extends BaseAdapter {
    Context context;
    private final int [] Images;
    private final String [] values;
    View view;
    LayoutInflater layoutInflater;

    public gridadoptor(Context context, int[] images, String[] values) {
        this.context = context;
        Images = images;
        this.values = values;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
      layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
      if (view==null)
      {
          view=new View(context);
          view=layoutInflater.inflate(R.layout.single_item,null );
          ImageView img=(ImageView)view.findViewById(R.id.imageView);
          TextView text=view.findViewById(R.id.text);
          img.setImageResource(Images[i]);
          text.setText(values[i]);
      }
      return view;
    }
}
