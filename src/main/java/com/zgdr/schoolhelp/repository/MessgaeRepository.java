package com.zgdr.schoolhelp.repository;

import com.zgdr.schoolhelp.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * MessgaeRepository
 *
 * @author 星夜、痕
 * @version 1.0
 * @since 2019/4/28
 **/
public interface MessgaeRepository extends JpaRepository<Message,Integer> {

}