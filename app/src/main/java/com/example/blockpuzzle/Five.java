package com.example.blockpuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Five extends AppCompatActivity implements View.OnClickListener
{

    TextView New,Reset,Click,Sol,Back;

    TextView B[] = new TextView[25];
    int Cnt = 0;

    Dialog dialogWin , dialogLoss;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        for (int i = 0 ; i < B.length ; i++)
        {
            int id = getResources().getIdentifier("B" + i , "id",getPackageName());
            B[i] = findViewById(id);
            B[i].setOnClickListener(this);
            B[i].setEnabled(false);
        }

        New = findViewById(R.id.New);
        Reset = findViewById(R.id.Reset);
        Sol = findViewById(R.id.Sol);
        Click = findViewById(R.id.Click);
        Back = findViewById(R.id.Back);

        New.setOnClickListener(this);
        Reset.setOnClickListener(this);
        Sol.setOnClickListener(this);
        Click.setOnClickListener(this);
        Back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == New.getId())
        {
            for (int i = 0; i < B.length; i++)
            {
                {
                    B[i].setEnabled(true);
                }
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
            if (B[5].getText().equals(" "))
            {
                B[5].setText(S);
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
            if (B[6].getText().equals(" "))
            {
                B[6].setText(S);
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
            if (B[3].getText().equals(" "))
            {
                B[3].setText(S);
                B[2].setText(" ");
            }
            if (B[7].getText().equals(" "))
            {
                B[7].setText(S);
                B[2].setText(" ");
            }
        }

        if (view.getId()==B[3].getId())
        {
            String S = (String) B[3].getText();
            if (B[2].getText().equals(" "))
            {
                B[2].setText(S);
                B[3].setText(" ");
            }
            if (B[4].getText().equals(" "))
            {
                B[4].setText(S);
                B[3].setText(" ");
            }
            if (B[8].getText().equals(" "))
            {
                B[8].setText(S);
                B[3].setText(" ");
            }
        }

        if (view.getId()==B[4].getId())
        {
            String S = (String) B[4].getText();
            if (B[3].getText().equals(" "))
            {
                B[3].setText(S);
                B[4].setText(" ");
            }
            if (B[9].getText().equals(" "))
            {
                B[9].setText(S);
                B[4].setText(" ");
            }
        }

        if (view.getId()==B[5].getId())
        {
            String S = (String) B[5].getText();
            if (B[0].getText().equals(" "))
            {
                B[0].setText(S);
                B[5].setText(" ");
            }
            if (B[6].getText().equals(" "))
            {
                B[6].setText(S);
                B[5].setText(" ");
            }
            if (B[10].getText().equals(" "))
            {
                B[10].setText(S);
                B[5].setText(" ");
            }
        }

        if (view.getId()==B[6].getId())
        {
            String S = (String) B[6].getText();
            if (B[1].getText().equals(" "))
            {
                B[1].setText(S);
                B[6].setText(" ");
            }
            if (B[5].getText().equals(" "))
            {
                B[5].setText(S);
                B[6].setText(" ");
            }
            if (B[7].getText().equals(" "))
            {
                B[7].setText(S);
                B[6].setText(" ");
            }
            if (B[11].getText().equals(" "))
            {
                B[11].setText(S);
                B[6].setText(" ");
            }
        }

        if (view.getId()==B[7].getId())
        {
            String S = (String) B[7].getText();
            if (B[2].getText().equals(" "))
            {
                B[2].setText(S);
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
            if (B[12].getText().equals(" "))
            {
                B[12].setText(S);
                B[7].setText(" ");
            }
        }

        if (view.getId()==B[8].getId())
        {
            String S = (String) B[8].getText();
            if (B[3].getText().equals(" "))
            {
                B[3].setText(S);
                B[8].setText(" ");
            }
            if (B[7].getText().equals(" "))
            {
                B[7].setText(S);
                B[8].setText(" ");
            }
            if (B[9].getText().equals(" "))
            {
                B[9].setText(S);
                B[8].setText(" ");
            }
            if (B[13].getText().equals(" "))
            {
                B[13].setText(S);
                B[8].setText(" ");
            }
        }

        if (view.getId()==B[9].getId())
        {
            String S = (String) B[9].getText();
            if (B[4].getText().equals(" "))
            {
                B[4].setText(S);
                B[9].setText(" ");
            }
            if (B[8].getText().equals(" "))
            {
                B[8].setText(S);
                B[9].setText(" ");
            }
            if (B[14].getText().equals(" "))
            {
                B[14].setText(S);
                B[9].setText(" ");
            }
        }

        if (view.getId()==B[10].getId())
        {
            String S = (String) B[10].getText();
            if (B[5].getText().equals(" "))
            {
                B[5].setText(S);
                B[10].setText(" ");
            }
            if (B[11].getText().equals(" "))
            {
                B[11].setText(S);
                B[10].setText(" ");
            }
            if (B[15].getText().equals(" "))
            {
                B[15].setText(S);
                B[10].setText(" ");
            }
        }

        if (view.getId()==B[11].getId())
        {
            String S = (String) B[11].getText();
            if (B[6].getText().equals(" "))
            {
                B[6].setText(S);
                B[11].setText(" ");
            }
            if (B[10].getText().equals(" "))
            {
                B[10].setText(S);
                B[11].setText(" ");
            }
            if (B[16].getText().equals(" "))
            {
                B[16].setText(S);
                B[11].setText(" ");
            }
            if (B[12].getText().equals(" "))
            {
                B[12].setText(S);
                B[11].setText(" ");
            }
        }

        if (view.getId()==B[12].getId())
        {
            String S = (String) B[12].getText();
            if (B[7].getText().equals(" "))
            {
                B[7].setText(S);
                B[12].setText(" ");
            }
            if (B[11].getText().equals(" "))
            {
                B[11].setText(S);
                B[12].setText(" ");
            }
            if (B[13].getText().equals(" "))
            {
                B[13].setText(S);
                B[12].setText(" ");
            }
            if (B[17].getText().equals(" "))
            {
                B[17].setText(S);
                B[12].setText(" ");
            }
        }

        if (view.getId()==B[13].getId())
        {
            String S = (String) B[13].getText();
            if (B[8].getText().equals(" "))
            {
                B[8].setText(S);
                B[13].setText(" ");
            }
            if (B[12].getText().equals(" "))
            {
                B[12].setText(S);
                B[13].setText(" ");
            }
            if (B[14].getText().equals(" "))
            {
                B[14].setText(S);
                B[13].setText(" ");
            }
            if (B[18].getText().equals(" "))
            {
                B[18].setText(S);
                B[13].setText(" ");
            }
        }

        if (view.getId()==B[14].getId())
        {
            String S = (String) B[14].getText();
            if (B[9].getText().equals(" "))
            {
                B[9].setText(S);
                B[14].setText(" ");
            }
            if (B[13].getText().equals(" "))
            {
                B[13].setText(S);
                B[14].setText(" ");
            }
            if (B[19].getText().equals(" "))
            {
                B[19].setText(S);
                B[14].setText(" ");
            }
        }

        if (view.getId()==B[15].getId())
        {
            String S = (String) B[15].getText();
            if (B[10].getText().equals(" "))
            {
                B[10].setText(S);
                B[15].setText(" ");
            }
            if (B[16].getText().equals(" "))
            {
                B[16].setText(S);
                B[15].setText(" ");
            }
            if (B[20].getText().equals(" "))
            {
                B[20].setText(S);
                B[15].setText(" ");
            }
        }

        if (view.getId()==B[16].getId())
        {
            String S = (String) B[16].getText();
            if (B[11].getText().equals(" "))
            {
                B[11].setText(S);
                B[16].setText(" ");
            }
            if (B[15].getText().equals(" "))
            {
                B[15].setText(S);
                B[16].setText(" ");
            }
            if (B[17].getText().equals(" "))
            {
                B[17].setText(S);
                B[16].setText(" ");
            }
            if (B[21].getText().equals(" "))
            {
                B[21].setText(S);
                B[16].setText(" ");
            }
        }

        if (view.getId()==B[17].getId())
        {
            String S = (String) B[17].getText();
            if (B[12].getText().equals(" "))
            {
                B[12].setText(S);
                B[17].setText(" ");
            }
            if (B[16].getText().equals(" "))
            {
                B[16].setText(S);
                B[17].setText(" ");
            }
            if (B[18].getText().equals(" "))
            {
                B[18].setText(S);
                B[17].setText(" ");
            }
            if (B[22].getText().equals(" "))
            {
                B[22].setText(S);
                B[17].setText(" ");
            }
        }

        if (view.getId()==B[18].getId())
        {
            String S = (String) B[18].getText();
            if (B[13].getText().equals(" "))
            {
                B[13].setText(S);
                B[18].setText(" ");
            }
            if (B[17].getText().equals(" "))
            {
                B[17].setText(S);
                B[18].setText(" ");
            }
            if (B[19].getText().equals(" "))
            {
                B[19].setText(S);
                B[18].setText(" ");
            }
            if (B[23].getText().equals(" "))
            {
                B[23].setText(S);
                B[18].setText(" ");
            }
        }

        if (view.getId()==B[19].getId())
        {
            String S = (String) B[19].getText();
            if (B[14].getText().equals(" "))
            {
                B[14].setText(S);
                B[19].setText(" ");
            }
            if (B[18].getText().equals(" "))
            {
                B[18].setText(S);
                B[19].setText(" ");
            }
            if (B[24].getText().equals(" "))
            {
                B[24].setText(S);
                B[19].setText(" ");
            }
        }
        if (view.getId()==B[20].getId())
        {
            String S = (String) B[20].getText();
            if (B[15].getText().equals(" "))
            {
                B[15].setText(S);
                B[20].setText(" ");
            }
            if (B[21].getText().equals(" "))
            {
                B[21].setText(S);
                B[20].setText(" ");
            }
        }

        if (view.getId()==B[21].getId())
        {
            String S = (String) B[21].getText();
            if (B[16].getText().equals(" "))
            {
                B[16].setText(S);
                B[21].setText(" ");
            }
            if (B[20].getText().equals(" "))
            {
                B[20].setText(S);
                B[21].setText(" ");
            }
            if (B[22].getText().equals(" "))
            {
                B[22].setText(S);
                B[21].setText(" ");
            }
        }

        if (view.getId()==B[22].getId())
        {
            String S = (String) B[22].getText();
            if (B[17].getText().equals(" "))
            {
                B[17].setText(S);
                B[22].setText(" ");
            }
            if (B[21].getText().equals(" "))
            {
                B[21].setText(S);
                B[22].setText(" ");
            }
            if (B[23].getText().equals(" "))
            {
                B[23].setText(S);
                B[22].setText(" ");
            }
        }
        if (view.getId()==B[23].getId())
        {
            String S = (String) B[23].getText();
            if (B[18].getText().equals(" "))
            {
                B[18].setText(S);
                B[23].setText(" ");
            }
            if (B[22].getText().equals(" "))
            {
                B[22].setText(S);
                B[23].setText(" ");
            }
            if (B[24].getText().equals(" "))
            {
                B[24].setText(S);
                B[23].setText(" ");
            }
        }

        if (view.getId()==B[24].getId())
        {
            String S = (String) B[24].getText();
            if (B[19].getText().equals(" "))
            {
                B[19].setText(S);
                B[24].setText(" ");
            }
            if (B[23].getText().equals(" "))
            {
                B[23].setText(S);
                B[24].setText(" ");
            }
        }
        Cnt++;
        Click.setText(""+Cnt);

        if (view.getId() == New.getId())
        {
            String S = (String) B[2].getText();
            B[2].setText(B[24].getText());
            B[24].setText(S);
            S = (String) B[3].getText();
            B[3].setText(B[20].getText());
            B[20].setText(S);
            S = (String) B[10].getText();
            B[10].setText(B[19].getText());
            B[19].setText(S);
            S = (String) B[0].getText();
            B[0].setText(B[23].getText());
            B[23].setText(S);
            S = (String) B[6].getText();
            B[6].setText(B[15].getText());
            B[15].setText(S);
            S = (String) B[18].getText();
            B[18].setText(B[1].getText());
            B[1].setText(S);
            S = (String) B[5].getText();
            B[5].setText(B[7].getText());
            B[7].setText(S);
            S = (String) B[17].getText();
            B[17].setText(B[11].getText());
            B[11].setText(S);
            S = (String) B[12].getText();
            B[12].setText(B[16].getText());
            B[16].setText(S);

            Cnt = 0;
            Click.setText(""+Cnt);
        }

        if (view.getId() == Sol.getId())
        {
            B[0].setText("1");  B[1].setText("2");  B[2].setText("3");  B[3].setText("4");  B[4].setText("5");
            B[5].setText("6");  B[6].setText("7");  B[7].setText("8");  B[8].setText("9");  B[9].setText("10");
            B[10].setText("11");  B[11].setText("12");  B[12].setText("13");  B[13].setText("14");  B[14].setText("15");
            B[15].setText("16");  B[16].setText("17");  B[17].setText("18");  B[18].setText("19");  B[19].setText("20");
            B[20].setText("21");  B[21].setText("22");  B[22].setText("23");  B[23].setText("24");  B[24].setText(" ");

            Cnt = 0;
            Click.setText(""+Cnt);
        }

        if (view.getId() == Reset.getId())
        {
            Cnt = 0;
            Click.setText(""+Cnt);
        }

        if (view.getId() == Back.getId())
        {
            Intent IBack;
            IBack = new Intent(Five.this , LevelPage.class);
            startActivity(IBack);
        }

        if (B[0].getText().equals("1") && B[1].getText().equals("2") && B[2].getText().equals("3") &&
                B[3].getText().equals("4") && B[4].getText().equals("5") && B[5].getText().equals("6") &&
                B[6].getText().equals("7") && B[7].getText().equals("8") && B[8].getText().equals("9") &&
                B[9].getText().equals("10") && B[10].getText().equals("11") && B[11].getText().equals("12") &&
                B[12].getText().equals("13") && B[13].getText().equals("14") && B[14].getText().equals("15") &&
                B[15].getText().equals("16") && B[16].getText().equals("17") && B[17].getText().equals("18") &&
                B[18].getText().equals("19") && B[19].getText().equals("20") && B[20].getText().equals("21") &&
                B[21].getText().equals("22") && B[22].getText().equals("23") && B[23].getText().equals("24") &&
                B[24].getText().equals(" ") )
        {
            Win();
        }
    }


    //================================================================================================
    // Dialog Box for WIN

    public void Win()
    {
        dialogWin = new Dialog(Five.this);
        dialogWin.setCancelable(true);
        dialogWin.setContentView(R.layout.dailog_win);
        dialogWin.findViewById(R.id.Back).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent IBack;
                IBack = new Intent(Five.this , LevelPage.class);
                startActivity(IBack);
            }
        });
        dialogWin.findViewById(R.id.Next).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent INext;
                INext = new Intent(Five.this , Six.class);
                startActivity(INext);
            }
        });
        dialogWin.show();
    }

    //================================================================================================
    // Dialog Box for LOSS

    public void Loss()
    {
        dialogLoss = new Dialog(Five.this);
        dialogLoss.setCancelable(true);
        dialogLoss.setContentView(R.layout.dailog_loss);
        dialogLoss.findViewById(R.id.Back).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent IBack;
                IBack = new Intent(Five.this , LevelPage.class);
                startActivity(IBack);
            }
        });
        dialogLoss.findViewById(R.id.ReStart).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent Irestart;
                Irestart = new Intent(Five.this , Five.class);
                startActivity(Irestart);
            }
        });
        dialogLoss.show();

    }
}