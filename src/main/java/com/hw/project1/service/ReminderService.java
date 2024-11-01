package com.hw.project1.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class ReminderService {

    private final HolidayService holidayService;
    private final TelegramBotService telegramBotService;

    public ReminderService(HolidayService holidayService, TelegramBotService telegramBotService) {
        this.holidayService = holidayService;
        this.telegramBotService = telegramBotService;
    }

    @Scheduled(cron = "0 0 9 * * *")
    public void sendDailyReminder() {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        if (!holidayService.isTodayHoliday() && dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY) {
            telegramBotService.sendReminder("早安！請記得打卡！");
        }
    }}
