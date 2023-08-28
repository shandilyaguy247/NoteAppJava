package com.cisco.noteapp.service;

import com.cisco.noteapp.entity.Note;

import java.util.List;
import java.util.Optional;

public interface NoteService {
    List<String> findAll();
    Optional<Note> findById(Long id);
    Note save(Note note);
    void deleteById(Long id);
}
