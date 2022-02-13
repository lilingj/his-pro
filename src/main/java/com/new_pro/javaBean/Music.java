package com.new_pro.javaBean;

public class Music {
    private Integer id;

    private String musicname;

    private String musiccategoryid;

    private String musicsinger;

    private Integer delmark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname == null ? null : musicname.trim();
    }

    public String getMusiccategoryid() {
        return musiccategoryid;
    }

    public void setMusiccategoryid(String musiccategoryid) {
        this.musiccategoryid = musiccategoryid == null ? null : musiccategoryid.trim();
    }

    public String getMusicsinger() {
        return musicsinger;
    }

    public void setMusicsinger(String musicsinger) {
        this.musicsinger = musicsinger == null ? null : musicsinger.trim();
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", musicname='" + musicname + '\'' +
                ", musiccategoryid='" + musiccategoryid + '\'' +
                ", musicsinger='" + musicsinger + '\'' +
                ", delmark=" + delmark +
                '}';
    }
}