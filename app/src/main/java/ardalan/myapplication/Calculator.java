package ardalan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    EditText esmaeelEditText;
TextView textView ;
    String first;
    String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        esmaeelEditText = (EditText) findViewById(R.id.editText2);
        textView = (TextView)findViewById(R.id.textView2);
    }

    public void zero(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "0");
    }

    public void one(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "1");
    }

    public void two(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "2");
    }

    public void three(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "3");
    }

    public void four(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "4");
    }

    public void five(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "5");
    }

    public void six(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "6");
    }

    public void seven(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "7");
    }

    public void eight(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "8");
    }

    public void nine(View view) {
        esmaeelEditText.setText(esmaeelEditText.getText().toString() + "9");
    }

    public void Equal (View view) {
        String result="";
        String second = esmaeelEditText.getText().toString();
        switch (operation)
        {
            case "*":
                result = String.valueOf(Integer.parseInt(first) * Integer.parseInt(second));
                break;
            case "-":
                result = String.valueOf(Integer.parseInt(first) - Integer.parseInt(second));
                break;
            case "+":
                result = String.valueOf(Integer.parseInt(first) + Integer.parseInt(second));
                break;
            case "/":
                result = String.valueOf(Integer.parseInt(first) / Integer.parseInt(second));
                break;
            case "%":
                result = String.valueOf(Integer.parseInt(first) % Integer.parseInt(second));
                break;
            case "pow":
                result = String.valueOf(Math.pow(Double.parseDouble(first), Double.parseDouble(second)));
                break;
            case "s":
                result = String.valueOf(Math.sqrt(Double.parseDouble(first)));
                break;

        }

        esmaeelEditText.setText(result);


    }

    public void delete (View view) {



        String txt = esmaeelEditText.getText().toString();
        txt = txt.length() > 1 ? txt.substring(0, txt.length() - 1) : "";
        esmaeelEditText.setText(txt);

    }
    public void add (View view) {first=esmaeelEditText.getText().toString();operation ="+";
        String txt = esmaeelEditText.getText().toString() + "+";
        textView.setText(txt); esmaeelEditText.setText("");

    }
    public void Negative (View view) {first=esmaeelEditText.getText().toString();operation ="-";
        String txt = esmaeelEditText.getText().toString() + "-";
        textView.setText(txt);esmaeelEditText.setText("");
    }
    public void Mul (View view) {first=esmaeelEditText.getText().toString();operation ="*";
        String txt = esmaeelEditText.getText().toString() + "*";
        textView.setText(txt); esmaeelEditText.setText("");
    }
    public void Squareroot (View view) {first=esmaeelEditText.getText().toString();
        String txt = esmaeelEditText.getText().toString() + "√";operation ="s";
        textView.setText(txt); esmaeelEditText.setText("");
    }
    public void Percent (View view) {operation ="%";first=esmaeelEditText.getText().toString();
        String txt = esmaeelEditText.getText().toString() + "%";
        textView.setText(txt); esmaeelEditText.setText("");
    }

        public void Division (View view)
         {first=esmaeelEditText.getText().toString();operation ="/";
             String txt = esmaeelEditText.getText().toString() + "÷";
             textView.setText(txt); esmaeelEditText.setText("");
         }





}