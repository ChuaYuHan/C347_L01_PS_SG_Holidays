package sg.edu.rp.c346.id19020844.sgholidays;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvHoliday;
    ArrayList<Holiday> alSecular;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        alSecular = new ArrayList<Holiday>();

        lv = (ListView) this.findViewById(R.id.lvHoliday);
        tvHoliday = (TextView) findViewById(R.id.tvType);

        alSecular.add(new Holiday("New Year's Day", "1 Jan 2021", "newyear"));
        alSecular.add(new Holiday("Chinese New Year", "12 & 13 February 2021", "cny"));
        alSecular.add(new Holiday("Good Friday", "2 April 2021", "goodfriday"));
        alSecular.add(new Holiday("Labour Day", "1 May 2021", "labourday"));
        alSecular.add(new Holiday("Hari Raya Pusa", "13 May 2021", "harirayapuasa"));
        alSecular.add(new Holiday("Vesak Day", "26 May 2021", "vesakday"));
        alSecular.add(new Holiday("Hari Raya Haji", "20 July 2021", "harirayahaji"));
        alSecular.add(new Holiday("National Day", "9 August 2021", "ndp"));
        alSecular.add(new Holiday("Deepavali", "4 November 2021", "deepavali"));
        alSecular.add(new Holiday("Christmas Day", "25 December 2021", "chrismas"));

        Intent i = getIntent();
        String type = i.getStringExtra("");
        tvHoliday.setText(type);

        aa = new HolidayAdapter(this, R.layout.row, alSecular);

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = alSecular.get(position);

                Toast.makeText(SecondActivity.this,
                        selectedHoliday.getHoliday() + ": " + selectedHoliday.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
