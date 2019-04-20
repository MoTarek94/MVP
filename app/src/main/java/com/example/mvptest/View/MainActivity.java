package com.example.mvptest.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvptest.Presenter.MainActivityPresenter;
import com.example.mvptest.R;

public class MainActivity extends AppCompatActivity implements com.example.mvptest.View.View {
    private MainActivityPresenter presenter;
    private TextView myTextView;
    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView =findViewById(R.id.textView);
        myButton = findViewById(R.id.button);
        presenter = new MainActivityPresenter(this);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                presenter.updateCounter();
            }
        });


    }

    @Override
    public void updateCounterTextView(int counter)
    {
      myTextView.setText(counter+"");
    }
}
