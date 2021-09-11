package com.shanto.project2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder> {
    private final LayoutInflater mInflater;
    private List<User> mUsers;

    UserListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        if(mUsers != null) {
            User current = mUsers.get(position);
            holder.userItemName.setText(current.getName());
            holder.userItemNid.setText(current.getNid());
        } else {
            // Covers the case of data not being ready yet.
            holder.userItemName.setText("No User!");
        }
    }

    void setUsers(List<User> users) {
        mUsers = users;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mUsers != null)
            return mUsers.size();
        else return 0;
    }


    class UserViewHolder extends RecyclerView.ViewHolder {
        private final TextView userItemName;
        private final TextView userItemNid;
        private UserViewHolder(View itemView) {
            super(itemView);
            userItemName = itemView.findViewById(R.id.textViewName);
            userItemNid = itemView.findViewById(R.id.textViewNid);
        }
    }

}
