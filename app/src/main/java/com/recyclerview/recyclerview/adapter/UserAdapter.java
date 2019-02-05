package com.recyclerview.recyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.recyclerview.recyclerview.R;
import com.recyclerview.recyclerview.model.User;
import com.recyclerview.recyclerview.views.DetailsActivity;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private Context context;
    private ArrayList<User> userArrayList;

    public UserAdapter(Context context, ArrayList<User> userArrayList){

        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View userListView = LayoutInflater.from(context).inflate(R.layout.single_user_row,viewGroup,false);

        return new UserAdapter.ViewHolder(userListView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int position) {

        User user = userArrayList.get(position);

        // setting values
        viewHolder.tvUserName.setText(user.getName());

        // adding click listener
        viewHolder.tvUserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "Clicked on position "+viewHolder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {

        return userArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ViewHolder(@NonNull final View itemView) {

            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    User user = userArrayList.get(getAdapterPosition());

                    Toast.makeText(context, "Clicked on card  "+getAdapterPosition(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(context, DetailsActivity.class);

                    intent.putExtra("name",user.getName());
                    intent.putExtra("mobile",user.getMobileNo());
                    intent.putExtra("age",user.getAge());


                    context.startActivity(intent);

                }
            });

        }

        AppCompatTextView tvUserName = itemView.findViewById(R.id.tvUserName);
    }


}
