package site.zachc.prove_06;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerListAdapter extends RecyclerView.Adapter<RecyclerListAdapter.ListViewHolder> {
    private String _data[];

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public MyViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    public RecyclerListAdapter(String[] data) {
        _data = data;
    }

    @Override
    public RecyclerListAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
//                .inflate(R.layout., parent, false);
        ListViewHolder vh = new ListViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(_data[position]);

    }

    @Override
    public int getItemCount() {
        return _data.length;
    }
}
