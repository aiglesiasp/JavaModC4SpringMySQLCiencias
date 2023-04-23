package com.aiglesiasp.javamodc4.springmysql.ciencias.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Asignado;

public interface IAsignadoDAO extends JpaRepository<Asignado, Integer> {

}
