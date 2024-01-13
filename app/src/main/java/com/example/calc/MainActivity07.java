//package com.example.viewapp;
//
//import android.os.Bundle;
//import android.view.Gravity;
//import android.view.ViewGroup;
//import android.widget.FrameLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity07 extends AppCompatActivity {
//
//    // ! ! ! ! !
//    // FrameLayout
//    // ! ! ! ! !
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
//        // програмное создание FrameLayout
//        FrameLayout frameLayout = new FrameLayout(this);
//
//        TextView textView1 = new TextView(this);
//        textView1.setText("String #1");
//        textView1.setTextSize(26);
//
//        TextView textView2 = new TextView(this);
//        textView2.setText("String #2");
//        textView2.setTextSize(30);
//
//        FrameLayout.LayoutParams layoutParams1 = new FrameLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
//        );
//
//        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
//        );
//
//        layoutParams1.gravity = Gravity.CENTER_HORIZONTAL | Gravity.TOP;
//
//        layoutParams2.gravity = Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM;
//
//        textView1.setLayoutParams(layoutParams1);
//
//        textView2.setLayoutParams(layoutParams2);
//
//        frameLayout.addView(textView1);
//
//        frameLayout.addView(textView2);
//
//        setContentView(frameLayout);
//
//    }
//}