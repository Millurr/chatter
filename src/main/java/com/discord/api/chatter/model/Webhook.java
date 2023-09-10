package com.discord.api.chatter.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Webhook {
    private String username;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    private String content;
    private List<Embeds> embeds;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Embeds> getEmbeds() {
        return embeds;
    }

    public void setEmbeds(List<Embeds> embeds) {
        this.embeds = embeds;
    }

    @Override
    public String toString() {
        return "Webhook [username=" + username + ", avatarUrl=" + avatarUrl + ", content=" + content + ", embeds="
                + embeds + "]";
    }
}
