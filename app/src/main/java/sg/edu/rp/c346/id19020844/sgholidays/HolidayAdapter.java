package sg.edu.rp.c346.id19020844.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {

    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvHoliday, tvDate;
    private ImageView ivIcon;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);
        this.context = context;
        holiday = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvHoliday = (TextView) rowView.findViewById(R.id.holidayName);
        tvDate = (TextView) rowView.findViewById(R.id.holidayDate);
        ivIcon = (ImageView) rowView.findViewById(R.id.ivIcon);

        Holiday currentHoliday = holiday.get(position);
        tvHoliday.setText(currentHoliday.getHoliday());
        tvDate.setText(currentHoliday.getDate());

        if (currentHoliday.getIcon().equals("newyear")) {
            ivIcon.setImageResource(R.drawable.newyear);
        }
        else if (currentHoliday.getIcon().equals("cny")) {
            ivIcon.setImageResource(R.drawable.cny);
        }
        else if (currentHoliday.getIcon().equals("goodfriday")) {
            ivIcon.setImageResource(R.drawable.goodfriday);
        }
        else if (currentHoliday.getIcon().equals("labourday")) {
            ivIcon.setImageResource(R.drawable.labourday);
        }
        else if (currentHoliday.getIcon().equals("harirayapuasa")) {
            ivIcon.setImageResource(R.drawable.harirayapuasa);
        }
        else if (currentHoliday.getIcon().equals("vesakday")) {
            ivIcon.setImageResource(R.drawable.vesakday);
        }
        else if (currentHoliday.getIcon().equals("harirayahaji")) {
            ivIcon.setImageResource(R.drawable.harirayahaji);
        }
        else if (currentHoliday.getIcon().equals("ndp")) {
            ivIcon.setImageResource(R.drawable.ndp);
        }
        else if (currentHoliday.getIcon().equals("deepavali")) {
            ivIcon.setImageResource(R.drawable.deepavali);
        }
        else {
            ivIcon.setImageResource(R.drawable.christmas);
        }

        return rowView;
    }

}
