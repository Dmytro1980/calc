//package com.example.viewapp;
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.view.MotionEvent;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity05 extends AppCompatActivity {
//
//    // ! ! ! ! !
//
//    // RelativeLayout
//
//    // ! ! ! ! !
//
//    private Button mainButton;
//    private Button sendButton;
//    private TextView textView;
//
//    private EditText editText;
//
//    @SuppressLint("MissingInflatedId")
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
//
////        // ещё одно создание LinearLayout програмно
////        // https://metanit.com/java/android/3.3.php
////        LinearLayout linearLayout = new LinearLayout(this);
////        linearLayout.setOrientation(LinearLayout.VERTICAL);
////        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
////                LinearLayout.LayoutParams.WRAP_CONTENT,
////                LinearLayout.LayoutParams.WRAP_CONTENT
////        );
////
////        layoutParams.gravity = Gravity.CENTER;
////
////        TextView textView1 = new TextView(this);
////        textView1.setText("First");
////        textView1.setTextSize(30);
////
////        linearLayout.addView(textView1, layoutParams);
////
////
////        setContentView(linearLayout);
//
//
//
//        // для использования разметки из activity_main.xml
//        // ! ! ! ! ! ! ! ! ! !
//        // ! ! ! ! ! ! ! ! ! !
////        setContentView(R.layout.activity_main);
//
////        mainButton = findViewById(R.id.main_button);
////        sendButton = findViewById(R.id.send_button);
////        textView = findViewById(R.id.textViewHello);
////        editText = findViewById(R.id.edit_message);
//
//
//        // ! ! ! ! ! ! ! ! ! !
//        // ! ! ! ! ! ! ! ! ! !
//        // разметка задаётся програмно
//
//        RelativeLayout relativeLayout = new RelativeLayout(this);
//
//        textView = new TextView(this);
//        // генерация id, в данном случае id textView
//        textView.setId(TextView.generateViewId());
//        textView.setText(R.string.textHelloEuheniy);
//
//        mainButton = new Button(this);
//        mainButton.setId(Button.generateViewId());
//        mainButton.setText(R.string.buttonTextHelloEuheniy);
//
//        editText = new EditText(this);
//        editText.setId(EditText.generateViewId());
//        editText.setHint(R.string.hint);
//
//        sendButton = new Button(this);
//        sendButton.setId(Button.generateViewId());
//        sendButton.setText(R.string.buttonTextSend);
//
//
//        // начальная настройка видимости элементов
//        mainButton.setVisibility(View.VISIBLE);
//        textView.setVisibility(View.INVISIBLE);
//        editText.setVisibility(View.INVISIBLE);
//        sendButton.setVisibility(View.INVISIBLE);
//
//        // настройка расположения элементов
//        // 1.
//        // положение для mainButton
//        RelativeLayout.LayoutParams mainButtonParams = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//        // выравнивание mainButton по центру родительского контейнера
//        mainButtonParams.addRule(RelativeLayout.CENTER_IN_PARENT);
//        // добавляем mainButton в RelativeLayout (в родительский контейнер)
//        relativeLayout.addView(mainButton, mainButtonParams);
//
//        // 2.
//        // положение для textView
//        RelativeLayout.LayoutParams textViewParams = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//        // выравнивание textView по центру родительского контейнера
//        textViewParams.addRule(RelativeLayout.CENTER_IN_PARENT);
//        // добавляем textView в RelativeLayout (в родительский контейнер)
//        relativeLayout.addView(textView, textViewParams);
//
//        // 3.
//        // положение для editText
//        RelativeLayout.LayoutParams editTextParams = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.MATCH_PARENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//        // выравнивание editText ниже кнопки mainButton
//        editTextParams.addRule(RelativeLayout.BELOW, mainButton.getId());
//        // добавляем EditText в RelativeLayout (в родительский контейнер)
//        relativeLayout.addView(editText, editTextParams);
//
//        // 4.
//        // положение для sendButton
//        RelativeLayout.LayoutParams sendButtonParams = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//        // выравнивание sendButton ниже поля для ввода editText
//        sendButtonParams.addRule(RelativeLayout.BELOW, editText.getId());
//        // добавляем sendButton в RelativeLayout (в родительский контейнер)
//        relativeLayout.addView(sendButton, sendButtonParams);
//
//
//        setContentView(relativeLayout);
//
//
//
//        // обработчик нажатия mainButton
//        mainButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mainButton.setVisibility(View.INVISIBLE);
//                textView.setVisibility(View.VISIBLE);
//                editText.setVisibility(View.VISIBLE);
//            }
//        });
//
//        // обработчик прикосновения к editText
//        editText.setOnTouchListener(new View.OnTouchListener() {
//            @SuppressLint("ClickableViewAccessibility")
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                textView.setVisibility(View.INVISIBLE);
//                sendButton.setVisibility(View.VISIBLE);
//                return false;
//            }
//        });
//
//        // обработчик нажатия sendButton
//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                sendButton.setVisibility(View.INVISIBLE);
//                editText.setVisibility(View.INVISIBLE);
//
//                textView.setText(R.string.sending_result);
//                textView.setVisibility(View.VISIBLE);
//            }
//        });
//    }
//}