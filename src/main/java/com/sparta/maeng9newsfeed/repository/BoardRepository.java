package com.sparta.maeng9newsfeed.repository;

import com.sparta.maeng9newsfeed.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {


}
