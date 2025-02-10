package com.springcoreguide.blog.repository;

import com.springcoreguide.blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
