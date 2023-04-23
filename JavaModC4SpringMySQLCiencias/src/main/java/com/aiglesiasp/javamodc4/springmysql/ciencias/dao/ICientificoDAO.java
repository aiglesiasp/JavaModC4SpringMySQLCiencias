/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.ciencias.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Cientifico;

/**
 * @author aitor
 *
 */
public interface ICientificoDAO extends JpaRepository<Cientifico, Integer> {

}
