package com.example.felightstudent.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    ListView lvMylist;
//
//    String[] heroList = {"batman","superman","deadpool","batman","superman","deadpool","batman","superman","deadpool","batman","superman","deadpool","batman","superman","deadpool","batman","superman","deadpool"};

    List<Employee> employeeList;

     RecyclerView rvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvList = (RecyclerView) findViewById(R.id.rvList);


        employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(1,"sukamal",20000));
        employeeList.add(new Employee(2,"vinay",30000));
        employeeList.add(new Employee(3,"vikas",40000));
        employeeList.add(new Employee(4,"kunal",50000));
        employeeList.add(new Employee(5,"batman",10000000));


        EmployeeAdaptar adaptar = new EmployeeAdaptar(this,employeeList);

        rvList.setAdapter(adaptar);

        rvList.setLayoutManager(new LinearLayoutManager(this));

        //rvList.setLayoutManager(new GridLayoutManager(this,3));

//        lvMylist = (ListView) findViewById(R.id.lvMyList);
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,heroList);
//
//
//        lvMylist.setAdapter(adapter);
//
//        lvMylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                Toast.makeText(getBaseContext(),heroList[i],Toast.LENGTH_LONG).show();
//
//            }
//        });
    }
}
