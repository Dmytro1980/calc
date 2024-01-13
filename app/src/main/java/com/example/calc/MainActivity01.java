//package com.example.viewapp;
//
//import android.os.Bundle;
//import android.util.TypedValue;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.constraintlayout.widget.ConstraintLayout;
//
//public class MainActivity01 extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        #1
////        // создание TextView
////        TextView textView = new TextView(this);
////
////        // запись текста в создание TextView
////        textView.setText("Text in TextView");
////
////        // установка высоты текста
////        textView.setTextSize(22);
////
//////        setContentView(R.layout.activity_main);
////        setContentView(textView);
//
////        #2
////        ConstraintLayout constraintLayout = new ConstraintLayout(this);
////        TextView textView = new TextView(this);
////        textView.setText(R.string.text);
////        textView.setTextSize(26);
////
////        // параметры размеров и расположение элемента
////        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
////                ConstraintLayout.LayoutParams.WRAP_CONTENT,
////                ConstraintLayout.LayoutParams.WRAP_CONTENT);
////
////        // выравнивание по левому краю ConstraintLayout
////        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
////
////        // выравнивание по верхней границе ConstraintLayout
////        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
////
////        // параметры для TextView
////        textView.setLayoutParams(layoutParams);
////
////        // добавление TextView в ConstraintLayout  в качестве корневого
////        constraintLayout.addView(textView);
////        setContentView(constraintLayout);
//
////        #3
////        // загрузка  интерфейса из файла second_layout.xml
////        setContentView(R.layout.second_layout);
////
////        TextView textView = findViewById(R.id.header);
////
////        textView.setText("Новый текст");
//
////        №4
//// загрузка  интерфейса из файла second_layout.xml
////        setContentView(R.layout.second_layout);
//
////        #5
//// загрузка  интерфейса из файла activity_main.xml
//
//////        #6
////// програмная установка ширины и высоты
////        ConstraintLayout constraintLayout = new ConstraintLayout(this);
////        TextView textView = new TextView(this);
////        textView.setText("Проба №12 отступы везде");
////        textView.setTextSize(10);
////
////        // установка параметров размеров и расположения элемента
////        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
////                ConstraintLayout.LayoutParams.WRAP_CONTENT,
////                400
////        );
////
////
////        // аналоги app:layout_constraintLeft_toLeftOf и app:layout_constraintTop_toTopOf
////        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
////        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
////
////        // установка параметров для TextView
////        textView.setLayoutParams(layoutParams);
////
////        // добавление TextView в ConstraintLayout
////        constraintLayout.addView(textView);
////
//////        setContentView(constraintLayout);
////        // несмотря на весь код здесь, берём разметку из activity_main.xml
////        setContentView(R.layout.activity_main);
//
////        #7
//// програмная установка отступов
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//
//        TextView textView = new TextView(this);
//        textView.setText("Проба №16 отступы програмно");
//        textView.setTextSize(10);
//        textView.setBackgroundColor(0xFFE0E0E0);
//
//
//        // получение отступа в пикселях для 50dp
//        int margin50 = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP,
//                50,
//                getResources().getDisplayMetrics()
//        );
//
//        // получение отступа в пикселях для 60dp
//        int margin60 = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP,
//                60,
//                getResources().getDisplayMetrics()
//        );
//
//        // получение отступа в пикселях для 40dp
//        int padding40 = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP,
//                40,
//                getResources().getDisplayMetrics()
//        );
//
//        // установка параметров размеров и расположения элемента
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//
//        // установка внешних отступов
//        layoutParams.setMargins(margin60, margin50, margin60, margin50);
//
//        //позиционирование
//        // в левом верхнем углу контейнера
//        // аналоги app:layout_constraintLeft_toLeftOf и app:layout_constraintTop_toTopOf
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//
////        // установка размеров
////        textView.setLayoutParams(layoutParams);
//
//        // установка внутренних отступов
//        textView.setPadding(padding40, padding40, padding40, padding40);
//
//        // установка параметров для TextView
//        textView.setLayoutParams(layoutParams);
//
//        // добавление TextView в ConstraintLayout
//        constraintLayout.addView(textView);
//
//        setContentView(constraintLayout);
////        // несмотря на весь код здесь, берём разметку из activity_main.xml
////        setContentView(R.layout.activity_main);
//
//
//    }
//}