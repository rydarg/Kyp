package com.example.android.kyp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    WordAdapter(Activity context, ArrayList<Word> setWord, int ColorResourceId) {
        super(context, 0, setWord);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // create a list-item-view and inflate it into existence
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // call the getter methods to set the values of resp elements in the view.
        // also checking if they are null or not, before setting them.
        Word currentNow = getItem(position);
        TextView toTextView = (TextView) listItemView.findViewById(R.id.Miwok_TextView);
        if (currentNow != null) {
            toTextView.setText(currentNow.getToTranslation());
        }
        TextView fromTextView = (TextView) listItemView.findViewById(R.id.Default_TextView);
        if (currentNow != null) {
            fromTextView.setText(currentNow.getFromTranslation());
        }
        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.dispImg);
        if (currentNow != null) {
            if (currentNow.getDispImgInt() != 0) {
                iconImageView.setImageResource(currentNow.getDispImgInt());
                iconImageView.setVisibility(View.VISIBLE);
            } else {
                iconImageView.setVisibility(View.GONE);
            }
        }

        View textContainer = listItemView.findViewById(R.id.TextHolder);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

