package com.alex.traveljournal.backend;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    @Autowired
    private EntryRepository entryRepository;

    @PostConstruct
    public void init() {
        if (entryRepository.count() == 0) {
            List<Entry> mockEntries = List.of(
                    new Entry(
                            "Kyoto",
                            "Japan",
                            "2024-04-10",
                            "2024-04-15",
                            "Beautiful temples and gardens",
                            "https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/kyoto1.jpg",
                            "https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/kyoto2.jpg",
                            "https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/kyoto3.jpg"
                    ),
                    new Entry(
                            "Barcelona",
                            "Spain",
                            "2024-05-01",
                            "2024-05-05",
                            "Great food and architecture",
                            "https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/barcelona1.jpg",
                            "https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/barcelona2.jpg",
                            "https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/barcelona3.jpg"
                    ),
                    new Entry(
                            "Paris",
                            "France",
                            "2024-06-01",
                            "2024-06-07",
                            "Romantic city with the Eiffel Tower",
                            "https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/paris1.jpg",
                            "https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/paris2.jpg",
                            "https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/paris3.jpg"
                    )
            );

            entryRepository.saveAll(mockEntries);
            System.out.println("Mock entries inserted.");
        } else {
            System.out.println("Database already contains entries. Skipping mock data.");
        }
    }
}
