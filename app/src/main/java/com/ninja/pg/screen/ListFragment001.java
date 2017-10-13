package com.ninja.pg.screen;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ninja.pg.R;
import com.ninja.pg.constant.KotolinPageCategoryType;
import com.ninja.pg.constant.ListContentType;
import com.ninja.pg.constant.MainPageCategoryType;
import com.ninja.pg.contentType.KotolinMainPageCategoryType001;
import com.ninja.pg.contentType.MainPageCategoryType001;
import com.ninja.pg.dataType.DataType001;
import com.ninja.pg.kotolinYard.Kotolin001JActivity;
import com.ninja.pg.kotolinYard.Kotolin001KActivity;
import com.ninja.pg.kotolinYard.KotolinMainActivity;

import java.util.List;

public class ListFragment001 extends Fragment {
    private static final String ARG_LIST_CONTENT_TYPE = "arg_list_content_type";

    private int mColumnCount = 2;
    @ListContentType.Type
    private int listContentType = ListContentType.MAIN_PAGE_CATEGORY;
    private OnCategoryClickedListener categoryClickedListener;

    public ListFragment001() {
    }

    @SuppressWarnings("unused")
    public static ListFragment001 newInstance(@ListContentType.Type int listContentType) {
        ListFragment001 fragment = new ListFragment001();
        Bundle args = new Bundle();
        args.putInt(ARG_LIST_CONTENT_TYPE, listContentType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    @SuppressWarnings("ResourceType")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            listContentType = getArguments().getInt(ARG_LIST_CONTENT_TYPE, ListContentType.MAIN_PAGE_CATEGORY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_001, container, false);

        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new ListFragmentRecyclerViewAdapter001(getData(), categoryClickedListener));
        }
        return view;
    }

    private List<DataType001> getData() {
        switch (listContentType) {
            case ListContentType.MAIN_PAGE_CATEGORY:
                return MainPageCategoryType001.ITEMS;
            case ListContentType.KOTOLIN_MAIN_PAGE_CATEGORY:
                return KotolinMainPageCategoryType001.ITEMS;
        }

        return MainPageCategoryType001.ITEMS;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnCategoryClickedListener) {
            categoryClickedListener = (OnCategoryClickedListener) context;
        } else {
            categoryClickedListener = makeDefaultCategoryClickedListener();
        }
    }

    @NonNull
    private OnCategoryClickedListener makeDefaultCategoryClickedListener() {
        return new OnCategoryClickedListener() {
            @Override
            public void onCategoryClicked(final DataType001 item) {
                switch (listContentType) {
                    case ListContentType.MAIN_PAGE_CATEGORY:
                        mainPageCategoryClicked(item);
                        break;
                    case ListContentType.KOTOLIN_MAIN_PAGE_CATEGORY:
                        kotolinMainPageCategoryClicked(item);
                        break;
                }
            }
        };
    }

    private void kotolinMainPageCategoryClicked(DataType001 item) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }

        switch (item.id) {
            case KotolinPageCategoryType.KOTOLIN_001_J:
                activity.startActivity(new Intent(activity, Kotolin001JActivity.class));
                break;
            case KotolinPageCategoryType.KOTOLIN_001_K:
                activity.startActivity(new Intent(activity, Kotolin001KActivity.class));
                break;
        }
    }

    private void mainPageCategoryClicked(final DataType001 item) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }

        switch (item.id) {
            case MainPageCategoryType.KOTOLIN:
                activity.startActivity(new Intent(activity, KotolinMainActivity.class));
                break;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        categoryClickedListener = null;
    }

    public interface OnCategoryClickedListener {
        void onCategoryClicked(DataType001 item);
    }
}
