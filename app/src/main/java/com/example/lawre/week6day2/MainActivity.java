package com.example.lawre.week6day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lawre.week6day2.model.Address;
import com.example.lawre.week6day2.model.CalculatePayroll;
import com.example.lawre.week6day2.model.Employee;
import com.example.lawre.week6day2.model.Name;
import com.example.lawre.week6day2.model.Timesheet;
import com.flurry.android.FlurryAgent;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity
{
    TextView tvEmployee, tvAddress, tvPay;
    Button btApply;

    private FirebaseAnalytics firebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvEmployee = findViewById(R.id.tvEmployee);
        tvAddress = findViewById(R.id.tvAddress);
        tvPay = findViewById(R.id.tvPay);
        btApply = findViewById(R.id.btApply);
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "9D5T5HNXSYCVJHJXY2V7");

    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.btApply)
        {
            Name name = new Name("Duke","Lawrence","Alphonso","Friday");
            Address address = new Address("1200 Main St","Plataplaya","Plataplaya","413612","San Abascal");
            Timesheet timesheet = new Timesheet(12f,37f,true);
            Employee employee = new Employee(name, address, timesheet);
            CalculatePayroll calculatePayroll = new CalculatePayroll(employee);
            HashMap<String, String> payroll = calculatePayroll.calculatePay();
            tvEmployee.setText(payroll.get("Name"));
            tvAddress.setText(payroll.get("Address"));
            tvPay.setText(payroll.get("Pay"));
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "clicked");
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        }
    }


}
