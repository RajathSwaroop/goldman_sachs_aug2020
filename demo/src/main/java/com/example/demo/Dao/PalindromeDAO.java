package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.StringInfo;

@Repository
public interface PalindromeDAO extends CrudRepository<StringInfo,String>{

}
