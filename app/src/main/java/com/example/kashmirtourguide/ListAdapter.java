package com.example.kashmirtourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Location> {

    //to create a custom on click listener for our button
    customButtonListener customListner;
    customButtonListener1 customListener1;
    public interface customButtonListener {
        public void onButtonClickListner(int position);
    }

    public void setCustomButtonListner(customButtonListener listener) {
        this.customListner = listener;
    }

    public interface customButtonListener1 {
        public void onButtonClickListener1(int position);
    }
    public void setCustomListener1(customButtonListener1 listener1)
    {
        this.customListener1 = listener1;
    }


    public ListAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Location currentAttraction = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.location_name_text_view);

        nameTextView.setText(currentAttraction.getPlaceNameId());

        TextView defaultTextView =  listItemView.findViewById(R.id.location_address_text_view);

        defaultTextView.setText(currentAttraction.getPlaceAddressId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentAttraction.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);


        Button button= listItemView.findViewById(R.id.review1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (customListner != null) {
                    customListner.onButtonClickListner(position);
                }

            }
        });

        Button button1 = listItemView.findViewById(R.id.Addreview);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (customListener1 != null) {
                    customListener1.onButtonClickListener1(position);
                }
            }
        });


        return listItemView;
    }
}
