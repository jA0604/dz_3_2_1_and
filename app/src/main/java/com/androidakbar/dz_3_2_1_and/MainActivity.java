package com.androidakbar.dz_3_2_1_and;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Toolbar appToolbar;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnDot;

    private Button btnC;
    private Button btnSign;
    private Button btnPercent;
    private Button btnDiv;
    private Button btnMul;
    private Button btnSub;
    private Button btnSum;
    private Button btnResult;

    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        appToolbar = findViewById(R.id.app_toolbar);
        appToolbar.setTitle(R.string.name_dz);
        appToolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimaryText));
        btn0 = findViewById(R.id.btn_0);
        btn0.setText(R.string.str_btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn1.setText(R.string.str_btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn2.setText(R.string.str_btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn3.setText(R.string.str_btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn4.setText(R.string.str_btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn5.setText(R.string.str_btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn6.setText(R.string.str_btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn7.setText(R.string.str_btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn8.setText(R.string.str_btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn9.setText(R.string.str_btn_9);
        btnDot = findViewById(R.id.btn_dot);
        btnDot.setText(R.string.str_btn_dot);

        btnC = findViewById(R.id.btn_c);
        btnC.setText(R.string.str_btn_c);
        btnC.setBackgroundResource(R.color.colorSecondaryDark);
        btnSign = findViewById(R.id.btn_sign);
        btnSign.setText(R.string.str_btn_sign);
        btnSign.setBackgroundResource(R.color.colorSecondaryDark);
        btnPercent = findViewById(R.id.btn_percent);
        btnPercent.setText(R.string.str_btn_percent);
        btnPercent.setBackgroundResource(R.color.colorSecondaryDark);

        btnDiv = findViewById(R.id.btn_div);
        btnDiv.setText(R.string.str_btn_div);
        btnDiv.setBackgroundResource(R.color.colorSecondaryDark);

        btnMul = findViewById(R.id.btn_mul);
        btnMul.setText(R.string.str_btn_mul);
        btnMul.setBackgroundResource(R.color.colorSecondaryDark);

        btnSub = findViewById(R.id.btn_sub);
        btnSub.setText(R.string.str_btn_sub);
        btnSub.setBackgroundResource(R.color.colorSecondaryDark);

        btnSum = findViewById(R.id.btn_sum);
        btnSum.setText(R.string.str_btn_sum);
        btnSum.setBackgroundResource(R.color.colorSecondaryDark);

        btnResult = findViewById(R.id.btn_result);
        btnResult.setText(R.string.str_btn_result);
        btnResult.setBackgroundResource(R.color.colorSecondaryDark);

        txtResult = findViewById(R.id.txt_result);

    }
    public void clickBtn(View view) {
        Button btn = (Button) view;
        txtResult.setText(btn.getText().toString());
    }

}