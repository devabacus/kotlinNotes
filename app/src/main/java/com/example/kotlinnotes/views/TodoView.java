package com.example.kotlinnotes.views;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.kotlinnotes.R;
import com.example.kotlinnotes.models.Todo;

public class TodoView extends ConstraintLayout {

    private CheckBox cbComplete;
    private TextView tvDescription;


    public TodoView(Context context) {
        super(context);
    }

    public TodoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TodoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void initView(Todo todo) {
        cbComplete = findViewById(R.id.cb_complete);
        tvDescription = findViewById(R.id.tv_description);
        tvDescription.setText(todo.getDescription());
        cbComplete.setChecked(todo.isComplete());
        if (todo.isComplete()) {
            createStrikeThrough();
        }
        setUpCheckStateListener();
    }

    public void setUpCheckStateListener() {
        cbComplete.setOnCheckedChangeListener((button, isChecked) ->{
            if (isChecked) {
                createStrikeThrough();
            } else {
                removeStrikeThrough();
            }
        });
    }

    private void createStrikeThrough() {
        tvDescription.setPaintFlags(tvDescription.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
    }

    private void removeStrikeThrough() {
        tvDescription.setPaintFlags(tvDescription.getPaintFlags() & ~(Paint.STRIKE_THRU_TEXT_FLAG));
    }


}
