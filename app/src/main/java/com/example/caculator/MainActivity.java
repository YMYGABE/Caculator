package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;
    public String textContent_2 = "";
    public String textContent_1 = "";
    public String textContent_3 = "";
    boolean havePoint = false; //这个必须放在外面作为全局变量，若是在点击事件里，则每次点击都会重置为false，就没用了。
    boolean isSum = false; //设置加减乘除的状态，默认都为false，每次都只能允许一种操作
    boolean isSub = false;
    boolean isMul = false;
    boolean isDiv = false;
    boolean result = false;
    boolean updata = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button_clear = (Button)findViewById(R.id.bt_AC);
        Button button_evolution = (Button)findViewById(R.id.bt_evolution);
        Button button_Cos = (Button)findViewById(R.id.bt_sign);
        Button button_division= (Button)findViewById(R.id.bt_division);
        Button button_7 = (Button)findViewById(R.id.bt_7);
        Button button_8 = (Button)findViewById(R.id.bt_8);
        Button button_9 = (Button)findViewById(R.id.bt_9);
        Button button_mul = (Button)findViewById(R.id.bt_mul);
        Button button_4 = (Button)findViewById(R.id.bt_4);
        Button button_5 = (Button)findViewById(R.id.bt_5);
        Button button_6 = (Button)findViewById(R.id.bt_6);
        Button button_sub = (Button)findViewById(R.id.bt_sub);
        Button button_1 = (Button)findViewById(R.id.bt_1);
        Button button_2 = (Button)findViewById(R.id.bt_2);
        Button button_3 = (Button)findViewById(R.id.bt_3);
        Button button_sum = (Button)findViewById(R.id.bt_sum);
        Button button_0 = (Button)findViewById(R.id.bt_0);
        Button button_point = (Button)findViewById(R.id.bt_point);
        Button button_equal = (Button)findViewById(R.id.bt_equal);
        textView = (TextView)findViewById(R.id.text1);
        button_clear.setOnClickListener(this);
        button_evolution.setOnClickListener(this);
        button_Cos.setOnClickListener(this);
        button_division.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_mul.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_sum.setOnClickListener(this);
        button_0.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_equal.setOnClickListener(this);

    }

    public void UpDate(){
        isMul = false;
        isDiv = false;
        isSub = false;
        isSum = false;
    }
    @Override
    public void onClick(View v) {
        if(updata){
            textContent_1 = textView.getText().toString();
            textView.setText("");
            havePoint = false;
            updata = false;
        }
        switch(v.getId()){
            case R.id.bt_AC :
                Toast.makeText(MainActivity.this,"you have clear the Caculator",Toast.LENGTH_SHORT).show();
                textView.setText("");
                textContent_2 = "";
                textContent_1 = "";
                textContent_3 = "";
                havePoint = false;
                UpDate();
                break;
            case R.id.bt_0 :
                if(isDiv || isMul || isSub || isSum){
                    if(isDiv){
                        Toast.makeText(MainActivity.this,"input erro",Toast.LENGTH_SHORT).show();
                    }
//                    textView.setText("");
                    else {
                        textContent_2 += "0";
                        textView.setText(textContent_2);
                    }
                }
                else {
                    textContent_1 += "0";
                    textView.setText(textContent_1);
                }
                    break;

                case R.id.bt_1 :
                    if(isDiv || isMul || isSub || isSum){
                        textView.setText("");
                        textContent_2 += "1";
                        textView.setText(textContent_2);
                    }
                    else {
                        textContent_1 += "1";
                        textView.setText(textContent_1);
                    }
                break;
            case R.id.bt_2 :
                if(isDiv || isMul || isSub || isSum){
//                    textView.setText("");
                    textContent_2 += "2";
                    textView.setText(textContent_2);
                }
                else {
                    textContent_1 += "2";
                    textView.setText(textContent_1);
                }break;
            case R.id.bt_3 :
                if(isDiv || isMul || isSub || isSum){
                    textView.setText("");
                    textContent_2 += "3";
                    textView.setText(textContent_2);
                }
                else {
                    textContent_1 += "3";
                    textView.setText(textContent_1);
                }   break;
            case R.id.bt_4 :
                if(isDiv || isMul || isSub || isSum){
//                    textView.setText("");
                    textContent_2 += "4";
                    textView.setText(textContent_2);
                }
                else {
                    textContent_1 += "4";
                    textView.setText(textContent_1);
                }   break;
            case R.id.bt_5 :
                if(isDiv || isMul || isSub || isSum){
//                    textView.setText("");
                    textContent_2 += "5";
                    textView.setText(textContent_2);
                }
                else {
                    textContent_1 += "5";
                    textView.setText(textContent_1);
                }       break;
            case R.id.bt_6 :
                if(isDiv || isMul || isSub || isSum){
//                    textView.setText("");
                    textContent_2 += "6";
                    textView.setText(textContent_2);
                }
                else {
                    textContent_1 += "6";
                    textView.setText(textContent_1);
                }        break;
            case R.id.bt_7 :
                if(isDiv || isMul || isSub || isSum){
//                    textView.setText("");
                    textContent_2 += "7";
                    textView.setText(textContent_2);
                }
                else {
                    textContent_1 += "7";
                    textView.setText(textContent_1);
                }        break;
            case R.id.bt_8 :
                if(isDiv || isMul || isSub || isSum){
//                    textView.setText("");
                    textContent_2 += "8";
                    textView.setText(textContent_2);
                }else {
                    textContent_1 += "8";
                    textView.setText(textContent_1);
                }break;
            case R.id.bt_9 :
                if(isDiv || isMul || isSub || isSum){
//                    textView.setText("");
                    textContent_2 += "9";
                    textView.setText(textContent_2);
                }
                else {
                    textContent_1 += "9";
                    textView.setText(textContent_1);
                }break;
            case R.id.bt_point :
                    if (isDiv || isMul || isSub || isSum) {
                        if(textView.length() == 0 || havePoint){
                            Toast.makeText(MainActivity.this, "you can't set point", Toast.LENGTH_SHORT).show();
                        }else {
                            textContent_2 += ".";
                            textView.setText(textContent_2);
                            havePoint = true;
                            break;
                        }
                    } else {
                        if(textView.length() == 0 || havePoint){
                            Toast.makeText(MainActivity.this, "you can't set point", Toast.LENGTH_SHORT).show();
                        }else {
                            textContent_1 += ".";
                            textView.setText(textContent_1);
                            havePoint = true;
                            break;
                        }
                    }
                    break;

            case R.id.bt_sum :
                if(isSub || isSum || isDiv || isMul){
                   break;
                }
                if(textContent_2.equals("") && textContent_1.equals("")){
                    break;
                }
                else {
                    isSum = true;
                    if(isSub){
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 - num2);
                        textView.setText(textContent_1);
                        isSub = false;
                        updata = true;
                }else if(isMul){
                    float num1 = Float.parseFloat(textContent_1);
                    float num2 = Float.parseFloat(textContent_2);
                    float res = num1 * num2;
                    textView.setText(textContent_1);
                    isMul = false;
                    updata = true;
                }else if(isDiv){
                    float num1 = Float.parseFloat(textContent_1);
                    float num2 = Float.parseFloat(textContent_2);
                    float res = num1 / num2;
                    textView.setText(textContent_1);
                    isDiv = false;
                    updata = true;
                }if(!isMul && !isDiv && !isSub){
                        textContent_2 = "";
                        updata = true;
                    }
                }
                break;
            case R.id.bt_sub:
                if(isSub || isSum || isDiv || isMul){
                    break;
                }
                if(textContent_2.equals("") && textContent_1.equals("")){
                    break;
                }else {
                    isSub = true;
                    if(isSum){
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 + num2);
                        textView.setText(textContent_1);
                        isSum = false;
                     updata = true;
                    } else if (isMul) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 * num2);
                        textView.setText(textContent_1);
                        isMul = false;
                     updata = true;
                    } else if (isDiv) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 / num2);
                        textView.setText(textContent_1);
                        isDiv = false;
                     updata = true;
                    }if(!isMul && !isDiv  && !isSum){
                        textContent_2 = "";
                        updata = true;
                    }
                }
                break;
            case R.id.bt_division:
                if(isSub || isSum || isDiv || isMul){
                    break;
                }
                if(textContent_2.equals("") && textContent_1.equals("")){
                    break;
                }else {

                    isDiv = true;
                    if (isSum) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 + num2);
                        textView.setText(textContent_1);
                        isSum = false;
                        updata = true;
                    } else if (isMul) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 / num2);
                        textView.setText(textContent_1);
                        isMul = false;
                        updata = true;
                    } else if (isSub) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 - num2);
                        textView.setText(textContent_1);
                        isSub = false;
                        updata = true;
                    }if(!isMul && !isSub && !isSum){
                        textContent_2 = "";
                        updata = true;
                    }
                }
                break;
            case R.id.bt_mul:
                if(isSub || isSum || isDiv || isMul){
                    break;
                }
                if(textContent_2.equals("") && textContent_1.equals("")){
                    break;
                }else {
                    isMul = true;
                    if (isSum) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 + num2);
                        textView.setText(textContent_1);
                        isSum = false;
                        updata = true;
                    } else if (isDiv) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 / num2);
                        textView.setText(textContent_1);
                        isDiv = false;
                        updata = true;
                    } else if (isSub) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 - num2);
                        textView.setText(textContent_1);
                        isSub = false;
                        updata = true;
                    }if(!isDiv && !isSub && !isSum){
                        textContent_2 = "";
                        updata = true;
                    }
                }
                break;
            case R.id.bt_equal:
                if(textContent_2.equals("") || textContent_1.equals("")){
                    break;
                }else{
                    result = true;
                    if (isSum) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 + num2);
                        textView.setText(textContent_1);
                        isSum = false;
                        updata = true;
                    } else if (isDiv) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 / num2);
                        textView.setText(textContent_1);
                        isDiv = false;
                        updata = true;
                    } else if (isSub) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 - num2);
                        textView.setText(textContent_1);
                        isSub = false;
                        updata = true;
                    }else if (isMul) {
                        float num1 = Float.parseFloat(textContent_1);
                        float num2 = Float.parseFloat(textContent_2);
                        textContent_1 = "" + (num1 * num2);
                        textView.setText(textContent_1);
                        isSub = false;
                        updata = true;
                    }
                }
                UpDate();
                break;
            case R.id.bt_sign :
                if(isMul || isSum || isSum ||isSub){
                    if(textContent_2.equals("")){
                        Toast.makeText(MainActivity.this,"Please send another number!",Toast.LENGTH_SHORT).show();
                        break;
                    }else{
                        textContent_2 = "" + Float.parseFloat(textContent_2) * -1;
                        textView.setText(textContent_2);
                        break;
                    }
                }else{
                    if(textContent_1.equals("")){
                        break;
                    }
                    textContent_1 = "" + Float.parseFloat(textContent_1) * -1;
                    textView.setText(textContent_1);
                    break;
                }
            case R.id.bt_evolution :
                if(textView.length() == 0){
                    Toast.makeText(MainActivity.this,"Please send a number",Toast.LENGTH_SHORT).show();
                    break;
                }
                if(isDiv || isMul || isSum || isSub){
                    if(textContent_2.equals("")){
                        break;
                    }
                    textView.setText("" + Math.sqrt(Double.parseDouble(textContent_2)));
                    break;
                }else{
                    if(textContent_1.equals("")){
                        break;
                    }
                    textContent_1 ="" +  Math.sqrt(Double.parseDouble(textContent_1));
                    textView.setText(textContent_1);
                    break;
                }
            default:
                break;
        }
        if(isSum || isSub || isMul ||isDiv){

        }else{
            textContent_1 = textView.getText().toString();
        }
    }

}