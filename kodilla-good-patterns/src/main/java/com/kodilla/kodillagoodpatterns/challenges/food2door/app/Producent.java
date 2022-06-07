package com.kodilla.kodillagoodpatterns.challenges.food2door.app;

import com.kodilla.kodillagoodpatterns.challenges.food2door.services.ProcessingService;

public class Producent {

    private String name;
    private ProcessingService processingService;

    public Producent(String name, ProcessingService processingService) {
        this.name = name;
        this.processingService = processingService;
    }

    public String getName() {
        return name;
    }

    public ProcessingService getProcessingService() {
        return processingService;
    }
}
