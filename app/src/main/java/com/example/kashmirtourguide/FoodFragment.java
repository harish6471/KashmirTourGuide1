package com.example.kashmirtourguide;


import com.example.kashmirtourguide.ListAdapter.customButtonListener;
import com.example.kashmirtourguide.ListAdapter.customButtonListener1;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class FoodFragment extends Fragment implements customButtonListener,customButtonListener1 {
   Button b1;
    DatabaseFood myDb ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myDb = new DatabaseFood(getActivity());
        View rootView = inflater.inflate(R.layout.list, container, false);


        final ArrayList<Location> cuisines = new ArrayList<Location>();
        cuisines.add(new Location(R.string.barbecues,
                R.string.barbecue_details, R.drawable.barbeque));
        cuisines.add(new Location(R.string.rogan_josh,
                R.string.rogan_josh_details, R.drawable.roganjosh));
        cuisines.add(new Location(R.string.noon_chai,
                R.string.noon_chai_details, R.drawable.noonchai));
        cuisines.add(new Location(R.string.meat_balls,
                R.string.meat_balls_details, R.drawable.rista));
        cuisines.add(new Location(R.string.czot,
                R.string.czot_details, R.drawable.czot));
        cuisines.add(new Location(R.string.gushtaba,
                R.string.gushtaba_details, R.drawable.goshtaba));
        cuisines.add(new Location(R.string.haakh,
                R.string.haakh_details, R.drawable.haak));
        cuisines.add(new Location(R.string.kebab,
                R.string.kebab_details, R.drawable.kebab));
        cuisines.add(new Location(R.string.yakhni,
                R.string.yakhni_details, R.drawable.yakhni));



        ListAdapter adapter = new ListAdapter(getActivity(), cuisines);
        adapter.setCustomButtonListner(FoodFragment.this);
        adapter.setCustomListener1(FoodFragment.this);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
       b1= listView.findViewById(R.id.review1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Intent intent = new Intent(getContext(), FoodIntent.class);
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    intent.putExtra("position",position);
                    startActivity(intent);

                } else if (position == 1) {
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if (position == 2) {
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if (position == 3) {
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if (position == 4) {
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if (position == 5) {
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if (position == 6) {
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if (position == 7) {
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if (position == 8) {
                    intent.putExtra("position",position);
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
            Toast.makeText(getContext(), "Review From DatabaseFood", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData0();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Barbecue \n");
            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");
            }
            showMessage("Data", buffer.toString());
        }

        else if(position==1)
        {
            Toast.makeText(getContext(), "Review From DatabaseFood", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData1();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Rogan Josh \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 2)
        {
            Toast.makeText(getContext(), "Review From DatabaseFood", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData2();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Noon Chai \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==3)
        {
            Toast.makeText(getContext(), "Review From DatabaseFood", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData3();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Rista \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 4)
        {
            Toast.makeText(getContext(), "Review From DatabaseFood", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData4();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Czot \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==5)
        {
            Toast.makeText(getContext(), "Review From DatabaseFood", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData5();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Gushtaba \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 6)
        {
            Toast.makeText(getContext(), "Review From DatabaseFood", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData6();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Haakh \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }

        else if(position==7)
        {
            Toast.makeText(getContext(), "Review From DatabaseFood", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData7();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Kebab \n");

            while (res.moveToNext()) {
                buffer.append("Review : " + res.getString(2) + "\n");

            }
            showMessage("Data", buffer.toString());
        }
        else if (position == 8)
        {
            Toast.makeText(getContext(), "Review From DatabaseFood", Toast.LENGTH_SHORT).show();

            Cursor res = myDb.getAllData8();
            if (res.getCount() == 0) {
                showMessage("Error", "Nothing found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("Title: Yakhni \n");

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
        builder.show().getWindow().setLayout(800,500);
    }
}

