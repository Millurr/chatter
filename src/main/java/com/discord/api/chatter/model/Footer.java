package com.discord.api.chatter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Footer {
    private String text;
    @JsonProperty("icon_url")
    private String iconUrl;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public String toString() {
        return "Footer [text=" + text + ", iconUrl=" + iconUrl + "]";
    }

}
