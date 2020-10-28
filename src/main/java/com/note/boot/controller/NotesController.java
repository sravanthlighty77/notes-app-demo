package com.note.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.note.boot.dto.NotesDTO;
import com.note.boot.service.NotesService;

@RestController
@RequestMapping("/notes")
public class NotesController {
	
	@Autowired
	private NotesService notesService;
	
	@GetMapping("/getAll")
	public List<NotesDTO> getAllNotes(){
		List<NotesDTO> notesList = notesService.getAllNotes();
		return notesList;
	}

}
