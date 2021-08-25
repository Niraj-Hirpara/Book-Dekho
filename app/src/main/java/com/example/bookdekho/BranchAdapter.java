package com.example.bookdekho;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

public class BranchAdapter extends ArrayAdapter<Branch> {

    BranchAdapter (FragmentActivity context, ArrayList<Branch> branch) {

        super(context, 0, branch);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent,false);
        }

        RelativeLayout backgroundColor = (RelativeLayout) listItemView.findViewById(R.id.relative_layout);


        Branch currentBranch =  getItem(position);

        String colorCode = currentBranch.getColorCode();
        backgroundColor.setBackgroundColor(Color.parseColor(colorCode));

        ImageView smallImg = (ImageView) listItemView.findViewById(R.id.small_icon);
        smallImg.setImageResource(currentBranch.getSmallImgID());

        TextView branchName = (TextView) listItemView.findViewById(R.id.branch_name);
        branchName.setText(currentBranch.getBranchName());

        ImageView branchImg = (ImageView) listItemView.findViewById(R.id.branch_image);
        branchImg.setImageResource(currentBranch.getImgID());

        return listItemView;
    }


}
