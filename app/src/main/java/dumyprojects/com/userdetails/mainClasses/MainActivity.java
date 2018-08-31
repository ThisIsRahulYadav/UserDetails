package dumyprojects.com.userdetails.mainClasses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import dumyprojects.com.userdetails.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRadioButoonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.supplier:
                if (checked) {
                    Intent intent = new Intent(MainActivity.this,SearchDetails.class);
                    intent.putExtra("CODE VALUE","1");
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "SUPPLIER", Toast.LENGTH_SHORT).show();
                } break;
            case R.id.customer:
                if (checked) {
                    Intent intent = new Intent(MainActivity.this,SearchDetails.class);
                    intent.putExtra("CODE VALUE","2");
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "CUSTOMER", Toast.LENGTH_SHORT).show();
                } break;
            case R.id.employee:

                if (checked) {
                    Intent intent = new Intent(MainActivity.this,SearchDetails.class);
                    intent.putExtra("CODE VALUE","3");
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "EMPLOYEE", Toast.LENGTH_SHORT).show();
                } break;
        }
    }
}


