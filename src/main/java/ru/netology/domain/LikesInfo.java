package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean canLike;
    private boolean canDislike;

    public int getCount() {
        return count;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public boolean isCanDislike() {
        return canDislike;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setCanDislike(boolean canDislike) {
        this.canDislike = canDislike;
    }

}
