package com.reinaldofw.a002app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Lista01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista01);

        int ButtonStyle = R.style.Widget_AppCompat_Button_Small;// .Your_Button_Style;
        LinearLayout layout = (LinearLayout) findViewById(R.id.myLinearLayout);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        for (int i = 1; i <= 10; i++) {
            ContextThemeWrapper newContext = new ContextThemeWrapper(this,  ButtonStyle);
            Button btn = new Button(newContext, null, ButtonStyle); // new ContextThemeWrapper( concontext , ButtonStyle),  null, ButtonStyle);
            btn.setText(" " + i);
           btn.setLayoutParams(new ViewGroup.LayoutParams(65, ViewGroup.LayoutParams.WRAP_CONTENT));
           // btn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)); //0, LinearLayout.LayoutParams.MATCH_PARENT,16
            layout.addView(btn);
        }
      //  View view1 = new View(this);
      //  view1.setBackgroundColor(0xFFC2BEBF);
    }
}
