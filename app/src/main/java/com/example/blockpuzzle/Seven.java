package com.example.blockpuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Seven extends AppCompatActivity implements View.OnClickListener
{

    TextView Set,New,Reset,Click,Sol,Back;

    TextView B[] = new TextView[49];
    int Cnt = 0;

    Dialog dialogWin , dialogLoss;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);

        for (int i = 0 ; i < B.length ; i++)
        {
            int id = getResources().getIdentifier("B" + i , "id",getPackageName());
            B[i] = findViewById(id);
            B[i].setOnClickListener(this);
            B[i].setEnabled(false);
        }

        Set = findViewById(R.id.set);
        New = findViewById(R.id.New);
        Reset = findViewById(R.id.Reset);
        Sol = findViewById(R.id.Sol);
        Click = findViewById(R.id.Click);
        Back = findViewById(R.id.Back);

        Set.setOnClickListener(this);
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
            if (B[7].getText().equals(" "))
            {
                B[7].setText(S);
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
            if (B[8].getText().equals(" "))
            {
                B[8].setText(S);
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
            if (B[9].getText().equals(" "))
            {
                B[9].setText(S);
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
            if (B[10].getText().equals(" "))
            {
                B[10].setText(S);
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
            if (B[5].getText().equals(" "))
            {
                B[5].setText(S);
                B[4].setText(" ");
            }
            if (B[11].getText().equals(" "))
            {
                B[11].setText(S);
                B[4].setText(" ");
            }
        }

        if (view.getId()==B[5].getId())
        {
            String S = (String) B[5].getText();
            if (B[4].getText().equals(" "))
            {
                B[4].setText(S);
                B[5].setText(" ");
            }
            if (B[6].getText().equals(" "))
            {
                B[6].setText(S);
                B[5].setText(" ");
            }
            if (B[12].getText().equals(" "))
            {
                B[12].setText(S);
                B[5].setText(" ");
            }
        }

        if (view.getId()==B[6].getId())
        {
            String S = (String) B[6].getText();
            if (B[5].getText().equals(" "))
            {
                B[5].setText(S);
                B[6].setText(" ");
            }
            if (B[13].getText().equals(" "))
            {
                B[13].setText(S);
                B[6].setText(" ");
            }
        }

        if (view.getId()==B[7].getId())
        {
            String S = (String) B[7].getText();
            if (B[0].getText().equals(" "))
            {
                B[0].setText(S);
                B[7].setText(" ");
            }
            if (B[8].getText().equals(" "))
            {
                B[8].setText(S);
                B[7].setText(" ");
            }
            if (B[14].getText().equals(" "))
            {
                B[14].setText(S);
                B[7].setText(" ");
            }
        }

        if (view.getId()==B[8].getId())
        {
            String S = (String) B[8].getText();
            if (B[1].getText().equals(" "))
            {
                B[1].setText(S);
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
            if (B[15].getText().equals(" "))
            {
                B[15].setText(S);
                B[8].setText(" ");
            }
        }

        if (view.getId()==B[9].getId())
        {
            String S = (String) B[9].getText();
            if (B[2].getText().equals(" "))
            {
                B[2].setText(S);
                B[9].setText(" ");
            }
            if (B[8].getText().equals(" "))
            {
                B[8].setText(S);
                B[9].setText(" ");
            }
            if (B[10].getText().equals(" "))
            {
                B[10].setText(S);
                B[9].setText(" ");
            }
            if (B[16].getText().equals(" "))
            {
                B[16].setText(S);
                B[9].setText(" ");
            }
        }

        if (view.getId()==B[10].getId())
        {
            String S = (String) B[10].getText();
            if (B[3].getText().equals(" "))
            {
                B[3].setText(S);
                B[10].setText(" ");
            }
            if (B[9].getText().equals(" "))
            {
                B[9].setText(S);
                B[10].setText(" ");
            }
            if (B[11].getText().equals(" "))
            {
                B[11].setText(S);
                B[10].setText(" ");
            }
            if (B[17].getText().equals(" "))
            {
                B[17].setText(S);
                B[10].setText(" ");
            }
        }

        if (view.getId()==B[11].getId())
        {
            String S = (String) B[11].getText();
            if (B[4].getText().equals(" "))
            {
                B[4].setText(S);
                B[11].setText(" ");
            }
            if (B[10].getText().equals(" "))
            {
                B[10].setText(S);
                B[11].setText(" ");
            }
            if (B[12].getText().equals(" "))
            {
                B[12].setText(S);
                B[11].setText(" ");
            }
            if (B[18].getText().equals(" "))
            {
                B[18].setText(S);
                B[11].setText(" ");
            }
        }

        if (view.getId()==B[12].getId())
        {
            String S = (String) B[12].getText();
            if (B[5].getText().equals(" "))
            {
                B[5].setText(S);
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
            if (B[19].getText().equals(" "))
            {
                B[19].setText(S);
                B[12].setText(" ");
            }
        }

        if (view.getId()==B[13].getId())
        {
            String S = (String) B[13].getText();
            if (B[6].getText().equals(" "))
            {
                B[6].setText(S);
                B[13].setText(" ");
            }
            if (B[12].getText().equals(" "))
            {
                B[12].setText(S);
                B[13].setText(" ");
            }
            if (B[20].getText().equals(" "))
            {
                B[20].setText(S);
                B[13].setText(" ");
            }
        }

        if (view.getId()==B[14].getId())
        {
            String S = (String) B[14].getText();
            if (B[7].getText().equals(" "))
            {
                B[7].setText(S);
                B[14].setText(" ");
            }
            if (B[15].getText().equals(" "))
            {
                B[15].setText(S);
                B[14].setText(" ");
            }
            if (B[21].getText().equals(" "))
            {
                B[21].setText(S);
                B[14].setText(" ");
            }
        }

        if (view.getId()==B[15].getId())
        {
            String S = (String) B[15].getText();
            if (B[8].getText().equals(" "))
            {
                B[8].setText(S);
                B[15].setText(" ");
            }
            if (B[14].getText().equals(" "))
            {
                B[14].setText(S);
                B[15].setText(" ");
            }
            if (B[16].getText().equals(" "))
            {
                B[16].setText(S);
                B[15].setText(" ");
            }
            if (B[22].getText().equals(" "))
            {
                B[22].setText(S);
                B[15].setText(" ");
            }
        }

        if (view.getId()==B[16].getId())
        {
            String S = (String) B[16].getText();
            if (B[9].getText().equals(" "))
            {
                B[9].setText(S);
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
            if (B[23].getText().equals(" "))
            {
                B[23].setText(S);
                B[16].setText(" ");
            }
        }

        if (view.getId()==B[17].getId())
        {
            String S = (String) B[17].getText();
            if (B[10].getText().equals(" "))
            {
                B[10].setText(S);
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
            if (B[24].getText().equals(" "))
            {
                B[24].setText(S);
                B[17].setText(" ");
            }
        }

        if (view.getId()==B[18].getId())
        {
            String S = (String) B[18].getText();
            if (B[11].getText().equals(" "))
            {
                B[11].setText(S);
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
            if (B[25].getText().equals(" "))
            {
                B[25].setText(S);
                B[18].setText(" ");
            }
        }

        if (view.getId()==B[19].getId())
        {
            String S = (String) B[19].getText();
            if (B[12].getText().equals(" "))
            {
                B[12].setText(S);
                B[19].setText(" ");
            }
            if (B[18].getText().equals(" "))
            {
                B[18].setText(S);
                B[19].setText(" ");
            }
            if (B[20].getText().equals(" "))
            {
                B[20].setText(S);
                B[19].setText(" ");
            }
            if (B[26].getText().equals(" "))
            {
                B[26].setText(S);
                B[19].setText(" ");
            }
        }
        if (view.getId()==B[20].getId())
        {
            String S = (String) B[20].getText();
            if (B[13].getText().equals(" "))
            {
                B[13].setText(S);
                B[20].setText(" ");
            }
            if (B[19].getText().equals(" "))
            {
                B[19].setText(S);
                B[20].setText(" ");
            }
            if (B[27].getText().equals(" "))
            {
                B[27].setText(S);
                B[20].setText(" ");
            }
        }

        if (view.getId()==B[21].getId())
        {
            String S = (String) B[21].getText();
            if (B[14].getText().equals(" "))
            {
                B[14].setText(S);
                B[21].setText(" ");
            }
            if (B[22].getText().equals(" "))
            {
                B[22].setText(S);
                B[21].setText(" ");
            }
            if (B[28].getText().equals(" "))
            {
                B[28].setText(S);
                B[21].setText(" ");
            }
        }

        if (view.getId()==B[22].getId())
        {
            String S = (String) B[22].getText();
            if (B[15].getText().equals(" "))
            {
                B[15].setText(S);
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
            if (B[29].getText().equals(" "))
            {
                B[29].setText(S);
                B[22].setText(" ");
            }
        }
        if (view.getId()==B[23].getId())
        {
            String S = (String) B[23].getText();
            if (B[16].getText().equals(" "))
            {
                B[16].setText(S);
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
            if (B[30].getText().equals(" "))
            {
                B[30].setText(S);
                B[23].setText(" ");
            }
        }

        if (view.getId()==B[24].getId())
        {
            String S = (String) B[24].getText();
            if (B[17].getText().equals(" "))
            {
                B[17].setText(S);
                B[24].setText(" ");
            }
            if (B[25].getText().equals(" "))
            {
                B[25].setText(S);
                B[24].setText(" ");
            }
            if (B[23].getText().equals(" "))
            {
                B[23].setText(S);
                B[24].setText(" ");
            }
            if (B[31].getText().equals(" "))
            {
                B[31].setText(S);
                B[24].setText(" ");
            }
        }

        if (view.getId()==B[25].getId())
        {
            String S = (String) B[25].getText();
            if (B[18].getText().equals(" "))
            {
                B[18].setText(S);
                B[25].setText(" ");
            }
            if (B[24].getText().equals(" "))
            {
                B[24].setText(S);
                B[25].setText(" ");
            }
            if (B[26].getText().equals(" "))
            {
                B[26].setText(S);
                B[25].setText(" ");
            }
            if (B[32].getText().equals(" "))
            {
                B[32].setText(S);
                B[25].setText(" ");
            }
        }

        if (view.getId()==B[26].getId())
        {
            String S = (String) B[26].getText();
            if (B[19].getText().equals(" "))
            {
                B[19].setText(S);
                B[26].setText(" ");
            }
            if (B[25].getText().equals(" "))
            {
                B[25].setText(S);
                B[26].setText(" ");
            }
            if (B[27].getText().equals(" "))
            {
                B[27].setText(S);
                B[26].setText(" ");
            }
            if (B[33].getText().equals(" "))
            {
                B[33].setText(S);
                B[26].setText(" ");
            }
        }

        if (view.getId()==B[27].getId())
        {
            String S = (String) B[27].getText();
            if (B[20].getText().equals(" "))
            {
                B[20].setText(S);
                B[27].setText(" ");
            }
            if (B[26].getText().equals(" "))
            {
                B[26].setText(S);
                B[27].setText(" ");
            }
            if (B[34].getText().equals(" "))
            {
                B[34].setText(S);
                B[27].setText(" ");
            }
        }

        if (view.getId()==B[28].getId())
        {
            String S = (String) B[28].getText();
            if (B[21].getText().equals(" "))
            {
                B[21].setText(S);
                B[28].setText(" ");
            }
            if (B[29].getText().equals(" "))
            {
                B[29].setText(S);
                B[28].setText(" ");
            }
            if (B[35].getText().equals(" "))
            {
                B[35].setText(S);
                B[28].setText(" ");
            }
        }

        if (view.getId()==B[29].getId())
        {
            String S = (String) B[29].getText();
            if (B[22].getText().equals(" "))
            {
                B[22].setText(S);
                B[29].setText(" ");
            }
            if (B[28].getText().equals(" "))
            {
                B[28].setText(S);
                B[29].setText(" ");
            }
            if (B[30].getText().equals(" "))
            {
                B[30].setText(S);
                B[29].setText(" ");
            }
            if (B[36].getText().equals(" "))
            {
                B[36].setText(S);
                B[29].setText(" ");
            }
        }

        if (view.getId()==B[30].getId())
        {
            String S = (String) B[30].getText();
            if (B[23].getText().equals(" "))
            {
                B[23].setText(S);
                B[30].setText(" ");
            }
            if (B[31].getText().equals(" "))
            {
                B[31].setText(S);
                B[30].setText(" ");
            }
            if (B[29].getText().equals(" "))
            {
                B[29].setText(S);
                B[30].setText(" ");
            }
            if (B[37].getText().equals(" "))
            {
                B[37].setText(S);
                B[30].setText(" ");
            }
        }

        if (view.getId()==B[31].getId())
        {
            String S = (String) B[31].getText();
            if (B[24].getText().equals(" "))
            {
                B[24].setText(S);
                B[31].setText(" ");
            }
            if (B[30].getText().equals(" "))
            {
                B[30].setText(S);
                B[31].setText(" ");
            }
            if (B[32].getText().equals(" "))
            {
                B[32].setText(S);
                B[31].setText(" ");
            }
            if (B[38].getText().equals(" "))
            {
                B[38].setText(S);
                B[31].setText(" ");
            }
        }

        if (view.getId()==B[32].getId())
        {
            String S = (String) B[32].getText();
            if (B[25].getText().equals(" "))
            {
                B[25].setText(S);
                B[32].setText(" ");
            }
            if (B[31].getText().equals(" "))
            {
                B[31].setText(S);
                B[32].setText(" ");
            }
            if (B[33].getText().equals(" "))
            {
                B[33].setText(S);
                B[32].setText(" ");
            }
            if (B[39].getText().equals(" "))
            {
                B[39].setText(S);
                B[32].setText(" ");
            }
        }

        if (view.getId()==B[33].getId())
        {
            String S = (String) B[33].getText();
            if (B[26].getText().equals(" "))
            {
                B[26].setText(S);
                B[33].setText(" ");
            }
            if (B[32].getText().equals(" "))
            {
                B[32].setText(S);
                B[33].setText(" ");
            }
            if (B[34].getText().equals(" "))
            {
                B[34].setText(S);
                B[33].setText(" ");
            }
            if (B[40].getText().equals(" "))
            {
                B[40].setText(S);
                B[33].setText(" ");
            }
        }

        if (view.getId()==B[34].getId())
        {
            String S = (String) B[34].getText();
            if (B[27].getText().equals(" "))
            {
                B[27].setText(S);
                B[34].setText(" ");
            }
            if (B[33].getText().equals(" "))
            {
                B[33].setText(S);
                B[34].setText(" ");
            }
            if (B[41].getText().equals(" "))
            {
                B[41].setText(S);
                B[34].setText(" ");
            }
        }

        if (view.getId()==B[35].getId())
        {
            String S = (String) B[35].getText();
            if (B[28].getText().equals(" "))
            {
                B[28].setText(S);
                B[35].setText(" ");
            }
            if (B[36].getText().equals(" "))
            {
                B[36].setText(S);
                B[35].setText(" ");
            }
            if (B[42].getText().equals(" "))
            {
                B[42].setText(S);
                B[35].setText(" ");
            }
        }

        if (view.getId()==B[36].getId())
        {
            String S = (String) B[36].getText();
            if (B[29].getText().equals(" "))
            {
                B[29].setText(S);
                B[36].setText(" ");
            }
            if (B[35].getText().equals(" "))
            {
                B[35].setText(S);
                B[36].setText(" ");
            }
            if (B[37].getText().equals(" "))
            {
                B[37].setText(S);
                B[36].setText(" ");
            }
            if (B[43].getText().equals(" "))
            {
                B[43].setText(S);
                B[36].setText(" ");
            }
        }

        if (view.getId()==B[37].getId())
        {
            String S = (String) B[37].getText();
            if (B[30].getText().equals(" "))
            {
                B[30].setText(S);
                B[37].setText(" ");
            }
            if (B[36].getText().equals(" "))
            {
                B[36].setText(S);
                B[37].setText(" ");
            }
            if (B[38].getText().equals(" "))
            {
                B[38].setText(S);
                B[37].setText(" ");
            }
            if (B[44].getText().equals(" "))
            {
                B[44].setText(S);
                B[37].setText(" ");
            }
        }

        if (view.getId()==B[38].getId())
        {
            String S = (String) B[38].getText();
            if (B[31].getText().equals(" "))
            {
                B[31].setText(S);
                B[38].setText(" ");
            }
            if (B[37].getText().equals(" "))
            {
                B[37].setText(S);
                B[38].setText(" ");
            }
            if (B[39].getText().equals(" "))
            {
                B[39].setText(S);
                B[38].setText(" ");
            }
            if (B[45].getText().equals(" "))
            {
                B[45].setText(S);
                B[38].setText(" ");
            }
        }

        if (view.getId()==B[39].getId())
        {
            String S = (String) B[39].getText();
            if (B[32].getText().equals(" "))
            {
                B[32].setText(S);
                B[39].setText(" ");
            }
            if (B[38].getText().equals(" "))
            {
                B[38].setText(S);
                B[39].setText(" ");
            }
            if (B[40].getText().equals(" "))
            {
                B[40].setText(S);
                B[39].setText(" ");
            }
            if (B[46].getText().equals(" "))
            {
                B[46].setText(S);
                B[39].setText(" ");
            }
        }
        if (view.getId()==B[40].getId())
        {
            String S = (String) B[40].getText();
            if (B[33].getText().equals(" "))
            {
                B[33].setText(S);
                B[40].setText(" ");
            }
            if (B[39].getText().equals(" "))
            {
                B[39].setText(S);
                B[40].setText(" ");
            }
            if (B[41].getText().equals(" "))
            {
                B[41].setText(S);
                B[40].setText(" ");
            }
            if (B[47].getText().equals(" "))
            {
                B[47].setText(S);
                B[40].setText(" ");
            }
        }

        if (view.getId()==B[41].getId())
        {
            String S = (String) B[41].getText();
            if (B[34].getText().equals(" "))
            {
                B[34].setText(S);
                B[41].setText(" ");
            }
            if (B[40].getText().equals(" "))
            {
                B[40].setText(S);
                B[41].setText(" ");
            }
            if (B[48].getText().equals(" "))
            {
                B[48].setText(S);
                B[41].setText(" ");
            }
        }

        if (view.getId()==B[42].getId())
        {
            String S = (String) B[42].getText();
            if (B[35].getText().equals(" "))
            {
                B[35].setText(S);
                B[42].setText(" ");
            }
            if (B[43].getText().equals(" "))
            {
                B[43].setText(S);
                B[42].setText(" ");
            }
        }

        if (view.getId()==B[43].getId())
        {
            String S = (String) B[43].getText();
            if (B[36].getText().equals(" "))
            {
                B[36].setText(S);
                B[43].setText(" ");
            }
            if (B[42].getText().equals(" "))
            {
                B[42].setText(S);
                B[43].setText(" ");
            }
            if (B[44].getText().equals(" "))
            {
                B[44].setText(S);
                B[43].setText(" ");
            }
        }

        if (view.getId()==B[44].getId())
        {
            String S = (String) B[44].getText();
            if (B[37].getText().equals(" "))
            {
                B[37].setText(S);
                B[44].setText(" ");
            }
            if (B[43].getText().equals(" "))
            {
                B[43].setText(S);
                B[44].setText(" ");
            }
            if (B[45].getText().equals(" "))
            {
                B[45].setText(S);
                B[44].setText(" ");
            }
        }

        if (view.getId()==B[45].getId())
        {
            String S = (String) B[45].getText();
            if (B[38].getText().equals(" "))
            {
                B[38].setText(S);
                B[45].setText(" ");
            }
            if (B[44].getText().equals(" "))
            {
                B[44].setText(S);
                B[45].setText(" ");
            }
            if (B[46].getText().equals(" "))
            {
                B[46].setText(S);
                B[45].setText(" ");
            }
        }

        if (view.getId()==B[46].getId())
        {
            String S = (String) B[46].getText();
            if (B[39].getText().equals(" "))
            {
                B[39].setText(S);
                B[46].setText(" ");
            }
            if (B[45].getText().equals(" "))
            {
                B[45].setText(S);
                B[46].setText(" ");
            }
            if (B[47].getText().equals(" "))
            {
                B[47].setText(S);
                B[46].setText(" ");
            }
        }

        if (view.getId()==B[47].getId())
        {
            String S = (String) B[47].getText();
            if (B[40].getText().equals(" "))
            {
                B[40].setText(S);
                B[47].setText(" ");
            }
            if (B[46].getText().equals(" "))
            {
                B[46].setText(S);
                B[47].setText(" ");
            }
            if (B[48].getText().equals(" "))
            {
                B[48].setText(S);
                B[47].setText(" ");
            }
        }

        if (view.getId()==B[48].getId())
        {
            String S = (String) B[48].getText();
            if (B[41].getText().equals(" "))
            {
                B[41].setText(S);
                B[48].setText(" ");
            }
            if (B[47].getText().equals(" "))
            {
                B[47].setText(S);
                B[48].setText(" ");
            }
        }

        Cnt++;
        Click.setText(""+Cnt);

        if (view.getId() == Set.getId())
        {
            String S = (String) B[1].getText();
            B[1].setText(B[35].getText());
            B[35].setText(S);
            S = (String) B[3].getText();
            B[3].setText(B[30].getText());
            B[30].setText(S);
            S = (String) B[6].getText();
            B[6].setText(B[29].getText());
            B[29].setText(S);
            S = (String) B[0].getText();
            B[0].setText(B[23].getText());
            B[23].setText(S);
            S = (String) B[10].getText();
            B[10].setText(B[32].getText());
            B[32].setText(S);
            S = (String) B[18].getText();
            B[18].setText(B[26].getText());
            B[26].setText(S);
            S = (String) B[15].getText();
            B[15].setText(B[28].getText());
            B[28].setText(S);
            S = (String) B[17].getText();
            B[17].setText(B[11].getText());
            B[11].setText(S);
            S = (String) B[12].getText();
            B[12].setText(B[16].getText());
            B[16].setText(S);
            S = (String) B[13].getText();
            B[13].setText(B[34].getText());
            B[34].setText(S);
            S = (String) B[2].getText();
            B[2].setText(B[48].getText());
            B[48].setText(S);
            S = (String) B[8].getText();
            B[8].setText(B[38].getText());
            B[38].setText(S);
            S = (String) B[14].getText();
            B[14].setText(B[44].getText());
            B[44].setText(S);
            S = (String) B[9].getText();
            B[9].setText(B[22].getText());
            B[22].setText(S);
            S = (String) B[21].getText();
            B[21].setText(B[43].getText());
            B[43].setText(S);
            S = (String) B[24].getText();
            B[24].setText(B[47].getText());
            B[47].setText(S);
            S = (String) B[19].getText();
            B[19].setText(B[42].getText());
            B[42].setText(S);

            Cnt = 0;
            Click.setText(""+Cnt);
        }

        if (view.getId() == New.getId())
        {
            String S = (String) B[1].getText();
            B[1].setText(B[30].getText());
            B[30].setText(S);
            S = (String) B[3].getText();
            B[3].setText(B[34].getText());
            B[34].setText(S);
            S = (String) B[6].getText();
            B[6].setText(B[23].getText());
            B[23].setText(S);
            S = (String) B[0].getText();
            B[0].setText(B[29].getText());
            B[29].setText(S);
            S = (String) B[10].getText();
            B[10].setText(B[26].getText());
            B[26].setText(S);
            S = (String) B[18].getText();
            B[18].setText(B[32].getText());
            B[32].setText(S);
            S = (String) B[15].getText();
            B[15].setText(B[28].getText());
            B[28].setText(S);
            S = (String) B[17].getText();
            B[17].setText(B[11].getText());
            B[11].setText(S);
            S = (String) B[12].getText();
            B[12].setText(B[16].getText());
            B[16].setText(S);
            S = (String) B[13].getText();
            B[13].setText(B[33].getText());
            B[33].setText(S);
            S = (String) B[9].getText();
            B[9].setText(B[22].getText());
            B[22].setText(S);
            S = (String) B[2].getText();
            B[2].setText(B[48].getText());
            B[48].setText(S);
            S = (String) B[8].getText();
            B[8].setText(B[38].getText());
            B[38].setText(S);
            S = (String) B[14].getText();
            B[14].setText(B[44].getText());
            B[44].setText(S);
            S = (String) B[9].getText();
            B[9].setText(B[22].getText());
            B[22].setText(S);
            S = (String) B[21].getText();
            B[21].setText(B[43].getText());
            B[43].setText(S);
            S = (String) B[24].getText();
            B[24].setText(B[47].getText());
            B[47].setText(S);
            S = (String) B[19].getText();
            B[19].setText(B[42].getText());
            B[42].setText(S);

            Cnt = 0;
            Click.setText(""+Cnt);
        }

        if (view.getId() == Sol.getId())
        {
            B[0].setText("1");  B[1].setText("2");  B[2].setText("3");  B[3].setText("4");  B[4].setText("5");
            B[5].setText("6");  B[6].setText("7");  B[7].setText("8");  B[8].setText("9");  B[9].setText("10");
            B[10].setText("11");  B[11].setText("12");  B[12].setText("13");  B[13].setText("14");  B[14].setText("15");
            B[15].setText("16");  B[16].setText("17");  B[17].setText("18");  B[18].setText("19");  B[19].setText("20");
            B[20].setText("21");  B[21].setText("22");  B[22].setText("23");  B[23].setText("24");  B[24].setText("25");
            B[25].setText("26");  B[26].setText("27");  B[27].setText("28");  B[28].setText("29");  B[29].setText("30");
            B[30].setText("31");  B[31].setText("32");  B[32].setText("33");  B[33].setText("34");  B[34].setText("35");
            B[35].setText("36");  B[36].setText("37");  B[37].setText("38");  B[38].setText("39");  B[39].setText("40");  B[40].setText("41");
            B[41].setText("42");  B[42].setText("43");  B[43].setText("44");  B[44].setText("45");  B[45].setText("46");  B[46].setText("47");
            B[47].setText("48");  B[48].setText(" ");

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
            IBack = new Intent(Seven.this , LevelPage.class);
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
                B[24].getText().equals("25") && B[25].getText().equals("26") && B[26].getText().equals("27") &&
                B[27].getText().equals("28") && B[28].getText().equals("29") && B[29].getText().equals("30") &&
                B[30].getText().equals("31") && B[31].getText().equals("32") && B[32].getText().equals("33") &&
                B[33].getText().equals("34") && B[34].getText().equals("35") && B[35].getText().equals("36") &&
                B[36].getText().equals("37") && B[37].getText().equals("38") && B[38].getText().equals("39") &&
                B[39].getText().equals("40") && B[40].getText().equals("41") && B[41].getText().equals("42") &&
                B[42].getText().equals("43") && B[43].getText().equals("44") && B[44].getText().equals("45") &&
                B[45].getText().equals("46") && B[46].getText().equals("47") && B[47].getText().equals("48") &&
                B[48].getText().equals(" "))
        {
            Win();
        }
    }


    //================================================================================================
    // Dialog Box for WIN

    public void Win()
    {
        dialogWin = new Dialog(Seven.this);
        dialogWin.setCancelable(true);
        dialogWin.setContentView(R.layout.dailog_win);
        dialogWin.findViewById(R.id.Back).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent IBack;
                IBack = new Intent(Seven.this , LevelPage.class);
                startActivity(IBack);
            }
        });
        dialogWin.findViewById(R.id.Next).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent INext;
                INext = new Intent(Seven.this , Eight.class);
                startActivity(INext);
            }
        });
        dialogWin.show();
    }

    //================================================================================================
    // Dialog Box for LOSS

    public void Loss()
    {
        dialogLoss = new Dialog(Seven.this);
        dialogLoss.setCancelable(true);
        dialogLoss.setContentView(R.layout.dailog_loss);
        dialogLoss.findViewById(R.id.Back).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent IBack;
                IBack = new Intent(Seven.this , LevelPage.class);
                startActivity(IBack);
            }
        });
        dialogLoss.findViewById(R.id.ReStart).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent Irestart;
                Irestart = new Intent(Seven.this , Seven.class);
                startActivity(Irestart);
            }
        });
        dialogLoss.show();


    }
}

