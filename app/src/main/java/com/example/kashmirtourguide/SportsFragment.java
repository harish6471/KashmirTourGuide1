package com.example.kashmirtourguide;


import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AlertDialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.kashmirtourguide.ListAdapter.customButtonListener;
import com.example.kashmirtourguide.ListAdapter.customButtonListener1;

import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SportsFragment extends Fragment implements customButtonListener,customButtonListener1 {

    DatabaseSports myDb ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myDb = new DatabaseSports(getActivity());
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> attraction = new ArrayList<Location>();
        attraction.add(new Location(R.string.skiing,
                R.string.skiing_details, R.drawable.skiing));
        attraction.add(new Location(R.string.water_sports,
                R.string.water_sports_details, R.drawable.waterskiing));
        attraction.add(new Location(R.string.golf,
                R.string.golf_details, R.drawable.golf));
        attraction.add((new Location(R.string.cricket,R.string.cricket_details,R.drawable.cricket)));

        ListAdapter adapter = new ListAdapter(getActivity(), attraction);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        adapter.setCustomButtonListner(SportsFragment.this);
        adapter.setCustomListener1(SportsFragment.this);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Intent intent = new Intent(getContext(), SportsIntent.class);
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position == 0) {
                    intent.putExtra("position", position);
                    startActivity(intent);

                } else if (position == 1) {
                    intent.putExtra("position", position);
                    startActivity(intent);
                } else if (position == 2) {
                    intent.putExtra("position", position);
                    startActivity(intent);
                } else if (position == 3) {
                    intent.putExtra("position", position);
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
            Toast.makeText(getContext(), "Review From DatabaseSports", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData0();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Skiing \n");
            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");
            }
            showMessage("Review", buffer.toString());
        }

        else if(position==1)
        {
            Toast.makeText(getContext(), "Review From DatabaseSports", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData1();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Water Sports \n");
            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Review", buffer.toString());
        }
        else if (position == 2)
        {
            Toast.makeText(getContext(), "Review From DatabaseSports", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData2();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Golf \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");
            }
            showMessage("Review", buffer.toString());
        }

        else if(position==3)
        {
            Toast.makeText(getContext(), "Review From DatabaseSports", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData3();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Skiing \n");
            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Review", buffer.toString());
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
        builder.show().getWindow().setLayout(800,500);
    }
}
