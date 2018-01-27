package com.example.felightstudent.listviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Felight Student on 20-10-2017.
 */

public class EmployeeAdaptar extends RecyclerView.Adapter<EmployeeAdaptar.EmployeeHolder> {

    Context context;
    List<Employee> employeeList;

    EmployeeAdaptar(Context context, List<Employee> employeeList){
        this.context = context;
        this.employeeList = employeeList;
    }



    LayoutInflater inflater;

    @Override
    public EmployeeHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.single_row,parent,false);

        return new EmployeeHolder(view);

    }

    @Override
    public void onBindViewHolder(EmployeeHolder holder, int position) {

        holder.empId.setText(employeeList.get(position).getId()+"");
        holder.empName.setText(employeeList.get(position).getName());
        holder.empSalary.setText(employeeList.get(position).getSalary()+"");

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    class EmployeeHolder extends RecyclerView.ViewHolder{

        TextView empId;
        TextView empName;
        TextView empSalary;

        EmployeeHolder(View view){
            super(view);

            empId = (TextView)view.findViewById(R.id.eId);
            empName = (TextView)view.findViewById(R.id.empName);
            empSalary = (TextView)view.findViewById(R.id.empSalary);

        }

    }

}
