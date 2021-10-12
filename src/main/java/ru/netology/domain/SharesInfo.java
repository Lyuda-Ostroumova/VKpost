package ru.netology.domain;

public class SharesInfo {
    private int count;
    private boolean canShare;

    public int getCount() {
        return count;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }
}
