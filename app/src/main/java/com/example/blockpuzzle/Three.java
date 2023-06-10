package com.example.blockpuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Three extends AppCompatActivity implements View.OnClickListener
{

    TextView reset,new1,sol;
    TextView B[] = new TextView[9];
    TextView click,back;

    int cnt = 0;

    Dialog dialogWin , dialogLoss;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        for (int i = 0 ; i < B.length ; i++)
        {
            int id = getResources().getIdentifier("B"+ i, "id",getPackageName());
            B[i] = findViewById(id);
        }
        for (int i = 0 ; i < B.length ; i++)
        {
            B[i].setOnClickListener(this);
            B[i].setEnabled(false);
        }


        reset = findViewById(R.id.Reset);
        new1 = findViewById(R.id.New);
        sol = findViewById(R.id.Sol);
        click = findViewById(R.id.Click);
        back = findViewById(R.id.Back);

        reset.setOnClickListener(this);
        new1.setOnClickListener(this);
        sol.setOnClickListener(this);
        click.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId()==new1.getId())
        {
            for (int i = 0; i < B.length ; i++)
            {
                B[i].setEnabled(true);
            }
        }
        if (view.getId()==B[0].getId())
        {
            String S = (String) B[0].getText();
            if (B[1].getText().equals(" "))
            {
                B[1].setText(S);
                B[0].setText(" ");
            }
            if (B[3].getText().equals(" "))
            {
                B[3].setText(S);
                B[0].setText(" ");
            }
        }
        if (view.getId()==B[1].getId())
        {
            String S = (String) B[1].getText();
            if (B[0].getText().equals(" "))
            {
                B[0].setText(S);
                B[1].setText(" ");
            }
            if (B[2].getText().equals(" "))
            {
                B[2].setText(S);
                B[1].setText(" ");
            }
            if (B[4].getText().equals(" "))
            {
                B[4].setText(S);
                B[1].setText(" ");
            }
        }
        if (view.getId()==B[2].getId())
        {
            String S = (String) B[2].getText();
            if (B[1].getText().equals(" "))
            {
                B[1].setText(S);
                B[2].setText(" ");
            }
            if (B[5].getText().equals(" "))
            {
                B[5].setText(S);
                B[2].setText(" ");
            }
        }
        if (view.getId()==B[3].getId())
        {
            String S = (String) B[3].getText();
            if (B[0].getText().equals(" "))
            {
                B[0].setText(S);
                B[3].setText(" ");
            }
            if (B[4].getText().equals(" "))
            {
                B[4].setText(S);
                B[3].setText(" ");
            }
            if (B[6].getText().equals(" "))
            {
                B[6].setText(S);
                B[3].setText(" ");
            }
        }
        if (view.getId()==B[4].getId())
        {
            String S = (String) B[4].getText();
            if (B[1].getText().equals(" "))
            {
                B[1].setText(S);
                B[4].setText(" ");
            }
            if (B[3].getText().equals(" "))
            {
                B[3].setText(S);
                B[4].setText(" ");
            }
            if (B[5].getText().equals(" "))
            {
                B[5].setText(S);
                B[4].setText(" ");
            }
           if (B[7].getText().equals(" "))
           {
               B[7].setText(S);
               B[4].setText(" ");
           }
        }
        if (view.getId()==B[5].getId())
        {
            String S = (String) B[5].getText();
            if (B[2].getText().equals(" "))
            {
                B[2].setText(S);
                B[5].setText(" ");
            }
            if (B[4].getText().equals(" "))
            {
                B[4].setText(S);
                B[5].setText(" ");
            }
            if (B[8].getText().equals(" "))
            {
                B[8].setText(S);
                B[5].setText(" ");
            }
        }
        if (view.getId()==B[6].getId())
        {
            String S = (String) B[6].getText();
            if (B[3].getText().equals(" "))
            {
                B[3].setText(S);
                B[6].setText(" ");
            }
            if (B[7].getText().equals(" "))
            {
                B[7].setText(S);
                B[6].setText(" ");
            }
        }
        if (view.getId()==B[7].getId())
        {
            String S = (String) B[7].getText();
            if (B[4].getText().equals(" "))
            {
                B[4].setText(S);
                B[7].setText(" ");
            }
            if (B[6].getText().equals(" "))
            {
                B[6].setText(S);
                B[7].setText(" ");
            }
            if (B[8].getText().equals(" "))
            {
                B[8].setText(S);
                B[7].setText(" ");
            }
        }
        if (view.getId()==B[8].getId())
        {
            String S = (String) B[8].getText();
            if (B[5].getText().equals(" "))
            {
                B[5].setText(S);
                B[8].setText(" ");
            }
            if (B[7].getText().equals(" "))
            {
                B[7].setText(S);
                B[8].setText(" ");
            }
        }
        cnt++;
        click.setText(""+cnt);


        if (view.getId()==new1.getId())
        {
            String S = (String) B[0].getText();
            B[0].setText(B[7].getText());
            B[7].setText(S);
            S = (String) B[3].getText();
            B[3].setText(B[8].getText());
            B[8].setText(S);
            S = (String) B[5].getText();
            B[5].setText(B[1].getText());
            B[1].setText(S);
            S = (String) B[6].getText();
            B[6].setText(B[2].getText());
            B[2].setText(S);
            cnt = 0;
            click.setText(""+cnt);
        }

        if (view.getId()==sol.getId())
        {
            B[0].setText("1");
            B[1].setText("2");
            B[2].setText("3");
            B[3].setText("4");
            B[4].setText("5");
            B[5].setText("6");
            B[6].setText("7");
            B[7].setText("8");
            B[8].setText(" ");

            cnt = 0;
            click.setText(""+cnt);
        }

        if (view.getId()==reset.getId())
        {
            cnt = 0;
            click.setText(""+cnt);
        }

        if (view.getId()==back.getId())
        {
            Intent Iback;
            Iback = new Intent(Three.this,LevelPage.class);
            startActivity(Iback);
        }

        if (B[0].getText().equals("1") && B[1].getText().equals("2") && B[2].getText().equals("3") &&
              B[3].getText().equals("4") && B[4].getText().equals("5") && B[5].getText().equals("6") &&
              B[6].getText().equals("7") && B[7].getText().equals("8") && B[8].getText().equals(" "))
        {
            Win();
        }

    }



    //================================================================================================
    // Dialog Box for WIN

    public void Win()
    {
        dialogWin = new Dialog(Three.this);
        dialogWin.setCancelable(true);
        dialogWin.setContentView(R.layout.dailog_win);
        dialogWin.findViewById(R.id.Back).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent IBack;
                IBack = new Intent(Three.this , LevelPage.class);
                startActivity(IBack);
            }
        });
        dialogWin.findViewById(R.id.Next).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent INext;
                INext = new Intent(Three.this , Four.class);
                startActivity(INext);
            }
        });
        dialogWin.show();
    }

    //================================================================================================
    // Dialog Box for LOSS

    public void Loss()
    {
        dialogLoss = new Dialog(Three.this);
        dialogLoss.setCancelable(true);
        dialogLoss.setContentView(R.layout.dailog_loss);
        dialogLoss.findViewById(R.id.Back).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent IBack;
                IBack = new Intent(Three.this , LevelPage.class);
                startActivity(IBack);
            }
        });
        dialogLoss.findViewById(R.id.ReStart).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent Irestart;
                Irestart = new Intent(Three.this , Three.class);
                startActivity(Irestart);
            }
        });
        dialogLoss.show();

    }
}