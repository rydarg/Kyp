package com.example.android.kyp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorsFragment extends Fragment {
    public ColorsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> setWord = new ArrayList<>();
        setWord.add(new Word("Red", "weṭeṭṭi", R.drawable.color_red));
        setWord.add(new Word("Green", "chokokki", R.drawable.color_green));
        setWord.add(new Word("Brown", "ṭakaakki", R.drawable.color_brown));
        setWord.add(new Word("Grey", "ṭopoppi", R.drawable.color_gray));
        setWord.add(new Word("Black", "kululli", R.drawable.color_black));
        setWord.add(new Word("White", "kelelli", R.drawable.color_white));
        setWord.add(new Word("Dusty Yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        setWord.add(new Word("Mustard Yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), setWord, R.color.category_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
