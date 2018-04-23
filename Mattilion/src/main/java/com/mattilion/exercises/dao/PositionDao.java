package com.mattilion.exercises.dao;

import java.util.List;

import com.mattilion.exercises.dto.Position;

public interface PositionDao {

	/***
	 * 
	 * Returns the position by id
	 * 
	 * @param the id of the department
	 * @return
	 */
	Position findByPositionId(Long positionId);

	
	/***
	 * Returns all positions
	 * @return
	 */
	List<Position> getAll();
}
