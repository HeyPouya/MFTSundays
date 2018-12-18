package ir.mftvanak.mftsundays;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.MyViewHolder> {


    private List<String> studentsNames = new ArrayList<>();

    StudentListAdapter(List<String> names) {
    studentsNames = names;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //telling code to use which XML as View
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.students_names_item, viewGroup, false);

        //Making an Object of MyViewHolder class
        MyViewHolder holder = new MyViewHolder(v);

        return holder;
    }


    /**
     * Tell Ui to fill each row with proper value
     *
     * @param myViewHolder
     * @param i
     */
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        String s = studentsNames.get(i);
        myViewHolder.tv.setText(s);
    }

    @Override
    public int getItemCount() {
        return studentsNames.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv = itemView.findViewById(R.id.txtNames);

        }
    }
}
