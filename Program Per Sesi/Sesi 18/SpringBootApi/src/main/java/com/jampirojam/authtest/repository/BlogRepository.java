package com.jampirojam.authtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jampirojam.authtest.model.Blog;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
	List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
}
