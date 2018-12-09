package ir.mftvanak.mftsundays;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //telling code to use which XML as View
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.students_names_item,viewGroup,false);

        //Making an Object of MyViewHolder class
        MyViewHolder holder = new MyViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 13;
    }









    class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
