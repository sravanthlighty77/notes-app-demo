package com.note.boot.service;

import java.util.List;

import com.note.boot.dto.NotesDTO;

public interface NotesService {
	
	List<NotesDTO> getAllNotes();
	void deleteANotesById(Integer id);
	NotesDTO updateNotesById();

}
