package com.ninja.pg.screen;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ninja.pg.R;
import com.ninja.pg.dataType.DataType001;

import java.util.List;

public class ListFragmentRecyclerViewAdapter001 extends RecyclerView.Adapter<ListFragmentRecyclerViewAdapter001.ViewHolder> {

    private final List<DataType001> mValues;
    private final ListFragment001.OnCategoryClickedListener mListener;

    public ListFragmentRecyclerViewAdapter001(List<DataType001> items, ListFragment001.OnCategoryClickedListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.parts_001, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final DataType001 item = mValues.get(position);
        holder.mItem = item;
        holder.mIdView.setText(String.valueOf(item.id));
        holder.mContentView.setText(item.content);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    mListener.onCategoryClicked(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public DataType001 mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
