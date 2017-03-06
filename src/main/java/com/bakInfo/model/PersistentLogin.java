package com.bakInfo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.domain.Persistable;
/**
 * 
 * @author amahmoudi
 *
 */
@Entity
@Table(name="PERSISTENT_LOGINS")
public class PersistentLogin implements Persistable<Integer>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	
	@Column(name="series", unique=true, nullable=false)
	private String series;

	@Column(name="USERNAME", unique=true, nullable=false)
	private String username;
	
	@Column(name="TOKEN", unique=true, nullable=false)
	private String token;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date last_used;

	
	public PersistentLogin() {
		super();
	}

	
	public PersistentLogin(Integer id, String series, String username, String token, Date last_used) {
		super();
		this.id = id;
		this.series = series;
		this.username = username;
		this.token = token;
		this.last_used = last_used;
	}


	public PersistentLogin(String series, String username, String token, Date last_used) {
		super();
		this.series = series;
		this.username = username;
		this.token = token;
		this.last_used = last_used;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getLast_used() {
		return last_used;
	}

	public void setLast_used(Date last_used) {
		this.last_used = last_used;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public boolean isNew() {
		return id==null;
	}
	
	
}
