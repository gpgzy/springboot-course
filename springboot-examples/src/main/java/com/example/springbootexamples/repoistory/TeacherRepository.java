package com.example.springbootexamples.repoistory;

import com.example.springbootexamples.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher, Integer> {
}
