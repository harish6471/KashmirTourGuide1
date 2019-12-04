package com.example.kashmirtourguide.charan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kashmirtourguide.Location;
import com.example.kashmirtourguide.R;

import java.util.ArrayList;

public class ListAdapter1 extends ArrayAdapter<Location> {

    //to create a custom on click listener for our button
    customButtonListener1 customListner;
   // customButtonListener1 customListener1;
    public interface customButtonListener1 {
        public void onButtonClickListner(int position);
    }

    public void setCustomButtonListner(customButtonListener1 listener) {
        this.customListner = listener;
    }

    public interface customButtonListener {
        public void onButtonClickListener1(int position);
    }



    public ListAdapter1(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item1, parent, false);
        }
        final Location currentAttraction = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.location_name_text_view);

        nameTextView.setText(currentAttraction.getPlaceNameId());

        TextView defaultTextView =  listItemView.findViewById(R.id.location_address_text_view);

        defaultTextView.setText(currentAttraction.getPlaceAddressId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentAttraction.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);


        Button button= listItemView.findViewById(R.id.Addreview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (customListner != null) {
                    customListner.onButtonClickListner(position);
                }

            }
        });



        return listItemView;
    }
}
