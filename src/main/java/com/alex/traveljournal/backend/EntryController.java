package com.alex.traveljournal.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entries")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5173"}) // add Vercel domain later
public class EntryController {

    @Autowired
    private EntryRepository entryRepository;

    // GET all entries
    @GetMapping
    public List<Entry> getAllEntries() {
        return entryRepository.findAll();
    }

    // GET entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<Entry> getEntryById(@PathVariable Long id) {
        return entryRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST new entry
    @PostMapping
    public Entry createEntry(@RequestBody Entry newEntry) {
        // Add 3 static placeholder images
        newEntry.setImageUrl1("https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/placeholder1.jpg");
        newEntry.setImageUrl2("https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/placeholder2.jpg");
        newEntry.setImageUrl3("https://raw.githubusercontent.com/rauschen84/my-travel-journal/main/public/images/placeholder3.jpg");

        return entryRepository.save(newEntry);
    }

    // PUT update entry
    @PutMapping("/{id}")
    public ResponseEntity<Entry> updateEntry(@PathVariable Long id, @RequestBody Entry updatedEntry) {
        return entryRepository.findById(id)
                .map(existingEntry -> {
                    updatedEntry.setId(id); // Ensure ID remains unchanged
                    return ResponseEntity.ok(entryRepository.save(updatedEntry));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE entry
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntry(@PathVariable Long id) {
        if (entryRepository.existsById(id)) {
            entryRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
