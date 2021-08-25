package com.example.bookdekho;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_home,container,false);

        ArrayList<Branch> branchList = new ArrayList<>();

        branchList.add(new Branch(R.drawable.ic_biomedical,"Bio-Medical Engineering",R.drawable.biomedical_img,"#f76d63"));
        branchList.add(new Branch(R.drawable.ic_chemical,"Chemical Engineering",R.drawable.chemical_img,"#00b4db"));
        branchList.add(new Branch(R.drawable.ic_civil,"Civil Engineering",R.drawable.civil_img,"#D2691E"));
        branchList.add(new Branch(R.drawable.ic_computer,"Computer Engineering",R.drawable.computer_img,"#FF5F6D"));
        branchList.add(new Branch(R.drawable.ic_electric,"Electrical Engineering",R.drawable.electrical_img,"#4E65FF"));
        branchList.add(new Branch(R.drawable.ic_electric,"Electronics & Communication Engineering",R.drawable.elecronics_communication_img,"#11998E"));
        branchList.add(new Branch(R.drawable.ic_information,"Information Technology",R.drawable.information_tech_img,"#FB7B8E"));
        branchList.add(new Branch(R.drawable.ic_instrument,"Instrumentation & Control Engineering",R.drawable.instrumentation_eng_img,"#E34234"));
        branchList.add(new Branch(R.drawable.ic_mechanical,"Mechanical Engineering",R.drawable.mechanical_img,"#4e54c8"));
        branchList.add(new Branch(R.drawable.ic_power,"Power Electronics Engineering",R.drawable.power_elecronics_img,"#f88948"));


        BranchAdapter branchAdapter = new BranchAdapter(getActivity(),branchList);
        ListView list = (ListView) rootView.findViewById(R.id.fragment_home_xml);
        list.setAdapter(branchAdapter);

        return rootView;
        // return inflater.inflate(R.layout.fragment_home, container, false);
    }
}