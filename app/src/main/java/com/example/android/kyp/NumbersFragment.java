package com.example.android.kyp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersFragment extends Fragment {
    public NumbersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> setWord = new ArrayList<>();
        Word w = new Word("One", "Lutti", R.drawable.number_one);
        setWord.add(w);
        setWord.add(new Word("Two", "Otiiko", R.drawable.number_two));
        setWord.add(new Word("Three", "Tolookosu", R.drawable.number_three));
        setWord.add(new Word("Four", "Oyyisa", R.drawable.number_four));
        setWord.add(new Word("Five", "Massokka", R.drawable.number_five));
        setWord.add(new Word("Six", "Temmokka", R.drawable.number_six));
        setWord.add(new Word("Seven", "Kenekaku", R.drawable.number_seven));
        setWord.add(new Word("Eight", "Kawinta", R.drawable.number_eight));
        setWord.add(new Word("Nine", "Wo'e", R.drawable.number_nine));
        setWord.add(new Word("Ten", "Na'aacha", R.drawable.number_ten));
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), setWord, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
