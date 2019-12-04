package com.example.kashmirtourguide;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.example.kashmirtourguide.ListAdapter.customButtonListener;
import com.example.kashmirtourguide.ListAdapter.customButtonListener1;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment implements customButtonListener,customButtonListener1{
    DatabaseRestaurants myDb ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myDb = new DatabaseRestaurants(getActivity());
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> attraction = new ArrayList<Location>();
        attraction.add(new Location(R.string.lalit_grand_palace,
                R.string.lalit_grand_palace_address, R.drawable.lalitgrandpalace));
        attraction.add(new Location(R.string.jamal_resorts,
                R.string.jamal_resorts_address, R.drawable.jamalresorts));
        attraction.add(new Location(R.string.stream,
                R.string.stream_address, R.drawable.stream));
        attraction.add(new Location(R.string.ahdoos,
                R.string.ahdoos_address, R.drawable.ahdoos));
        attraction.add(new Location(R.string.mughal_darbar,
                R.string.mughal_darbar_address, R.drawable.mughaldarbar));
        attraction.add(new Location(R.string.cloves_restaurant,
                R.string.cloves_restaurant_address, R.drawable.cloves));
        attraction.add(new Location(R.string.vivanta,
                R.string.vivanta_address, R.drawable.vivanta));
        attraction.add(new Location(R.string.the_orchard,
                R.string.the_orchard_address, R.drawable.theorchad));


        ListAdapter adapter = new ListAdapter(getActivity(), attraction);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        adapter.setCustomButtonListner(RestaurantsFragment.this);
        adapter.setCustomListener1(RestaurantsFragment.this);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {

                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=lalit grand palace"));
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=jamal resorts nishat"));
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=stream restaurant boulevard road"));
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=ahdoos hotel srinagar"));
                    startActivity(intent);
                }
                else if(position==4)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=mughal darbar residency road"));
                    startActivity(intent);
                }
                else if(position==5)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=cloves restaurant gulmarg"));
                    startActivity(intent);
                }
                else if(position==6)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Vivanta By taj srinagar"));
                    startActivity(intent);
                }
                else if(position==7)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=the orchad retreat and spa zukura srinagar"));
                    startActivity(intent);
                }
            }
        });

        return rootView;
    }

    @Override
    public void onButtonClickListner(int position) {
        if (position == 0)
        {
            Toast.makeText(getContext(), "Review From DatabaseRestaurants", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData0();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Lalit Grand Palace \n");
            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");
            }
            showMessage("Data", buffer.toString());
        }

        else if(position==1)
        {
            Toast.makeText(getContext(), "Review From DatabaseRestaurants", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData1();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Jamal Resorts \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 2)
        {
            Toast.makeText(getContext(), "Review From DatabaseRestaurants", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData2();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Stream \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==3)
        {
            Toast.makeText(getContext(), "Review From DatabaseRestaurants", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData3();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Ahdoos \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 4)
        {
            Toast.makeText(getContext(), "Review From DatabaseRestaurants", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData4();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Mughal Darbar \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==5)
        {
            Toast.makeText(getContext(), "Review From DatabaseRestaurants", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData5();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Cloves Restaurant \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 6)
        {
            Toast.makeText(getContext(), "Review From DatabaseRestaurants", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData6();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Vivanta \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==7)
        {
            Toast.makeText(getContext(), "Review From DatabaseRestaurants", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData7();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Orchard \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
    }
    private void showMessage(String title, String Message) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(),R.style.AlertDialogStyle);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.setIcon(R.drawable.review);
        builder.show();

    }

    @Override
    public void onButtonClickListener1(int position) {
        final EditText editText = new EditText(getContext());
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), R.style.AlertDialogStyle1);
        builder.setCancelable(false);
        builder.setTitle("Write Review");
        builder.setView(editText);
        builder.setIcon(R.drawable.write);
        if (position == 0) {

            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData0(EditTextValue);
                    if (isInserted) {
                        Toast.makeText(getContext(), "Added", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Not Added", Toast.LENGTH_LONG).show();
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

        } else if (position == 1) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData1(EditTextValue);
                    if (isInserted) {
                        Toast.makeText(getContext(), "Added", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Not Added", Toast.LENGTH_LONG).show();
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        }
        else if(position==2) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData2(EditTextValue);
                    if (isInserted) {
                        Toast.makeText(getContext(), "Added", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Not Added", Toast.LENGTH_LONG).show();
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        }
        else if(position==3) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData3(EditTextValue);
                    if (isInserted) {
                        Toast.makeText(getContext(), "Added", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Not Added", Toast.LENGTH_LONG).show();
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        }
        else if (position == 4) {

            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData4(EditTextValue);
                    if (isInserted) {
                        Toast.makeText(getContext(), "Added", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Not Added", Toast.LENGTH_LONG).show();
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

        } else if (position == 5) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData5(EditTextValue);
                    if (isInserted) {
                        Toast.makeText(getContext(), "Added", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Not Added", Toast.LENGTH_LONG).show();
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        }
        else if(position==6) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData6(EditTextValue);
                    if (isInserted) {
                        Toast.makeText(getContext(), "Added", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Not Added", Toast.LENGTH_LONG).show();
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        }
        else if(position==7) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData7(EditTextValue);
                    if (isInserted) {
                        Toast.makeText(getContext(), "Added", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Not Added", Toast.LENGTH_LONG).show();
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        }
        builder.show().getWindow().setLayout(800,500);
    }
}
