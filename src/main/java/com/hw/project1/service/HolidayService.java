package com.hw.project1.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.hw.project1.entity.TaiwanSchedule;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class HolidayService {
    private List<TaiwanSchedule> holidays;
    private final ObjectMapper objectMapper = new ObjectMapper();
    public HolidayService() {
        loadHolidayData();
    }

    private void loadHolidayData() {
        RestTemplate restTemplate = new RestTemplate();
        int tmp = LocalDate.now().getYear();
        String HOLIDAY_API_URL = "https://cdn.jsdelivr.net/gh/ruyut/TaiwanCalendar/data/"+tmp+".json";
        String json = restTemplate.getForObject(HOLIDAY_API_URL, String.class);

        try {
            holidays = objectMapper.readValue(json, new TypeReference<List<TaiwanSchedule>>() {});
        } catch (IOException e) {
            System.out.println("e.getMessage()");
            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
            System.out.println("e.getMessage()");
            e.printStackTrace();
            throw new RuntimeException("Failed to load holiday data");
        }
    }
    public boolean isTodayHoliday() {
        LocalDate today = LocalDate.now();
        String todayStr = today.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        return holidays.stream()
                .anyMatch(holiday -> holiday.isHoliday() && holiday.getDate().equals(todayStr));
    }
}

