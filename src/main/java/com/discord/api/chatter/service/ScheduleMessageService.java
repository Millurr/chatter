package com.discord.api.chatter.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.discord.api.chatter.model.Webhook;

@Service
public class ScheduleMessageService {

    @Value("${discord.scheduled.message}")
    private String messageToSend;
    
    @Autowired
    private DiscordService discordService;

    // cron = "second minute hour <day of month> month day(0-7)"
    // "0 0 12 * * 2" = Wednesday's at 12pm
    @Scheduled(cron = "0 0 12 * * 2")
    public void sendMessageOnSchedule() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Webhook webhook = new Webhook();
        webhook.setContent(messageToSend);
        System.out.println("Scheduled message sent at " + timestamp);
        discordService.sendDiscordMessage(webhook);
    }

}
