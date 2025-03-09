package uk.gegc.modernJavaInAction.chapter13;

public class Square implements Resizable{
    private int width;
    private int height;

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public void setAbsoluteSize(int w, int h) {
        this.height = h;
        this.width = w;
    }
}
