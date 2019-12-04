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


public class MustVisitFragment extends Fragment implements customButtonListener,customButtonListener1 {
    DatabaseMustVisit myDb ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myDb = new DatabaseMustVisit(getActivity());

        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> attraction = new ArrayList<Location>();
        attraction.add(new Location(R.string.gulmarg,
                R.string.gulmarg_details, R.drawable.gulmarg));
        attraction.add(new Location(R.string.srinagar,
                R.string.srinagar_details, R.drawable.srinagar));
        attraction.add(new Location(R.string.pahalgam,
                R.string.pahalgam_details, R.drawable.pahalgam));
        attraction.add(new Location(R.string.leh,
                R.string.leh_details, R.drawable.leh));
        attraction.add(new Location(R.string.pangong,
                R.string.pangong_lake, R.drawable.pangonglake));
        attraction.add(new Location(R.string.sonamarg,
                R.string.sonamarg_details, R.drawable.sonmarg));
        attraction.add(new Location(R.string.anantnag,
                R.string.anantnag_address, R.drawable.anantnag));
        attraction.add(new Location(R.string.kupwara,
                R.string.kupwara_details, R.drawable.kupwara));
        attraction.add(new Location(R.string.hemis,
                R.string.hemis_address, R.drawable.hemis));
        attraction.add(new Location(R.string.pulwama,
                R.string.pulwama_details, R.drawable.pulwama));
        attraction.add(new Location(R.string.baramulla,
                R.string.baramulla_details, R.drawable.baramulla));
        attraction.add(new Location(R.string.kargil,
                R.string.kargil_details, R.drawable.kargil));



        ListAdapter adapter = new ListAdapter(getActivity(), attraction);
        adapter.setCustomButtonListner(MustVisitFragment.this);
        adapter.setCustomListener1(MustVisitFragment.this);


        final ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getContext(),Weather.class);
                if(position==0) {
                    intent.putExtra("place","gulmarg");
                    startActivity(intent);
                }
                else if(position==1) {
                    intent.putExtra("place","srinagar");
                    startActivity(intent);
                }
                else if(position==2) {
                    intent.putExtra("place","pahalgam");
                    startActivity(intent);
                }else if(position==3) {
                    intent.putExtra("place","leh");
                    startActivity(intent);
                }else if(position==4) {
                    intent.putExtra("place","leh");
                    startActivity(intent);
                }else if(position==5) {
                    intent.putExtra("place","srinagar");
                    startActivity(intent);
                }else if(position==6) {
                    intent.putExtra("place","anantnag");
                    startActivity(intent);
                }else if(position==7) {
                    intent.putExtra("place","Sopore");
                    startActivity(intent);
                }else if(position==8) {
                    intent.putExtra("place","leh");
                    startActivity(intent);
                }else if(position==9) {
                    intent.putExtra("place","pulwama");
                    startActivity(intent);
                }else if(position==10) {
                    intent.putExtra("place","baramulla");
                    startActivity(intent);
                }else if(position==11) {
                    intent.putExtra("place","kargil");
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
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Gulmarg"));
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Srinagar"));
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Pahalgam"));
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=leh"));
                    startActivity(intent);
                }
                else if(position==4)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Pangong Lake"));
                    startActivity(intent);
                }
                else if(position==5)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Sonamarg"));
                    startActivity(intent);
                }
                else if(position==6)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Anantnag"));
                    startActivity(intent);
                }
                else if(position==7)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Kupwara"));
                    startActivity(intent);
                }
                else if(position==8)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Hemis"));
                    startActivity(intent);
                }
                else if(position==9)
                {

                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Pulwama"));
                    startActivity(intent);
                }
                else if(position==10)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Baramulla"));
                    startActivity(intent);
                }
                else if(position==11)
                {
                    Toast.makeText(getContext(),"Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Kargil"));
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
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData0();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Gulmarg \n");
            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==1)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData1();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Srinagar \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 2)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData2();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Pahalgam \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==3)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData3();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Leh \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 4)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData4();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Pangong Lake \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==5)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData5();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Sonamarg \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 6)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData6();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Anantnag \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==7)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData7();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Kupwara \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 8)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData8();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Hemis \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 9)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData9();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Pulwama \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 10)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData10();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Baramulla \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 11)
        {
            Toast.makeText(getContext(), "Review From DatabaseMustVisit", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData11();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Kargil \n");

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
        else if(position==8) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData8(EditTextValue);
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
        else if(position==9) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData9(EditTextValue);
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
        }else if(position==10) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData10(EditTextValue);
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
        else if(position==11) {
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String EditTextValue = editText.getText().toString();
                    Boolean isInserted = myDb.insertData11(EditTextValue);
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

