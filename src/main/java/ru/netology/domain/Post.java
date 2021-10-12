package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private CopyRight copyRight;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavourite;
    private Donut donut;
    private int postponedId;

    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public int getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public CopyRight getCopyRight() {
        return copyRight;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public String getPostType() {
        return postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public Donut getDonut() {
        return donut;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setCopyRight(CopyRight copyRight) {
        this.copyRight = copyRight;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

}


