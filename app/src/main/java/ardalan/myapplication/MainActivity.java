package ardalan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public  void open(View view)
    {
        Intent calculatorForm = new Intent(MainActivity.this, Calculator.class);
        startActivity(calculatorForm);
    }
    public void multplyFunction(View view) {
        operation = "*";
        Apply();

    }

    private void Apply() {
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        String first = firstNum.getText().toString();
        String second = secondNum.getText().toString();
        String result = "";
        if (first.length() < 1) {
            firstNum.setError("This field is required");
            firstNum.requestFocus();
            return;
        }
        if (second.length() < 1) {
            secondNum.setError("This field is required");
            secondNum.requestFocus();
            return;
        }
        if (second.length() > 0)
            if (first.length() > 0)
                switch (operation) {
                    case "*":
                        result = String.valueOf(Integer.parseInt(second) * Integer.parseInt(first));
                        break;
                    case "-":
                        result = String.valueOf(Integer.parseInt(first) - Integer.parseInt(second));
                        break;
                    case "+":
                        result = String.valueOf(Integer.parseInt(second) + Integer.parseInt(first));
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
                    case "sqrt":
                        result = String.valueOf(Math.sqrt(Double.parseDouble(first)));
                        break;
                }

        final TextView textViewToChange = (TextView) findViewById(R.id.result);
        textViewToChange.setText(result);
    }

    public void minusFunction(View view) {
        operation = "-";
        Apply();
    }

    public void sumFuncion(View view) {
        operation = "+";
        Apply();
    }

    public void divisoinFunction(View view) {
        operation = "/";
        Apply();
        // public void divisionfunction(View )
    }

    public void remainder(View view) {
        operation = "%";
        Apply();
    }

    public void power(View view) {
        operation = "pow";
        Apply();
    }

    public void sqrt(View view) {
        operation = "sqrt";
        Apply();

    }
}