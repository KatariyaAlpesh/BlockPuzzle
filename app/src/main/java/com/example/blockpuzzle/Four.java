package com.example.blockpuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Four extends AppCompatActivity implements View.OnClickListener
{
    TextView B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,BS,BR,BN,back;
    TextView T1;
    int cnt = 0;

    Dialog dialogWin , dialogLoss;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        B1 = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);
        B3 = findViewById(R.id.b3);
        B4 = findViewById(R.id.b4);
        B5 = findViewById(R.id.b5);
        B6 = findViewById(R.id.b6);
        B7 = findViewById(R.id.b7);
        B8 = findViewById(R.id.b8);
        B9 = findViewById(R.id.b9);
        B10 = findViewById(R.id.b10);
        B11 = findViewById(R.id.b11);
        B12 = findViewById(R.id.b12);
        B13 = findViewById(R.id.b13);
        B14 = findViewById(R.id.b14);

        B15 = findViewById(R.id.b15);
        B16 = findViewById(R.id.b16);
        BS = findViewById(R.id.bs);
        BR = findViewById(R.id.br);
        BN = findViewById(R.id.start);
        back = findViewById(R.id.Back);
        T1 = findViewById(R.id.T1);

        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);
        B7.setOnClickListener(this);
        B8.setOnClickListener(this);
        B9.setOnClickListener(this);
        B10.setOnClickListener(this);
        B11.setOnClickListener(this);
        B12.setOnClickListener(this);
        B13.setOnClickListener(this);
        B14.setOnClickListener(this);
        B15.setOnClickListener(this);
        B16.setOnClickListener(this);
        BS.setOnClickListener(this);
        BR.setOnClickListener(this);
        BN.setOnClickListener(this);
        back.setOnClickListener(this);
        T1.setOnClickListener(this);

        B1.setEnabled(false);
        B2.setEnabled(false);
        B3.setEnabled(false);
        B4.setEnabled(false);
        B5.setEnabled(false);
        B6.setEnabled(false);
        B7.setEnabled(false);
        B8.setEnabled(false);
        B9.setEnabled(false);
        B10.setEnabled(false);
        B11.setEnabled(false);
        B12.setEnabled(false);
        B13.setEnabled(false);
        B14.setEnabled(false);
        B15.setEnabled(false);
        B16.setEnabled(false);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId()==BN.getId())
        {
            B1.setEnabled(true);
            B2.setEnabled(true);
            B3.setEnabled(true);
            B4.setEnabled(true);
            B5.setEnabled(true);
            B6.setEnabled(true);
            B7.setEnabled(true);
            B8.setEnabled(true);
            B9.setEnabled(true);
            B10.setEnabled(true);
            B11.setEnabled(true);
            B12.setEnabled(true);
            B13.setEnabled(true);
            B14.setEnabled(true);
            B15.setEnabled(true);
            B16.setEnabled(true);

        }

        if (view.getId()==B1.getId())
        {
            String S = (String) B1.getText();
            if (B2.getText().equals(" "))
            {
                B2.setText(S);
                B1.setText(" ");
            }
            else if (B5.getText().equals(" "))
            {
                B5.setText(S);
                B1.setText(" ");
            }
        }
        if (view.getId()==B2.getId())
        {
            String S = (String) B2.getText();
            if (B1.getText().equals(" "))
            {
                B1.setText(S);
                B2.setText(" ");
            }
            else if (B3.getText().equals(" "))
            {
                B3.setText(S);
                B2.setText(" ");
            }
            else if (B6.getText().equals(" "))
            {
                B6.setText(S);
                B2.setText(" ");
            }
        }
        if (view.getId()==B3.getId())
        {
            String S = (String) B3.getText();
            if (B2.getText().equals(" "))
            {
                B2.setText(S);
                B3.setText(" ");
            }
            else if (B4.getText().equals(" "))
            {
                B4.setText(S);
                B3.setText(" ");
            }
            else if (B7.getText().equals(" "))
            {
                B7.setText(S);
                B3.setText(" ");
            }
        }
        if (view.getId()==B4.getId())
        {
            String S = (String) B4.getText();
            if (B3.getText().equals(" "))
            {
                B3.setText(S);
                B4.setText(" ");
            }
            else if (B8.getText().equals(" "))
            {
                B8.setText(S);
                B4.setText(" ");
            }
        }
        if (view.getId()==B5.getId())
        {
            String S = (String) B5.getText();
            if (B1.getText().equals(" "))
            {
                B1.setText(S);
                B5.setText(" ");
            }
            else if (B6.getText().equals(" "))
            {
                B6.setText(S);
                B5.setText(" ");
            }
            else if (B9.getText().equals(" "))
            {
                B9.setText(S);
                B5.setText(" ");
            }
        }
        if (view.getId()==B6.getId())
        {
            String S = (String) B6.getText();
            if (B2.getText().equals(" "))
            {
                B2.setText(S);
                B6.setText(" ");
            }
            else if (B5.getText().equals(" "))
            {
                B5.setText(S);
                B6.setText(" ");
            }
            else if (B7.getText().equals(" "))
            {
                B7.setText(S);
                B6.setText(" ");
            }
            else if (B10.getText().equals(" "))
            {
                B10.setText(S);
                B6.setText(" ");
            }
        }
        if (view.getId()==B7.getId())
        {
            String S = (String) B7.getText();
            if (B3.getText().equals(" "))
            {
                B3.setText(S);
                B7.setText(" ");
            }
            else if (B6.getText().equals(" "))
            {
                B6.setText(S);
                B7.setText(" ");
            }
            else if (B8.getText().equals(" "))
            {
                B8.setText(S);
                B7.setText(" ");
            }
            else if (B11.getText().equals(" "))
            {
                B11.setText(S);
                B7.setText(" ");
            }
        }
        if (view.getId()==B8.getId())
        {
            String S = (String) B8.getText();
            if (B4.getText().equals(" "))
            {
                B4.setText(S);
                B8.setText(" ");
            }
            else if (B7.getText().equals(" "))
            {
                B7.setText(S);
                B8.setText(" ");
            }
            else if (B12.getText().equals(" "))
            {
                B12.setText(S);
                B8.setText(" ");
            }
        }
        if (view.getId()==B9.getId())
        {
            String S = (String) B9.getText();
            if (B5.getText().equals(" "))
            {
                B5.setText(S);
                B9.setText(" ");
            }
            else if (B10.getText().equals(" "))
            {
                B10.setText(S);
                B9.setText(" ");
            }
            else if (B13.getText().equals(" "))
            {
                B13.setText(S);
                B9.setText(" ");
            }
        }
        if (view.getId()==B10.getId())
        {
            String S = (String) B10.getText();
            if (B6.getText().equals(" "))
            {
                B6.setText(S);
                B10.setText(" ");
            }
            else if (B9.getText().equals(" "))
            {
                B9.setText(S);
                B10.setText(" ");
            }
            else if (B11.getText().equals(" "))
            {
                B11.setText(S);
                B10.setText(" ");
            }
            else if (B14.getText().equals(" "))
            {
                B14.setText(S);
                B10.setText(" ");
            }
        }
        if (view.getId()==B11.getId())
        {
            String S = (String) B11.getText();
            if (B7.getText().equals(" "))
            {
                B7.setText(S);
                B11.setText(" ");
            }
            else if (B10.getText().equals(" "))
            {
                B10.setText(S);
                B11.setText(" ");
            }
            else if (B12.getText().equals(" "))
            {
                B12.setText(S);
                B11.setText(" ");
            }
            else if (B15.getText().equals(" "))
            {
                B15.setText(S);
                B11.setText(" ");
            }
        }
        if (view.getId()==B12.getId())
        {
            String S = (String) B12.getText();
            if (B8.getText().equals(" "))
            {
                B8.setText(S);
                B12.setText(" ");
            }
            else if (B11.getText().equals(" "))
            {
                B11.setText(S);
                B12.setText(" ");
            }
            else if (B16.getText().equals(" "))
            {
                B16.setText(S);
                B12.setText(" ");
            }
        }
        if (view.getId()==B13.getId())
        {
            String S = (String) B13.getText();
            if (B9.getText().equals(" "))
            {
                B9.setText(S);
                B13.setText(" ");
            }
            else if (B14.getText().equals(" "))
            {
                B14.setText(S);
                B13.setText(" ");
            }
        }
        if (view.getId()==B14.getId())
        {
            String S = (String) B14.getText();
            if (B10.getText().equals(" "))
            {
                B10.setText(S);
                B14.setText(" ");
            }
            else if (B13.getText().equals(" "))
            {
                B13.setText(S);
                B14.setText(" ");
            } else if (B15.getText().equals(" "))
            {
                B15.setText(S);
                B14.setText(" ");
            }
        }
        if (view.getId()==B15.getId())
        {
            String S = (String) B15.getText();
            if (B11.getText().equals(" "))
            {
                B11.setText(S);
                B15.setText(" ");
            }
            else if (B14.getText().equals(" "))
            {
                B14.setText(S);
                B15.setText(" ");
            } else if (B16.getText().equals(" "))
            {
                B16.setText(S);
                B15.setText(" ");
            }
        }
        if (view.getId()==B16.getId())
        {
            String S = (String) B16.getText();
            if (B12.getText().equals(" "))
            {
                B12.setText(S);
                B16.setText(" ");
            }
            else if (B15.getText().equals(" "))
            {
                B15.setText(S);
                B16.setText(" ");
            }
        }
        cnt++;
        T1.setText(" = "+cnt);
        if (view.getId()==BS.getId())
        {
            B1.setText("1");
            B2.setText("2");
            B3.setText("3");
            B4.setText("4");
            B5.setText("5");
            B6.setText("6");
            B7.setText("7");
            B8.setText("8");
            B9.setText("9");
            B10.setText("10");
            B11.setText("11");
            B12.setText("12");
            B13.setText("13");
            B14.setText("14");
            B15.setText("15");
            B16.setText(" ");
            cnt = 0;
            T1.setText(""+cnt);
        }
        if (view.getId()==BR.getId())
        {
            B1.setEnabled(true); B2.setEnabled(true); B3.setEnabled(true); B4.setEnabled(true);
            B5.setEnabled(true); B6.setEnabled(true); B7.setEnabled(true); B8.setEnabled(true);
            B9.setEnabled(true); B10.setEnabled(true); B11.setEnabled(true); B12.setEnabled(true);
            B13.setEnabled(true); B14.setEnabled(true); B15.setEnabled(true); B16.setEnabled(true);
            cnt = 0;
            T1.setText(""+cnt);
        }
        if (view.getId()==BN.getId())
        {
            String S = (String) B4.getText();
            B4.setText(B9.getText());
            B9.setText(S);
            S = (String) B8.getText();
            B8.setText(B1.getText());
            B1.setText(S);
            S = (String) B5.getText();
            B5.setText(B10.getText());
            B10.setText(S);
            S = (String) B16.getText();
            B16.setText(B11.getText());
            B11.setText(S);
            S = (String) B2.getText();
            B2.setText(B14.getText());
            B14.setText(S);
            S = (String) B6.getText();
            B6.setText(B13.getText());
            B13.setText(S);
            cnt = 0;
            T1.setText(" "+cnt);
        }

        if (B1.getText().equals("1") && B2.getText().equals("2") && B3.getText().equals("3") &&
                B4.getText().equals("4") && B5.getText().equals("5") && B6.getText().equals("6") &&
                B7.getText().equals("7") && B8.getText().equals("8") && B9.getText().equals("9") &&
                B10.getText().equals("10") && B11.getText().equals("11") && B12.getText().equals("12") &&
                B13.getText().equals("13") && B14.getText().equals("14") && B15.getText().equals("15") &&
                B16.getText().equals(" "))
        {
            Win();
        }

        if (view.getId()==back.getId())
        {
            Intent Iback;
            Iback = new Intent(Four.this , LevelPage.class);
            startActivity(Iback);
        }

    }

    //================================================================================================
    // Dialog Box for WIN

    public void Win()
    {
        dialogWin = new Dialog(Four.this);
        dialogWin.setCancelable(true);
        dialogWin.setContentView(R.layout.dailog_win);
        dialogWin.findViewById(R.id.Back).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent IBack;
                IBack = new Intent(Four.this , LevelPage.class);
                startActivity(IBack);
            }
        });
        dialogWin.findViewById(R.id.Next).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent INext;
                INext = new Intent(Four.this , Five.class);
                startActivity(INext);
            }
        });
        dialogWin.show();
    }

    //================================================================================================
    // Dialog Box for LOSS

    public void Loss()
    {
        dialogLoss = new Dialog(Four.this);
        dialogLoss.setCancelable(true);
        dialogLoss.setContentView(R.layout.dailog_loss);
        dialogLoss.findViewById(R.id.Back).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent IBack;
                IBack = new Intent(Four.this , LevelPage.class);
                startActivity(IBack);
            }
        });
        dialogLoss.findViewById(R.id.ReStart).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent Irestart;
                Irestart = new Intent(Four.this , Four.class);
                startActivity(Irestart);
            }
        });
        dialogLoss.show();

    }
}