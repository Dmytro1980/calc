package com.example.calc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // ! ! ! ! !
    // GridLayout
    // ! ! ! ! !

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;

    private Button buttonClear;

    private TextView textView;

    // дополнительные TextView для отладочной информации
    private TextView tempTextView1;
    private TextView tempTextView2;

    // числа для операции между ними
    // число №1
    private double buffer1;
    // число №2
    private double buffer2;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        // для использования разметки из activity_main.xml
//        // ! ! ! ! ! ! ! ! ! !
//        setContentView(R.layout.activity_main);
//        // ! ! ! ! ! ! ! ! ! !


        // програмное создание GridLayout
        GridLayout gridLayout = new GridLayout(this);

        // установка количество строк
        gridLayout.setRowCount(8);
        // установка количество столбцов
        gridLayout.setColumnCount(3);


        textView = new TextView(this);
        textView.setText("0");
        textView.setTextSize(75);
        GridLayout.LayoutParams layoutParamsTextView = new GridLayout.LayoutParams();
        layoutParamsTextView.columnSpec = GridLayout.spec(0, 3);
        layoutParamsTextView.rowSpec = GridLayout.spec(0);
        gridLayout.addView(textView, layoutParamsTextView);


        buttonClear = createButton(new Button(this), 11, "C");
        GridLayout.LayoutParams layoutParamsButtonClear = new GridLayout.LayoutParams();
        layoutParamsButtonClear.columnSpec = GridLayout.spec(0);
        layoutParamsButtonClear.rowSpec = GridLayout.spec(1);
        gridLayout.addView(buttonClear, layoutParamsButtonClear);

        button1 = createButton(new Button(this), 1, "1");
        GridLayout.LayoutParams layoutParams1 = new GridLayout.LayoutParams();
        layoutParams1.columnSpec = GridLayout.spec(0, 1);
        layoutParams1.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 90, getResources().getDisplayMetrics()
        );
        gridLayout.addView(button1, layoutParams1);

        button2 = createButton(new Button(this), 2, "2");
        gridLayout.addView(button2);

        button3 = createButton(new Button(this), 3, "3");
        gridLayout.addView(button3);

        button4 = createButton(new Button(this), 4, "4");
        gridLayout.addView(button4);

        button5 = createButton(new Button(this), 5, "5");
        gridLayout.addView(button5);

        button6 = createButton(new Button(this), 6, "6");
        gridLayout.addView(button6);

        button7 = createButton(new Button(this), 7, "7");
        gridLayout.addView(button7);

        button8 = createButton(new Button(this), 8, "8");
        gridLayout.addView(button8);

        button9 = createButton(new Button(this), 9, "9");
        gridLayout.addView(button9);


        button0 = createButton(new Button(this), 0, "0");

        GridLayout.LayoutParams layoutParams0 = new GridLayout.LayoutParams();
        layoutParams0.columnSpec = GridLayout.spec(0, 3);
        layoutParams0.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 270, getResources().getDisplayMetrics()
        );
        gridLayout.addView(button0, layoutParams0);


        // дополнительные TextView для отладочной информации
        tempTextView1 = new TextView(this);
        tempTextView1.setText("инфа про нажатие: ");
        tempTextView1.setTextSize(15);
        GridLayout.LayoutParams tempLayoutParamsTextView1 = new GridLayout.LayoutParams();
        tempLayoutParamsTextView1.columnSpec = GridLayout.spec(0, 3);
        tempLayoutParamsTextView1.rowSpec = GridLayout.spec(6);
        gridLayout.addView(tempTextView1, tempLayoutParamsTextView1);

        tempTextView2 = new TextView(this);
        tempTextView2.setText("инфа про view: ");
        tempTextView1.setTextSize(15);
        GridLayout.LayoutParams tempLayoutParamsTextView2 = new GridLayout.LayoutParams();
        tempLayoutParamsTextView2.columnSpec = GridLayout.spec(0, 3);
        tempLayoutParamsTextView2.rowSpec = GridLayout.spec(7);
        gridLayout.addView(tempTextView2, tempLayoutParamsTextView2);

        setContentView(gridLayout);
    }

    public Button createButton(Button button, Integer buttonID, String buttonText) {
        button.setText(buttonText);
        button.setId(buttonID);
        button.setOnClickListener(this);
        return button;
    }

    public String addNumber(String oldString, View view) {
        switch (oldString) {
            case "0":
                textView.setText("");
                return Integer.toString(view.getId());
            default:
                textView.setText("");
                return oldString + (view.getId());
        }
    }


    @Override
    public void onClick(View view) {

//        Button tempButton = (Button) view;

        buffer1 = Double.parseDouble((String) textView.getText());

        int tempID = view.getId();
        switch (tempID) {
            case 11:
                textView.setText("0");
                //для отладки
                tempTextView1.setText("tempID _0_ : " + tempID);
                tempTextView2.setText(view.toString());
                break;

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                textView.setText(addNumber((String) textView.getText(), view));
                //для отладки
                tempTextView1.setText("tempID _other_ :" + tempID);
                tempTextView2.setText(view.toString());

                break;
        }
    }


}