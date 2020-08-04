package com.example.maktabhomework7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mRedButton;
    private Button mOrangeButton;
    private Button mYellowButton;
    private Button mGreenButton;
    private Button mBlueButton;
    private Button mIndigoButton;
    private Button mVioletButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();

        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(view);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        setVisibleAll();
                        setTextAfterDelay();
                    }
                }, 5000);
            }
        });

        mYellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(view);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        setVisibleAll();
                        setTextAfterDelay();
                    }
                }, 5000);
            }
        });

        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(view);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        setVisibleAll();
                        setTextAfterDelay();
                    }
                }, 5000);
            }
        });

        mIndigoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(view);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        setVisibleAll();
                        setTextAfterDelay();
                    }
                }, 5000);
            }
        });

        mOrangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(view);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        setVisibleAll();
                        setTextAfterDelay();
                    }
                }, 5000);
            }
        });

        mVioletButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(view);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        setVisibleAll();
                        setTextAfterDelay();
                    }
                }, 5000);
            }
        });

        mGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(view);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        setVisibleAll();
                        setTextAfterDelay();
                    }
                }, 5000);
            }
        });

    }


    private void find() {
        mRedButton = findViewById(R.id.btn_red);
        mOrangeButton = findViewById(R.id.btn_orange);
        mYellowButton = findViewById(R.id.btn_yellow);
        mGreenButton = findViewById(R.id.btn_green);
        mBlueButton = findViewById(R.id.btn_blue);
        mIndigoButton = findViewById(R.id.btn_indigo);
        mVioletButton = findViewById(R.id.btn_violet);
    }

    private void setTextAfterDelay() {
        mRedButton.setText(R.string.txt_red);
        mYellowButton.setText(R.string.txt_yellow);
        mOrangeButton.setText(R.string.txt_orange);
        mGreenButton.setText(R.string.txt_green);
        mBlueButton.setText(R.string.txt_blue);
        mIndigoButton.setText(R.string.txt_indigo);
        mVioletButton.setText(R.string.txt_violet);
    }

    private void setVisibleAll() {
        mRedButton.setVisibility(View.VISIBLE);
        mOrangeButton.setVisibility(View.VISIBLE);
        mGreenButton.setVisibility(View.VISIBLE);
        mYellowButton.setVisibility(View.VISIBLE);
        mVioletButton.setVisibility(View.VISIBLE);
        mIndigoButton.setVisibility(View.VISIBLE);
        mBlueButton.setVisibility(View.VISIBLE);
    }

    private void changeText(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_red:
                mRedButton.setVisibility(View.GONE);
                mOrangeButton.setText(mRedButton.getText());
                mYellowButton.setText(mRedButton.getText());
                mGreenButton.setText(mRedButton.getText());
                mBlueButton.setText(mRedButton.getText());
                mIndigoButton.setText(mRedButton.getText());
                mVioletButton.setText(mRedButton.getText());
                break;
            case R.id.btn_orange:
                mOrangeButton.setVisibility(View.GONE);
                mRedButton.setText(mOrangeButton.getText());
                mYellowButton.setText(mOrangeButton.getText());
                mGreenButton.setText(mOrangeButton.getText());
                mBlueButton.setText(mOrangeButton.getText());
                mIndigoButton.setText(mOrangeButton.getText());
                mVioletButton.setText(mOrangeButton.getText());
                break;
            case R.id.btn_blue:
                mBlueButton.setVisibility(View.GONE);
                mRedButton.setText(mBlueButton.getText());
                mYellowButton.setText(mBlueButton.getText());
                mGreenButton.setText(mBlueButton.getText());
                mOrangeButton.setText(mBlueButton.getText());
                mIndigoButton.setText(mBlueButton.getText());
                mVioletButton.setText(mBlueButton.getText());
                break;
            case R.id.btn_green:
                mGreenButton.setVisibility(View.GONE);
                mRedButton.setText(mGreenButton.getText());
                mYellowButton.setText(mGreenButton.getText());
                mBlueButton.setText(mGreenButton.getText());
                mOrangeButton.setText(mGreenButton.getText());
                mIndigoButton.setText(mGreenButton.getText());
                mVioletButton.setText(mGreenButton.getText());
                break;
            case R.id.btn_indigo:
                mIndigoButton.setVisibility(View.GONE);
                mRedButton.setText(mIndigoButton.getText());
                mYellowButton.setText(mIndigoButton.getText());
                mBlueButton.setText(mIndigoButton.getText());
                mOrangeButton.setText(mIndigoButton.getText());
                mGreenButton.setText(mIndigoButton.getText());
                mVioletButton.setText(mIndigoButton.getText());
                break;
            case R.id.btn_violet:
                mVioletButton.setVisibility(View.GONE);
                mRedButton.setText(mVioletButton.getText());
                mYellowButton.setText(mVioletButton.getText());
                mBlueButton.setText(mVioletButton.getText());
                mOrangeButton.setText(mVioletButton.getText());
                mGreenButton.setText(mVioletButton.getText());
                mIndigoButton.setText(mVioletButton.getText());
                break;
            case R.id.btn_yellow:
                mYellowButton.setVisibility(View.GONE);
                mVioletButton.setText(mYellowButton.getText());
                mRedButton.setText(mYellowButton.getText());
                mBlueButton.setText(mYellowButton.getText());
                mOrangeButton.setText(mYellowButton.getText());
                mGreenButton.setText(mYellowButton.getText());
                mIndigoButton.setText(mYellowButton.getText());
                break;
        }
    }


}

