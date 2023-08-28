package com.cisco.noteapp.controller;

import com.cisco.noteapp.entity.Note;
import com.cisco.noteapp.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public List<String> findAll() { // Change here
        return noteService.findAll();
    }

    @GetMapping("/{id}")
    public Note findById(@PathVariable Long id) {
        return noteService.findById(id).orElse(null);
    }

    @PostMapping
    public Note addNote(@RequestBody Note note) {
        return noteService.save(note);
    }

    @PutMapping
    public Note updateNote(@RequestBody Note note) {
        return noteService.save(note);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteById(id);
    }
}
