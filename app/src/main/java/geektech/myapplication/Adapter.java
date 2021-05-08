package geektech.myapplication;

import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Model> data = new ArrayList<>();
    public void addItem(Model model){
        data.add(model);
        notifyItemInserted(data.size()-1);
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title_tv, id_tv, description_tv, date_tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title_tv = itemView.findViewById(R.id.title_tv);
            id_tv = itemView.findViewById(R.id.id_tv);
            description_tv = itemView.findViewById(R.id.description_tv);
            date_tv = itemView.findViewById(R.id.date_tv);
        }

        public void onBind(Model model) {
            title_tv.setText(model.getTitle());
            id_tv.setText(model.getId());
            description_tv.setText(model.getDescription());
            date_tv.setText(DateUtils.formatDateTime
                    (itemView.getContext(), model.getDate(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE
                            | DateUtils.FORMAT_NUMERIC_DATE | DateUtils.FORMAT_SHOW_YEAR));
        }
    }
}
