package com.example.kashmirtourguide;


import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.example.kashmirtourguide.ListAdapter.customButtonListener;
import com.example.kashmirtourguide.ListAdapter.customButtonListener1;

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

public class ParksFragment extends Fragment implements customButtonListener,customButtonListener1 {
    DatabaseParks myDb ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myDb = new DatabaseParks(getActivity());
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> attraction = new ArrayList<Location>();
        attraction.add(new Location(R.string.nishat,
                R.string.nishat_address, R.drawable.nishat));
        attraction.add(new Location(R.string.shalimar,
                R.string.shalimar_address, R.drawable.shalimarbag));
        attraction.add(new Location(R.string.dachigam,
                R.string.dachigam_address, R.drawable.dachigam));
        attraction.add(new Location(R.string.wular_park,
                R.string.wular_park_address, R.drawable.wularpark));
        attraction.add(new Location(R.string.nehru_park,
                R.string.nehru_park_address, R.drawable.nehru));

        ListAdapter adapter = new ListAdapter(getActivity(), attraction);
        adapter.setCustomButtonListner(ParksFragment.this);
        adapter.setCustomListener1(ParksFragment.this);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), Weather.class);

                if (position == 0) {
                    intent.putExtra("place", "srinagar");
                    startActivity(intent);
                } else if (position == 1) {
                    intent.putExtra("place", "shalimar");
                    startActivity(intent);
                } else if (position == 2) {
                    intent.putExtra("place", "srinagar");
                    startActivity(intent);
                } else if (position == 3) {
                    intent.putExtra("place", "bandipora");
                    startActivity(intent);
                } else if (position == 4) {
                    intent.putExtra("place", "srinagar");
                    startActivity(intent);
                }
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Nishat Bagh"));
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Shalimar Bagh"));
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Dachigam National park"));
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Wular vantage park"));
                    startActivity(intent);
                }
                else if(position==4)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Nehru park"));
                    startActivity(intent);
                }
                return true;
            }
        });

        return rootView;
    }

    @Override
    public void onButtonClickListner(int position) {
        if (position == 0)
        {
            Toast.makeText(getContext(), "Review From DatabaseParks", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData0();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Nishat \n");
            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");
            }
            showMessage("Data", buffer.toString());
        }

        else if(position==1)
        {
            Toast.makeText(getContext(), "Review From DatabaseParks", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData1();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Shalimar\n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 2)
        {
            Toast.makeText(getContext(), "Review From DatabaseParks", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData2();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Dachigam \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==3)
        {
            Toast.makeText(getContext(), "Review From DatabaseParks", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData3();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Wular Vantage \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 4)
        {
            Toast.makeText(getContext(), "Review From DatabaseParks", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData4();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Nehru park \n");

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

        }        builder.show().getWindow().setLayout(800,500);

    }
}
