package com.discord.api.chatter.model;

public class Thumbnail {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Thumbnail [url=" + url + "]";
    }
    
}
