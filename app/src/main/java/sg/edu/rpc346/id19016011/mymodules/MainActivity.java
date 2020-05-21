package sg.edu.rpc346.id19016011.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textViewAP, textViewIP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewAP = findViewById(R.id.textView);
        textViewIP = findViewById(R.id.textView2);

        textViewAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Output.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Android Programming");
                intent.putExtra("academicYear",2020);
                intent.putExtra("semester",1);
                intent.putExtra("moduleCredit",4);
                intent.putExtra("venue","W66M");

                startActivity(intent);
            }
        });


        textViewIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Output.class);
                intent.putExtra("ModuleCode","C349");
                intent.putExtra("moduleName","iPad Programming");
                intent.putExtra("academicYear",2020);
                intent.putExtra("semester",1);
                intent.putExtra("moduleCredit",4);
                intent.putExtra("venue","W66M");

                startActivity(intent);
            }
        });

        
    }
}
