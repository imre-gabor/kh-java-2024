package com.jetbrains;

import java.util.List;

public class ViewImpl implements View {

    private final int fromIndex;
    private final int toIndex;

    public ViewImpl() {
        fromIndex = 0;
        toIndex = 4;
    }

    @Override
    public List<Integer> getItemsList() {
        return List.of(1, 2, 3,4, 5).subList(fromIndex, toIndex);
    }
}
