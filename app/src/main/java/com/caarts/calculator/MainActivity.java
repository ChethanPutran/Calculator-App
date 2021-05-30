package com.caarts.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.DrawableCompat;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {
    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix;
    private Button btnSeven, btnEight, btnNine, btnTen, btnAdd, btnSub;
    private Button btnMul, btnDiv, btnBrac, btnPercent, btnClr, btnEqual, btnDot;
    private ImageView btnUndo;
    private TextView inputText, resultText;
    private String presentText = "";
    private String result = "";
    private Boolean checkBracket = false;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnZero = findViewById(R.id.button0);
        btnOne = findViewById(R.id.button1);
        btnTwo = findViewById(R.id.button2);
        btnThree = findViewById(R.id.button3);
        btnFour = findViewById(R.id.button4);
        btnFive = findViewById(R.id.button5);
        btnSix = findViewById(R.id.button6);
        btnSeven = findViewById(R.id.button7);
        btnEight = findViewById(R.id.button8);
        btnNine = findViewById(R.id.button9);
        btnAdd = findViewById(R.id.buttonAdd);
        btnSub = findViewById(R.id.buttonSub);
        btnMul = findViewById(R.id.buttonMul);
        btnDiv = findViewById(R.id.buttonDiv);
        btnDot = findViewById(R.id.buttonDot);
        btnBrac = findViewById(R.id.buttonBrac);
        btnUndo = findViewById(R.id.buttonUndo);
        btnEqual = findViewById(R.id.buttonEql);
        btnClr = findViewById(R.id.buttonClear);
        btnPercent = findViewById(R.id.buttonPercent);
        resultText = findViewById(R.id.query);
        inputText = findViewById(R.id.result);

        btnZero.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnZero.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnZero.setTextColor(Color.rgb(255,255,255));
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnZero.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnZero.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnOne.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnOne.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnOne.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "1");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnOne.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnOne.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnTwo.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnTwo.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnTwo.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "2");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnTwo.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnTwo.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnThree.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnThree.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnThree.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "3");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnThree.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnThree.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnFour.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnFour.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnFour.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "4");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnFour.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnFour.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnFive.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnFive.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnFive.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "5");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnFive.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnFive.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnSix.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnSix.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnSix.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "6");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnSix.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnSix.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnSeven.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnSeven.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnSeven.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "7");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnSeven.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnSeven.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnEight.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnEight.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnEight.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "8");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnEight.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnEight.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnNine.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnNine.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnNine.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "9");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnNine.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnNine.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnAdd.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnAdd.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnAdd.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "+");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnAdd.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnAdd.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnSub.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnSub.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnSub.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "-");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnSub.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnSub.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnDiv.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnDiv.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnDiv.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "÷");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnDiv.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnDiv.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnMul.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnMul.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnMul.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "×");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnMul.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnMul.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnDot.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnDot.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnDot.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + ".");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnDot.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnDot.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });

        btnBrac.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnBrac.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnBrac.setTextColor(Color.rgb(255,255,255));

                        presentText = inputText.getText().toString();

                        if(checkBracket){
                            inputText.setText(presentText+")");
                            checkBracket = false;
                        }else {
                            inputText.setText(presentText+"(");
                            checkBracket = true;
                        }

                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnBrac.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnBrac.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnPercent.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnPercent.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnPercent.setTextColor(Color.rgb(255,255,255));
                        presentText = inputText.getText().toString();
                        inputText.setText(presentText + "%");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnPercent.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnPercent.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });
        btnUndo.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        btnUndo.setImageResource(R.drawable.back_space_after_click);
                        Drawable buttonDrawable = btnUndo.getBackground();
                        buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                        //the color is a direct color int and not a color resource
                        DrawableCompat.setTint(buttonDrawable, Color.rgb(255,117,26));
                        btnUndo.setBackground(buttonDrawable);
                        if(!presentText.equals("")){
                            presentText = inputText.getText().toString();
                            if(presentText.length()>0){
                                presentText = presentText.substring(0,presentText.length()-1);
                                inputText.setText(presentText);
                            }
                        }
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnUndo.setImageResource(R.drawable.back_space_before_click);
                        Drawable buttonDrawable = btnUndo.getBackground();
                        buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                        //the color is a direct color int and not a color resource
                        DrawableCompat.setTint(buttonDrawable, Color.rgb(255,255,255));
                        btnUndo.setBackground(buttonDrawable);
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });

        btnClr.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnClr.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnClr.setTextColor(Color.rgb(255,255,255));
                        inputText.setText("");
                        resultText.setText("");
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnClr.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnClr.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });

        btnEqual.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        btnEqual.setBackgroundColor(Color.rgb(255, 117, 26));
                        btnEqual.setTextColor(Color.rgb(255,255,255));

                        presentText = inputText.getText().toString();
                        presentText = presentText.replaceAll("×","*");
                        presentText = presentText.replaceAll("÷","/");
                        presentText = presentText.replaceAll("%","/100");

                        org.mozilla.javascript.Context rhino = org.mozilla.javascript.Context.enter();
                        rhino.setOptimizationLevel(-1);

                        try{
                            Scriptable scriptable = rhino.initStandardObjects();
                            result = rhino.evaluateString(scriptable,presentText,"javascript",1,null).toString();

                        }catch (Exception exception){
                            result = "Error";
                        }
                        resultText.setText(result);
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        btnEqual.setBackgroundColor(Color.rgb(255, 255, 255));
                        btnEqual.setTextColor(Color.rgb(255,117,26));
                        break;
                    // Your action here on button click

                }
                return true;
            }
        });


    }

}



