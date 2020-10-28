package com.note.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.note.boot.entity.NotesEntity; 

/**
 * 
 * @author sravanth kumar kurra
 *
 */
public interface NotesRepository extends  JpaRepository<NotesEntity, Integer> {

}
