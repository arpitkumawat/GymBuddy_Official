package com.dscudr.gym_buddy.gym_buddy.DayFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dscudr.gym_buddy.gym_buddy.Adapter;
import com.dscudr.gym_buddy.gym_buddy.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MondayFragmentClass extends Fragment {

    RecyclerView rec;
    Adapter md;
    int image_rec[] = {R.drawable.pushup,R.drawable.pullups,R.drawable.flat_bench_press,R.drawable.inclined_dumbell_press,R.drawable.decline_doumblle_press,R.drawable.doumbell_bench_fly,R.drawable.chestdips,R.drawable.dumbell_bent_arm_pullover,R.drawable.crunch};
    String name[];
    public MondayFragmentClass() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_monday_fragment_class, container, false);
        name=getResources().getStringArray(R.array.exercise_name_mon_thu);
        md = new Adapter(getActivity(),image_rec,name,"monday");
        rec = (RecyclerView)view.findViewById(R.id.recycle);
        rec.setAdapter(md);
        rec.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
