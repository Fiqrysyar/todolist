package com.google.fiqry_list;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        public class MainActivity extends Activity {

            // ... variable declarations

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                // ... existing code ...
                items.add("Second Item");
                // Setup remove listener method call
                setupListViewListener();
            }

            // Attaches a long click listener to the listview
            private void setupListViewListener() {
                lvItems.setOnItemLongClickListener(
                        new AdapterView.OnItemLongClickListener() {
                            @Override
                            public boolean onItemLongClick(AdapterView<?> adapter,
                                                           View item, int pos, long id) {
                                // Remove the item within array at position
                                items.remove(pos);
                                // Refresh the adapter
                                itemsAdapter.notifyDataSetChanged();
                                // Return true consumes the long click event (marks it handled)
                                return true;
                            }

                        });
            }

            // ...onAddItem method

        }
    }
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ADD HERE
        lvItems = (ListView) findViewById(R.id.lvItems);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        items.add("First Item");
        items.add("Second Item");
        public void onAddItem(View v) {
            EditText etNewItem = (EditText) findViewById(R.id.etNewItem);
            String itemText = etNewItem.getText().toString();
            itemsAdapter.add(itemText);
            etNewItem.setText("");
        }
    }
}

    }
}
