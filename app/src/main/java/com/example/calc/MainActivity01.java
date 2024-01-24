//package com.example.calc;
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.util.TypedValue;
//import android.view.View;
//import android.widget.Button;
//import android.widget.GridLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MainActivity01 extends AppCompatActivity implements View.OnClickListener {
//
//    // ! ! ! ! !
//    // GridLayout
//    // ! ! ! ! !
//
//    private Button button1;
//    private Button button2;
//    private Button button3;
//    private Button button4;
//    private Button button5;
//    private Button button6;
//    private Button button7;
//    private Button button8;
//    private Button button9;
//    private Button button0;
//
//    private Button buttonClear;
//
//    private TextView textView;
//
//    // дополнительные TextView для отладочной информации
//    private TextView tempTextView1;
//    private TextView tempTextView2;
//
//    private List<Button> buttonList = new ArrayList<>(8);
//
//    @SuppressLint("ResourceType")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
////        // для использования разметки из activity_main.xml
////        // ! ! ! ! ! ! ! ! ! !
////        setContentView(R.layout.activity_main);
////        // ! ! ! ! ! ! ! ! ! !
//
//
//        // програмное создание GridLayout
//        GridLayout gridLayout = new GridLayout(this);
//
//        // установка количество строк
//        gridLayout.setRowCount(8);
//        // установка количество столбцов
//        gridLayout.setColumnCount(3);
////
////        for (int i = 1; i <= 9; i++) {
////            Button button = new Button(this);
////            button.setText(String.valueOf(i));
////            gridLayout.addView(button);
////        }
//
////        // мои пробы с МЕТАНИТ
////
////        Button button1 = new Button(this);
////        button1.setText("Press 1");
////        gridLayout.addView(button1);
////
////        Button button2 = new Button(this);
////        button2.setText("Press 2");
////        gridLayout.addView(button2);
////
////        Button button3 = new Button(this);
////        button3.setText("Press 3");
////        gridLayout.addView(button3);
////
////        Button button4 = new Button(this);
////        button4.setText("Press 4");
////
////        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
////
////        layoutParams.columnSpec = GridLayout.spec(0, 2);
////        layoutParams.rowSpec = GridLayout.spec(2, 1, GridLayout.CENTER);
////
////        layoutParams.width = GridLayout.LayoutParams.MATCH_PARENT;
////        layoutParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
////
////
////
////        gridLayout.addView(button4, layoutParams);
//
//
////        Button button1 = new Button(this);
//
//        textView = new TextView(this);
//        textView.setText("0");
//        textView.setTextSize(75);
//        GridLayout.LayoutParams layoutParamsTextView = new GridLayout.LayoutParams();
//        layoutParamsTextView.columnSpec = GridLayout.spec(0, 3);
//        layoutParamsTextView.rowSpec = GridLayout.spec(0);
//        gridLayout.addView(textView, layoutParamsTextView);
//
//
////        buttonClear = new Button(this);
////        buttonClear.setText("C");
////        buttonClear.setId(11);
////        buttonClear.setOnClickListener(this);
//
//        buttonClear = createButton(new Button(this), 11, "C");
//
//        GridLayout.LayoutParams layoutParamsButtonClear = new GridLayout.LayoutParams();
//        layoutParamsButtonClear.columnSpec = GridLayout.spec(0);
//        layoutParamsButtonClear.rowSpec = GridLayout.spec(1);
//        gridLayout.addView(buttonClear, layoutParamsButtonClear);
//
//        button1 = createButton(new Button(this), 1, "1");
//
//        GridLayout.LayoutParams layoutParams1 = new GridLayout.LayoutParams();
//        layoutParams1.columnSpec = GridLayout.spec(0, 1);
////        layoutParams1.rowSpec = GridLayout.spec(1);
//        layoutParams1.width = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 90, getResources().getDisplayMetrics()
//        );
//        gridLayout.addView(button1, layoutParams1);
//
//        button2 = createButton(new Button(this), 2, "2");
//        gridLayout.addView(button2);
//
//        button3 = createButton(new Button(this), 3, "3");
//        gridLayout.addView(button3);
//
//        button4 = createButton(new Button(this), 4, "4");
//        gridLayout.addView(button4);
//
//        button5 = createButton(new Button(this), 5, "5");
//        gridLayout.addView(button5);
//
//        button6 = createButton(new Button(this), 6, "6");
//        gridLayout.addView(button6);
//
//        button7 = createButton(new Button(this), 7, "7");
//        gridLayout.addView(button7);
//
//        button8 = createButton(new Button(this), 8, "8");
//        gridLayout.addView(button8);
//
//        button9 = createButton(new Button(this), 9, "9");
//        gridLayout.addView(button9);
//
////        int i = 2;
////        for (Button button : buttonList) {
////            button = createButton(button, i);
//////            button.setOnClickListener(this);
////            gridLayout.addView(button);
////            i++;
////        }
//
//
////        for (int i = 0; i < 9; i++) {
////            createButton(buttonList.get(i), i + 1);
////            buttonList.get(i).setOnClickListener(this);
////            gridLayout.addView(buttonList.get(i));
////        }
//
//
////        button2 = new Button(this);
////        button2.setText("2");
////        button2.setId(new Integer(2));
////        button2.setOnClickListener(this);
////        gridLayout.addView(button2);
////
////        button3 = new Button(this);
////        button3.setText("3");
////        button3.setId(new Integer(3));
////        button3.setOnClickListener(this);
////        gridLayout.addView(button3);
//
//
////        button4 = new Button(this);
////        button4.setText("4");
////        button4.setId(new Integer(4));
////        button4.setOnClickListener(this);
//
//
////        GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams();
////        layoutParams4.columnSpec = GridLayout.spec(0, 3);
////        layoutParams4.width = (int) TypedValue.applyDimension(
////                TypedValue.COMPLEX_UNIT_DIP, 270, getResources().getDisplayMetrics()
////        );
////        gridLayout.addView(button4, layoutParams4);
////        gridLayout.addView(button4);
//
////        button5 = new Button(this);
////        button5.setText("5");
////        button5.setId(new Integer(5));
////        button5.setOnClickListener(this);
////
////        GridLayout.LayoutParams layoutParams5 = new GridLayout.LayoutParams();
////        layoutParams5.columnSpec = GridLayout.spec(1, 1);
////        layoutParams5.width = (int) TypedValue.applyDimension(
////                TypedValue.COMPLEX_UNIT_DIP, 90, getResources().getDisplayMetrics()
////        );
////        gridLayout.addView(button5, layoutParams5);
//
//
////        button6 = new Button(this);
////        button6.setText("6");
////        button6.setId(new Integer(6));
////        button6.setOnClickListener(this);
////        gridLayout.addView(button6);
////
////        button7 = new Button(this);
////        button7.setText("7");
////        button7.setId(new Integer(7));
////        button7.setOnClickListener(this);
////        gridLayout.addView(button7);
////
////
////        button8 = new Button(this);
////        button8.setText("8");
////        button8.setId(new Integer(8));
////        button8.setOnClickListener(this);
////
////        GridLayout.LayoutParams layoutParams8 = new GridLayout.LayoutParams();
////        layoutParams8.columnSpec = GridLayout.spec(1, 1);
////        layoutParams8.width = (int) TypedValue.applyDimension(
////                TypedValue.COMPLEX_UNIT_DIP, 90, getResources().getDisplayMetrics()
////        );
////        gridLayout.addView(button8, layoutParams8);
////
//////        gridLayout.addView(button8);
////
////        button9 = new Button(this);
////        button9.setText("9");
////        button9.setId(new Integer(9));
////        button9.setOnClickListener(this);
////        gridLayout.addView(button9);
//
//        button0 = createButton(new Button(this), 0, "0");
//
//
//        GridLayout.LayoutParams layoutParams0 = new GridLayout.LayoutParams();
//        layoutParams0.columnSpec = GridLayout.spec(0, 3);
//        layoutParams0.width = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 270, getResources().getDisplayMetrics()
//        );
//        gridLayout.addView(button0, layoutParams0);
//
//
//        // дополнительные TextView для отладочной информации
//        tempTextView1 = new TextView(this);
//        tempTextView1.setText("инфа про нажатие: ");
//        tempTextView1.setTextSize(15);
//        GridLayout.LayoutParams tempLayoutParamsTextView1 = new GridLayout.LayoutParams();
//        tempLayoutParamsTextView1.columnSpec = GridLayout.spec(0, 3);
//        tempLayoutParamsTextView1.rowSpec = GridLayout.spec(6);
//        gridLayout.addView(tempTextView1, tempLayoutParamsTextView1);
//
//        tempTextView2 = new TextView(this);
//        tempTextView2.setText("инфа про view: ");
//        tempTextView1.setTextSize(15);
//        GridLayout.LayoutParams tempLayoutParamsTextView2 = new GridLayout.LayoutParams();
//        tempLayoutParamsTextView2.columnSpec = GridLayout.spec(0, 3);
//        tempLayoutParamsTextView2.rowSpec = GridLayout.spec(7);
//        gridLayout.addView(tempTextView2, tempLayoutParamsTextView2);
//
//        setContentView(gridLayout);
//    }
//
//    public Button createButton(Button button, Integer buttonID, String buttonText) {
//        button.setText(buttonText);
//        button.setId(buttonID);
//        button.setOnClickListener(this);
//        return button;
//    }
//
//    public String addNumber(String oldString, View view) {
////        String result;
//        switch (oldString) {
//            case "0":
//                textView.setText("");
//                return Integer.toString(view.getId());
//            default:
//                textView.setText("");
//                return oldString + (view.getId());
//        }
////        String result = oldString + Integer.toString(view.getId());
////        return result;
//    }
//
//
//    @Override
//    public void onClick(View view) {
////        Button tempButton = (Button) view;
//        int tempID = view.getId();
//        switch (tempID) {
//            case 11:
//                textView.setText("0");
//                //для отладки
//                tempTextView1.setText("tempID _0_ : " + tempID);
//                tempTextView2.setText(view.toString());
////            case 1:
////                textView.setText(addNumber((String) textView.getText(), view));
////                //для отладки
////                tempTextView1.setText("view.getId() _1_ : " + view.getId());
////                tempTextView2.setText(view.toString());
//            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 0:
//                textView.setText(addNumber((String) textView.getText(), view));
//                //для отладки
//                tempTextView1.setText("tempID _other_ :" + tempID);
//                tempTextView2.setText(view.toString());
//
////            case 1:
//////                textView.setText(button1.getText());
//////                textView.setText(Integer.toString(view.getId()));
////                textView.setText(addNumber((String) textView.getText(), view));
////                break;
////            case 2:
//////                textView.setText(button2.getText());
////                textView.setText(Integer.toString(view.getId()));
////                break;
////            case 3:
//////                textView.setText(button3.getText());
////                textView.setText(Integer.toString(view.getId()));
////                break;
////            case 4:
//////                textView.setText(button4.getText());
////                textView.setText(Integer.toString(view.getId()));
////                break;
////            case 5:
//////                textView.setText(button5.getText());
////                textView.setText(Integer.toString(view.getId()));
////                break;
////            case 6:
//////                textView.setText(button6.getText());
////                textView.setText(Integer.toString(view.getId()));
////                break;
////            case 7:
//////                textView.setText(button7.getText());
////                textView.setText(Integer.toString(view.getId()));
////                break;
////            case 8:
//////                textView.setText(button8.getText());
////                textView.setText(Integer.toString(view.getId()));
////                break;
////            case 9:
//////                textView.setText(button9.getText());
////                textView.setText(Integer.toString(view.getId()));
////                break;
////            case 0:
//////                textView.setText(button0.getText());
////                textView.setText(Integer.toString(view.getId()));
////                break;
////            // кнопка "С"
////            case 11:
////                textView.setText("0");
////            default:
////                break;
//        }
//    }
//
//
//}