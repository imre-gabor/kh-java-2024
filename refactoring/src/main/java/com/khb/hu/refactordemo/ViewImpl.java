package com.khb.hu.refactordemo;

import java.util.List;

public class ViewImpl implements View {

    private final int fromIndex;
    private final int toIndex;

    public ViewImpl() {
        fromIndex = 0;
        toIndex = 4;
    }

    @Override
    public List<Integer> getItems(List<Integer> list) {
        return list.subList(fromIndex, toIndex);
    }
}
