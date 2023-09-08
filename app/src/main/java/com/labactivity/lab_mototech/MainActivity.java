package com.labactivity.lab_mototech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView background, img_motor;
    TextView txt_title, txt_srp;
    TextView txt_1, txt_2, txt_3, txt_make,txt_model, txt_regdate, txt_trans;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8;
    RadioButton bg1, bg2, bg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView background = findViewById(R.id.background);
        bg1 = findViewById(R.id.theme1);
        bg2 = findViewById(R.id.theme2);
        bg3 = findViewById(R.id.theme3);

        bg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setImageResource(R.drawable.theme1);
                bg2.setSelected(false);
                bg3.setSelected(false);
            }
        });

        bg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setImageResource(R.drawable.theme2);
                bg1.setSelected(false);
                bg3.setSelected(false);
            }
        });

        bg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setImageResource(R.drawable.theme3);
                bg1.setSelected(false);
                bg2.setSelected(false);
            }
        });


        img_motor = findViewById(R.id.img_motor);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        txt_srp = findViewById(R.id.txt_srp);
        txt_make = findViewById(R.id.txt_make);
        txt_model = findViewById(R.id.txt_model);
        txt_regdate = findViewById(R.id.txt_regdate);
        txt_trans = findViewById(R.id.txt_trans);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()) {
                    img_motor.setImageResource(R.drawable.airblade160);
                    txt_srp.setText("SRP: P119,900");
                    txt_make.setText("HONDA - The Power of Dreams");
                    txt_model.setText("Honda Airblade 160");
                    txt_regdate.setText("2022");
                    txt_trans.setText("Automatic");

                } else {
                    img_motor.setImageResource(R.drawable.imgblank);
                    txt_srp.setText("");
                    txt_make.setText("");
                    txt_model.setText("");
                    txt_regdate.setText("");
                    txt_trans.setText("");
                }

                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);

            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox2.isChecked()){
                    img_motor.setImageResource(R.drawable.click160);
                    txt_srp.setText("SRP: P116,900");
                    txt_make.setText("HONDA - The Power of Dreams");
                    txt_model.setText("Honda Click 160");
                    txt_regdate.setText("2022");
                    txt_trans.setText("Automatic");

                } else {
                    img_motor.setImageResource(R.drawable.imgblank);
                    txt_srp.setText("");
                    txt_make.setText("");
                    txt_model.setText("");
                    txt_regdate.setText("");
                    txt_trans.setText("");
                }

                checkBox1.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox3.isChecked()){
                    img_motor.setImageResource(R.drawable.beathonda);
                    txt_srp.setText("SRP: P69,900");
                    txt_make.setText("HONDA - The Power of Dreams");
                    txt_model.setText("Honda Beat Fashion Sport");
                    txt_regdate.setText("2021");
                    txt_trans.setText("Automatic");

                } else {
                    img_motor.setImageResource(R.drawable.imgblank);
                    txt_srp.setText("");
                    txt_make.setText("");
                    txt_model.setText("");
                    txt_regdate.setText("");
                    txt_trans.setText("");
                }

                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox4.isChecked()){
                    img_motor.setImageResource(R.drawable.pcx160);
                    txt_srp.setText("SRP: P145,900");
                    txt_make.setText("HONDA - The Power of Dreams");
                    txt_model.setText("Honda PCX - ABS (2021)");
                    txt_regdate.setText("2021");
                    txt_trans.setText("Automatic");

                } else {
                    img_motor.setImageResource(R.drawable.imgblank);
                    txt_srp.setText("");
                    txt_make.setText("");
                    txt_model.setText("");
                    txt_regdate.setText("");
                    txt_trans.setText("");
                }

                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);

            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox5.isChecked()){
                    img_motor.setImageResource(R.drawable.nmax);
                    txt_srp.setText("SRP: P150,000");
                    txt_make.setText("YAMAHA - Revs Your Heart");
                    txt_model.setText("Yamaha NMAX ABS 2022");
                    txt_regdate.setText("2022");
                    txt_trans.setText("Automatic");

                } else {
                    img_motor.setImageResource(R.drawable.imgblank);
                    txt_srp.setText("");
                    txt_make.setText("");
                    txt_model.setText("");
                    txt_regdate.setText("");
                    txt_trans.setText("");
                }

                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);

            }
        });

        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox6.isChecked()){
                    img_motor.setImageResource(R.drawable.tmax);
                    txt_srp.setText("SRP: P779,000");
                    txt_make.setText("YAMAHA - Revs Your Heart");
                    txt_model.setText("Yamaha TMAX Tech Max");
                    txt_regdate.setText("2021");
                    txt_trans.setText("Automatic");

                } else {
                    img_motor.setImageResource(R.drawable.imgblank);
                    txt_srp.setText("");
                    txt_make.setText("");
                    txt_model.setText("");
                    txt_regdate.setText("");
                    txt_trans.setText("");
                }

                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);

            }
        });

        checkBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox7.isChecked()){
                    img_motor.setImageResource(R.drawable.sniper155);
                    txt_srp.setText("SRP: P120,400");
                    txt_make.setText("YAMAHA - Revs Your Heart");
                    txt_model.setText("Yamaha Sniper 155");
                    txt_regdate.setText("2021");
                    txt_trans.setText("Manual");

                } else {
                    img_motor.setImageResource(R.drawable.imgblank);
                    txt_srp.setText("");
                    txt_make.setText("");
                    txt_model.setText("");
                    txt_regdate.setText("");
                    txt_trans.setText("");
                }

                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox8.setChecked(false);

            }
        });

        checkBox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox8.isChecked()){
                    img_motor.setImageResource(R.drawable.miogear);
                    txt_srp.setText("SRP: P120,400");
                    txt_make.setText("YAMAHA - Revs Your Heart");
                    txt_model.setText("Yamaha Mio Gear S");
                    txt_regdate.setText("2021");
                    txt_trans.setText("Automatic");

                } else {
                    img_motor.setImageResource(R.drawable.imgblank);
                    txt_srp.setText("");
                    txt_make.setText("");
                    txt_model.setText("");
                    txt_regdate.setText("");
                    txt_trans.setText("");
                }

                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);

            }
        });

    }
}