package com.new_pro.javaBean;

public class T_music {
    private String muId;

    private String muName;

    private String muStyle;

    private String muLabels;

    private String muAuthor;

    private String muCountry;

    private Integer muDate;

    private Integer muState;

    private String muEditor;

    private String muXml;

    public String getMuId() {
        return muId;
    }

    public void setMuId(String muId) {
        this.muId = muId == null ? null : muId.trim();
    }

    public String getMuName() {
        return muName;
    }

    public void setMuName(String muName) {
        this.muName = muName == null ? null : muName.trim();
    }

    public String getMuStyle() {
        return muStyle;
    }

    public void setMuStyle(String muStyle) {
        this.muStyle = muStyle == null ? null : muStyle.trim();
    }

    public String getMuLabels() {
        return muLabels;
    }

    public void setMuLabels(String muLabels) {
        this.muLabels = muLabels == null ? null : muLabels.trim();
    }

    public String getMuAuthor() {
        return muAuthor;
    }

    public void setMuAuthor(String muAuthor) {
        this.muAuthor = muAuthor == null ? null : muAuthor.trim();
    }

    public String getMuCountry() {
        return muCountry;
    }

    public void setMuCountry(String muCountry) {
        this.muCountry = muCountry == null ? null : muCountry.trim();
    }

    public Integer getMuDate() {
        return muDate;
    }

    public void setMuDate(Integer muDate) {
        this.muDate = muDate;
    }

    public Integer getMuState() {
        return muState;
    }

    public void setMuState(Integer muState) {
        this.muState = muState;
    }

    public String getMuEditor() {
        return muEditor;
    }

    public void setMuEditor(String muEditor) {
        this.muEditor = muEditor == null ? null : muEditor.trim();
    }

    public String getMuXml() {
        return muXml;
    }

    public void setMuXml(String muXml) {
        this.muXml = muXml == null ? null : muXml.trim();
    }
}