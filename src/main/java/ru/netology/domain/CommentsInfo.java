package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canOpen;
    private boolean canClose;
    private boolean canPost;
    private boolean canEdit;
    private boolean canDelete;

    public int getCount() {
        return count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

}
