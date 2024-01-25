package com.example.calc;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
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

    private Button button1; // id  = 1
    private Button button2; // id  = 2
    private Button button3; // id  = 3
    private Button button4; // id  = 4
    private Button button5; // id  = 5
    private Button button6; // id  = 6
    private Button button7; // id  = 7
    private Button button8; // id  = 8
    private Button button9; // id  = 9
    private Button button0; // id  = 0

    private Button buttonClear; // id  = 11
    private Button buttonPoint; // id  = 12
    private Button buttonPlus; // id  = 13
    private Button buttonMinus; // id  = 14
    private Button buttonMultiply; // id  = 15
    private Button buttonDivide; // id  = 16
    private Button buttonEquals; // id  = 17

    private TextView textView;
    private TextView textView2;

    // дополнительные TextView для отладочной информации
    private TextView tempTextView1;
    private TextView tempTextView2;
    private TextView tempTextView3;

    // числа для операции между ними
    // число №1
    private double buffer1;
    // число №2
    private double buffer2;

    // полностью ли введено число
    private boolean isAlreadyEntered;

    // посчитано ли число
    private boolean isCalculated;


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
        gridLayout.setRowCount(9);
        // установка количество столбцов
        gridLayout.setColumnCount(4);

        isAlreadyEntered = false;

        isCalculated = false;



        textView = new TextView(this);
        textView.setText("0");
        textView.setTextSize(70);
        GridLayout.LayoutParams layoutParamsTextView = new GridLayout.LayoutParams();
        layoutParamsTextView.columnSpec = GridLayout.spec(0, 4);
        layoutParamsTextView.rowSpec = GridLayout.spec(0);
        gridLayout.addView(textView, layoutParamsTextView);

        textView2 = new TextView(this);
        textView2.setText("...");
        textView2.setTextSize(70);
        GridLayout.LayoutParams layoutParamsTextView2 = new GridLayout.LayoutParams();
        layoutParamsTextView2.columnSpec = GridLayout.spec(3, 1, GridLayout.CENTER);
        layoutParamsTextView2.rowSpec = GridLayout.spec(0);
        gridLayout.addView(textView2, layoutParamsTextView2);


        buttonClear = createButton(new Button(this), 11, "C");
        GridLayout.LayoutParams layoutParamsButtonClear = new GridLayout.LayoutParams();
        layoutParamsButtonClear.columnSpec = GridLayout.spec(0);
        layoutParamsButtonClear.rowSpec = GridLayout.spec(1);
        gridLayout.addView(buttonClear, layoutParamsButtonClear);

        buttonPlus = createButton(new Button(this), 13, "+");
        GridLayout.LayoutParams layoutParamsButtonPlus = new GridLayout.LayoutParams();
        layoutParamsButtonPlus.columnSpec = GridLayout.spec(3);
        layoutParamsButtonPlus.rowSpec = GridLayout.spec(1);
        gridLayout.addView(buttonPlus, layoutParamsButtonPlus);


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

        buttonMinus = createButton(new Button(this), 14, "-");
        GridLayout.LayoutParams layoutParamsButtonMinus = new GridLayout.LayoutParams();
        layoutParamsButtonMinus.columnSpec = GridLayout.spec(3);
        layoutParamsButtonMinus.rowSpec = GridLayout.spec(2);
        gridLayout.addView(buttonMinus, layoutParamsButtonMinus);


        button4 = createButton(new Button(this), 4, "4");
        gridLayout.addView(button4);

        button5 = createButton(new Button(this), 5, "5");
        gridLayout.addView(button5);

        button6 = createButton(new Button(this), 6, "6");
        gridLayout.addView(button6);

        buttonMultiply = createButton(new Button(this), 15, "*");
        GridLayout.LayoutParams layoutParamsButtonMultiply = new GridLayout.LayoutParams();
        layoutParamsButtonMultiply.columnSpec = GridLayout.spec(3);
        layoutParamsButtonMultiply.rowSpec = GridLayout.spec(3);
        gridLayout.addView(buttonMultiply, layoutParamsButtonMultiply);


        button7 = createButton(new Button(this), 7, "7");
        gridLayout.addView(button7);

        button8 = createButton(new Button(this), 8, "8");
        gridLayout.addView(button8);

        button9 = createButton(new Button(this), 9, "9");
        gridLayout.addView(button9);

        buttonDivide = createButton(new Button(this), 16, "/");
        GridLayout.LayoutParams layoutParamsButtonDivide = new GridLayout.LayoutParams();
        layoutParamsButtonDivide.columnSpec = GridLayout.spec(3);
        layoutParamsButtonDivide.rowSpec = GridLayout.spec(4);
        gridLayout.addView(buttonDivide, layoutParamsButtonDivide);

        button0 = createButton(new Button(this), 0, "0");
        GridLayout.LayoutParams layoutParams0 = new GridLayout.LayoutParams();
        layoutParams0.columnSpec = GridLayout.spec(0, 2);
        layoutParams0.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 180, getResources().getDisplayMetrics()
        );
        gridLayout.addView(button0, layoutParams0);

        buttonPoint = createButton(new Button(this), 12, ".");
        gridLayout.addView(buttonPoint);

        buttonEquals = createButton(new Button(this), 17, "=");
        GridLayout.LayoutParams layoutParamsButtonEquals = new GridLayout.LayoutParams();
        layoutParamsButtonEquals.columnSpec = GridLayout.spec(3);
        layoutParamsButtonEquals.rowSpec = GridLayout.spec(5);
        gridLayout.addView(buttonEquals, layoutParamsButtonEquals);

        // временное
        // первое дополнительное TextView для отладочной информации
        tempTextView1 = new TextView(this);
        tempTextView1.setText("инфа про нажатие: ");
        tempTextView1.setTextSize(15);
        GridLayout.LayoutParams tempLayoutParamsTextView1 = new GridLayout.LayoutParams();
        tempLayoutParamsTextView1.columnSpec = GridLayout.spec(0, 4);
        tempLayoutParamsTextView1.rowSpec = GridLayout.spec(6);
        gridLayout.addView(tempTextView1, tempLayoutParamsTextView1);

        // временное
        // второе дополнительное TextView для отладочной информации
        tempTextView2 = new TextView(this);
        tempTextView2.setText("инфа про view: ");
        tempTextView1.setTextSize(15);
        GridLayout.LayoutParams tempLayoutParamsTextView2 = new GridLayout.LayoutParams();
        tempLayoutParamsTextView2.columnSpec = GridLayout.spec(0, 4);
        tempLayoutParamsTextView2.rowSpec = GridLayout.spec(7);
        gridLayout.addView(tempTextView2, tempLayoutParamsTextView2);

        // временное
        // третье дополнительное TextView для отладочной информации
        tempTextView3 = new TextView(this);
        tempTextView3.setText("количество знаков");
        tempTextView3.setTextSize(15);
        GridLayout.LayoutParams tempLayoutParamsTextView3 = new GridLayout.LayoutParams();
        tempLayoutParamsTextView3.columnSpec = GridLayout.spec(0, 4);
        tempLayoutParamsTextView3.rowSpec = GridLayout.spec(8);
        gridLayout.addView(tempTextView3, tempLayoutParamsTextView3);

        setContentView(gridLayout);
    }

    public Button createButton(Button button, Integer buttonID, String buttonText) {
        button.setText(buttonText);
        button.setId(buttonID);
        button.setOnClickListener(this);
        return button;
    }

    public String addNumber(String oldString, View view) {

        Button tempButton = (Button) view;

        switch (oldString) {
            case "0":
                textView.setText("");
                return (String) tempButton.getText();
            default:
                textView.setText("");


                if (oldString.length() < 9 & !isAlreadyEntered & !isCalculated) {
                    return oldString + (tempButton.getText());
                } else {
                    return oldString;
                }
        }
    }


    @Override
    public void onClick(View view) {

        int tempID = view.getId();
        switch (tempID) {
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
                isAlreadyEntered = false;
                //для отладки
                tempTextView1.setText("tempID _other_ :" + tempID);
                tempTextView2.setText(view.toString());
                break;

            // "." buttonPoint id = 12
            case 12:
                if (!textView.getText().toString().contains(".")) {
                    textView.setText(addNumber((String) textView.getText(), view));

                    //для отладки
                    tempTextView1.setText("tempID _other_ :" + tempID);
                    tempTextView2.setText(view.toString());
                }
                break;

            // "C" buttonClear id = 11
            case 11:
                textView.setText("0");
                isAlreadyEntered = false;
                //для отладки
                tempTextView1.setText("tempID _0_ : " + tempID);
                tempTextView2.setText(view.toString());
                break;

            // "+" buttonPlus      id = 13
            case 13:

                textView2.setText("+");
                buffer1 = Double.parseDouble((String) textView.getText());
                textView.setText("0");
                isAlreadyEntered = true;

                break;

//            buttonMinus     id = 14
//            buttonMultiply  id = 15
//            buttonDivide    id = 16

            // "=" buttonEquals    id = 17
            case 17:
                buffer2 = Double.parseDouble((String) textView.getText());
                textView.setText(calculate());
                buffer1 = 0;
                buffer2 = 0;
                textView2.setText("...");
                isAlreadyEntered = false;
                isCalculated = true;
        }

        // временный вывод в tempTextView количества знаков в textView
        tempTextView3.setText(textView.length() + " ");

    }

    public String calculate() {
        Double result;
        switch ((String) textView2.getText()){
            case "+":
                result = buffer1 + buffer2;
                return Double.toString( result);
        }


        return "";
    }
}

// TODO: 25.01.2024 после добавления болевых переменных вводиться только одна цифра