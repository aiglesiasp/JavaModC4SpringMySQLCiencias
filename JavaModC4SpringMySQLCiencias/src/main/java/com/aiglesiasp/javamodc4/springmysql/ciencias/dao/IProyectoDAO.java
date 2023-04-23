/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.ciencias.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Proyecto;

/**
 * @author aitor
 *
 */
public interface IProyectoDAO extends JpaRepository<Proyecto, Integer> {

}
