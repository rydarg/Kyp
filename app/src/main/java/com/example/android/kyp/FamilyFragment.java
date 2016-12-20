package com.example.android.kyp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FamilyFragment extends Fragment {
    public FamilyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> setWord = new ArrayList<>();
        setWord.add(new Word("Father", "әpә", R.drawable.family_father));
        setWord.add(new Word("Mother", "әṭa", R.drawable.family_mother));
        setWord.add(new Word("Son", "angsi", R.drawable.family_son));
        setWord.add(new Word("Daughter", "tune", R.drawable.family_daughter));
        setWord.add(new Word("Elder brother", "taachi", R.drawable.family_older_brother));
        setWord.add(new Word("Younger brother", "chalitti", R.drawable.family_younger_brother));
        setWord.add(new Word("Elder sister", "teṭe", R.drawable.family_older_sister));
        setWord.add(new Word("Younger sister", "kolliti", R.drawable.family_younger_sister));
        setWord.add(new Word("Grandfather", "paapa", R.drawable.family_grandfather));
        setWord.add(new Word("Grandmother", "ama", R.drawable.family_grandmother));
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), setWord, R.color.category_family);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;

    }
}
