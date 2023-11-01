package net.s5gi.entityculling.access;

public interface Cullable {

    public void setTimeout();
    public boolean isForcedVisible();

    public void setCulled(boolean value);
    public boolean isCulled();

    public void setOutOfCamera(boolean value);
    public boolean isOutOfCamera();

}