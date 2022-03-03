package ru.kristinak.HW;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
