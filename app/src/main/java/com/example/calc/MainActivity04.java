//package com.example.viewapp;
//
//import android.os.Bundle;
//import android.view.Gravity;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity04 extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
////        // создание LinearLayout програмно
////        LinearLayout linearLayout = new LinearLayout(this);
////        // установка ориентации в LinearLayout
////        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
////
////        TextView textView = new TextView(this);
////        textView.setText("Hello");
////        textView.setTextSize(30);
////
////        // настройка позиционирования LinearLayout
////        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
////                ViewGroup.LayoutParams.WRAP_CONTENT,
////                ViewGroup.LayoutParams.WRAP_CONTENT
////        );
////
////        // установка отступов внутри LinearLayout
////        layoutParams.setMargins(300, 100, 0, 0);
////
////        textView.setLayoutParams(layoutParams);
////
////        linearLayout.addView(textView);
//
////        LinearLayout linearLayout = new LinearLayout(this);
////        linearLayout.setOrientation(LinearLayout.VERTICAL);
////
////        // первое текстовое поле
////        TextView textView1 = new TextView(this);
////        textView1.setText("First");
////        textView1.setBackgroundColor(0xFFBDBDBD);
////        textView1.setTextSize(30);
////        textView1.setTextColor(0xFFFFFFFF);
////        linearLayout.addView(
////                textView1,
////                new LinearLayout.LayoutParams (LinearLayout.LayoutParams.MATCH_PARENT, 0, 3)
////                // textView1 имеет вес 3
////        );
////
////        // второе текстовое поле
////        TextView textView2 = new TextView(this);
////        textView2.setText("Second");
////        textView2.setTextSize(30);
////        linearLayout.addView(
////                textView2,
////                new LinearLayout.LayoutParams (LinearLayout.LayoutParams.MATCH_PARENT, 0, 2)
////                // textView2 имеет вес 3
////        );
////
//
//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.WRAP_CONTENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT
//        );
//
//        layoutParams.gravity = Gravity.CENTER;
//
//        TextView textView1 = new TextView(this);
//        textView1.setText("First");
//        textView1.setTextSize(30);
//
//        linearLayout.addView(textView1, layoutParams);
//
//
//        setContentView(linearLayout);
//
////        // для использования разметки из activity_main.xml
////        setContentView(R.layout.activity_main);
//
//    }
//}