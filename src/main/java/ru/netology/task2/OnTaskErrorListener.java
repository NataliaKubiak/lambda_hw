package ru.netology.task2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
