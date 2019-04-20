package com.example.mvptest.Presenter;

import com.example.mvptest.Model.User;
import com.example.mvptest.View.View;

public class MainActivityPresenter implements View {
    private User user;
    private View view;

    public MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

  public  void updateCounter ()
  {
      user.increaseCounter();
      view.updateCounterTextView(user.getCounter());
  }

    @Override
    public void updateCounterTextView(int counter) {

    }



}
