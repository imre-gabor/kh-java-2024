package com.khb.hu.refactordemo;

public class ExtractMethodObject {

    public boolean m(int a, int b){
        ABHelper abHelper = new ABHelper(a, b);
        abHelper.invoke();

        return abHelper.y < 100;
    }

    public int m2(int a, int b){
        ABHelper abHelper = new ABHelper(a, b);
        abHelper.invoke();

        return abHelper.x / abHelper.y;
    }


    private class ABHelper {
        private int a;
        private int b;
        private int x;
        private int y;

        public ABHelper(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void invoke() {
            x = a*b;
            y = x - 50;
        }
    }
}
