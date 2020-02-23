package com.example.lab_1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;

        import android.view.View;

        import android.widget.EditText;

        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        TextView textView = (TextView) findViewById(R.id.DepartureArrivalView);
        final EditText editDeparture = (EditText) findViewById(R.id.editDepature);
        final EditText editArrival = (EditText) findViewById(R.id.editArrival);

        RadioGroup radGrp=(RadioGroup) findViewById(R.id.radios);
        int id = radGrp.getCheckedRadioButtonId();
        switch(id) {
            case R.id.firsttime:
                textView.setText("Вибрано потяг з "+editDeparture.getText()+" в "+editArrival.getText()+" в 19:15");
                break;
            case R.id.secondtime:
                textView.setText("Вибрано потяг з "+editDeparture.getText()+" в "+editArrival.getText()+" в 20:45");
                break;
            default:
                break;
        }

    }
}
