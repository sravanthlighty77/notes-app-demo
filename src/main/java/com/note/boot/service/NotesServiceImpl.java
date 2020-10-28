package com.note.boot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.note.boot.dto.NotesDTO;
import com.note.boot.entity.NotesEntity;
import com.note.boot.repository.NotesRepository;

@Service
public class NotesServiceImpl implements NotesService{
	
	@Autowired
	private NotesRepository notesRepository;

	@Override
	public List<NotesDTO> getAllNotes() {
		List<NotesEntity> notesEntityList = notesRepository.findAll();
		List<NotesDTO> notesDTOList = null;
		if(notesEntityList.size()!=0) {
			notesDTOList = new ArrayList<NotesDTO>();
			for(NotesEntity notesEntity : notesEntityList) {
				NotesDTO notesDTO = new NotesDTO();
				notesDTO.setId(notesEntity.getId());
				notesDTO.setDescription(notesEntity.getDescription());
				notesDTO.setTitle(notesEntity.getTitle());
				notesDTOList.add(notesDTO);
			}
		}
		return notesDTOList;
	}

	@Override
	public void deleteANotesById(Integer id) {
		notesRepository.deleteById(id);
		
	}

	@Override
	public NotesDTO updateNotesById() {
		// TODO Auto-generated method stub
		return null;
	}

}
