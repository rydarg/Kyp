package com.example.android.kyp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesFragment extends Fragment {
    public PhrasesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> setWord = new ArrayList<>();
        setWord.add(new Word("Where are you going?", "minto wuksus"));
        setWord.add(new Word("What is your name?", "tinnә oyaase'nә"));
        setWord.add(new Word("My name is...", "oyaaset..."));
        setWord.add(new Word("How are you feeling?", "michәksәs?"));
        setWord.add(new Word("I’m feeling good", "kuchi achit"));
        setWord.add(new Word("Are you coming?", "әәnәs'aa?"));
        setWord.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        setWord.add(new Word("Let’s go", "yoowutis"));
        setWord.add(new Word("Come here", "әnni'nem"));
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), setWord, R.color.category_phrases);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}

