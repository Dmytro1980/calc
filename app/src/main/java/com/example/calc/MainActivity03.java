//package com.example.viewapp;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.constraintlayout.widget.ConstraintLayout;
//
//public class MainActivity03 extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//
//        // поле для ввода почты
//        EditText editText= new EditText(this);
//        editText.setHint("Ведите e-mail");
//        editText.setId(View.generateViewId());
//
//        // кнопка "Отправить"
//        Button button = new Button(this);
//        button.setText("Отправить");
//        button.setId(View.generateViewId());
//
//        // настройка расположения поля ввода
//        ConstraintLayout.LayoutParams editTextLayout = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//        // расположение поля ввода внутри ConstraintLayout
//        editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        editTextLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        editTextLayout.rightToLeft = button.getId();
//        // применение настроек расположения к полю ввода
//        editText.setLayoutParams(editTextLayout);
//        // добавление поля ввода в constraintLayout
//        constraintLayout.addView(editText);
//
//        // настройка расположения кнопки
//        ConstraintLayout.LayoutParams buttonLayout = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//        // расположение кнопки внутри ConstraintLayout
//        buttonLayout.leftToRight = editText.getId();
//        buttonLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        // применение настроек расположения к кнопке
//        button.setLayoutParams(buttonLayout);
//        // добавление кнопки ввода в constraintLayout
//        constraintLayout.addView(button);
//
//        setContentView(constraintLayout);
//    }
//}