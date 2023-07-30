package com.zkx.spring6httpinterface.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChuckNorrisVO {
    private String value;
    private String url;
    private String id;
    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;

    @Override
    public String toString() {
        return "ChuckNorrisVO{" +
                "value='" + value + '\'' +
                ", url='" + url + '\'' +
                ", id='" + id + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
