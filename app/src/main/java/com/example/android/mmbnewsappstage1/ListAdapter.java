package com.example.android.mmbnewsappstage1;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ListAdapter extends ArrayAdapter<NewsObject> {


        public ListAdapter(Activity context, ArrayList<NewsObject> news) {
            // **Here, we initialize the ArrayAdapter's internal storage for the context and the list.
            // the second argument is used when the ArrayAdapter is populating a single TextView.
            // We use 0 as a second argument because we don't need to rely on the ArrayAdapter to create a ListView for us.
            // Instead, the getView method will handle the inflating of the layout from the layout ressource ID.*/
            super(context, 0, news);
        }
        @Override
        //**Provides a view for an adapter View (ListView, GridView)
        // @param position - the adapter position that is requesting a view
        // @param convertView - the recycled view to populate
        // @param parent - the parent view which is used for inflation*/

        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.card_element, parent, false);
            }

            // Get the object located at this position in the list
            NewsObject currentNews = getItem(position);

            // Find the TextView in the list_view layout
            TextView titleView = (TextView) listItemView.findViewById(R.id.title_view);

            // Display the title of the current news in that TextView
            titleView.setText(currentNews.getTitle());

            // Find the TextView in the list_view layout
            TextView categoryView = (TextView) listItemView.findViewById(R.id.category_view);

            // Display the title of the current news in that TextView
            categoryView.setText(currentNews.getCategory());

            // Find the TextView in the list_view layout
            TextView dateView = (TextView) listItemView.findViewById(R.id.date_view);

            // Display the title of the current news in that TextView
            dateView.setText(currentNews.getDate());

            // Return the whole list item layout
            // so that it can be shown in the ListView
            return listItemView;
        }

        }
