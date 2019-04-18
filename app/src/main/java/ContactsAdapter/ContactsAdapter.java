package ContactsAdapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
    CircleImageView imgProfile;
    TextView tvname,tvnumber;


    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
        imgProfile=itemView.findViewById(R.id.imageprofile);
        tvname=itemView.findViewById(R.id.tvname);
        tvnumber=itemView.findViewById(R.id.tvnumber);

    }
}
}
