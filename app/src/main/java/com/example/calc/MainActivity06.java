//package com.example.viewapp;
//
//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.LinearLayout;
//import android.widget.TableLayout;
//import android.widget.TableRow;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity06 extends AppCompatActivity {
//
//    // ! ! ! ! !
//    // TableLayout
//    // ! ! ! ! !
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
////        // для использования разметки из activity_main.xml
////        // ! ! ! ! ! ! ! ! ! !
////        setContentView(R.layout.activity_main);
////        // ! ! ! ! ! ! ! ! ! !
//
//        // програмное создание TableLayout
//        TableLayout tableLayout = new TableLayout(this);
//
//        // создание первой строки
//        TableRow tableRow1 = new TableRow(this);
//
//        // наполнение первой строки
//        TextView textView1 = new TextView(this);
//        textView1.setText("Логин");
//        tableRow1.addView(textView1, new TableRow.LayoutParams(
//                TableRow.LayoutParams.WRAP_CONTENT,
//                TableRow.LayoutParams.WRAP_CONTENT,
//                0.5f
//        ));
//
//        EditText editText1 = new EditText(this);
//        tableRow1.addView(editText1, new TableRow.LayoutParams(
//                TableRow.LayoutParams.WRAP_CONTENT,
//                TableRow.LayoutParams.WRAP_CONTENT,
//                1.0f
//        ));
//
//        // создание второй строки
//        TableRow tableRow2 = new TableRow(this);
//
//        TextView textView2 = new TextView(this);
//        textView2.setText("Email");
//        tableRow2.addView(textView2, new TableRow.LayoutParams(
//                TableRow.LayoutParams.WRAP_CONTENT,
//                TableRow.LayoutParams.WRAP_CONTENT,
//                0.5f
//        ));
//
//        EditText editText2 = new EditText(this);
//        tableRow2.addView(editText2, new TableRow.LayoutParams(
//                TableRow.LayoutParams.WRAP_CONTENT,
//                TableRow.LayoutParams.WRAP_CONTENT,
//                1.0f
//        ));
//
//        TableRow tableRow3 = new TableRow(this);
//        Button button = new Button(this);
//        button.setText("Отправить");
//        tableRow3.addView(button, new TableRow.LayoutParams(
//                LinearLayout.LayoutParams.WRAP_CONTENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT,
//                1
//        ));
//
//        tableLayout.addView(tableRow1);
//        tableLayout.addView(tableRow2);
//        tableLayout.addView(tableRow3);
//
//        setContentView(tableLayout);
//
//
//    }
//}