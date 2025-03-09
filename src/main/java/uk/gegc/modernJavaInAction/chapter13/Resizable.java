package uk.gegc.modernJavaInAction.chapter13;

public interface Resizable {

    public int getWidth();

    public int getHeight();

    public void setAbsoluteSize(int w, int h);

    default public int setRelativeSize(int factor){
        return 0;
    }

}
