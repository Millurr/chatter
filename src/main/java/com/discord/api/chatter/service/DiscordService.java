package com.discord.api.chatter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.discord.api.chatter.model.Webhook;

@Service
public class DiscordService {
    
    @Value("${discord.webhook.url}")
    private String dsWebHookUrl;

    @Autowired
    private RestTemplate restTemplate;

    public void sendDiscordMessage(Webhook webhook) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Webhook> request = new HttpEntity<Webhook>(webhook, headers);
        restTemplate.postForEntity(dsWebHookUrl, request, Webhook.class);
    }
}
