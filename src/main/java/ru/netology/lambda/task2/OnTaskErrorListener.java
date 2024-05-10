package ru.netology.lambda.task2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
