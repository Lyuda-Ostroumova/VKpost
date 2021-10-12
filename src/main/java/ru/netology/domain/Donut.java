package ru.netology.domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private boolean canPublishFreeCopy;
    private String editMode;

    public boolean isDonut() {
        return isDonut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

}
