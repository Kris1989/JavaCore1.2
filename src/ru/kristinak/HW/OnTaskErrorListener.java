package ru.kristinak.HW;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
