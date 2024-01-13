//package com.example.viewapp;
//
//import android.os.Bundle;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.constraintlayout.widget.ConstraintLayout;
//
//public class MainActivity02 extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//
//        // созлаем TextView
//        TextView textView = new TextView(this);
//        textView.setText("Текст");
//        textView.setTextSize(30);
//
//        // настройка позицонирования внутри ConstraintLayout
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//
//        // установка размеров
//        textView.setLayoutParams(layoutParams);
//
//        // добавляем TextView в ConstraintLayout
//        constraintLayout.addView(textView);
//
//        // для использования разметки созданой кодом
//        setContentView(constraintLayout);
//
////        // для использования разметки из activity_main.xml
////        setContentView(R.layout.activity_main);
//
//    }
//}