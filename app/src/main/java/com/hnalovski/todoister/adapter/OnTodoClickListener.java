package com.hnalovski.todoister.adapter;

import com.hnalovski.todoister.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);
}
