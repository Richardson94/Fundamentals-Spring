package com.codigofacilito.movies.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "movies")
public class Movie implements Serializable {

	private static final long serialVersionUID = -711179333845973321L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@Column(name = "release_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date releaseDate;
	
	@OneToOne
	private Gender gender;
	
	@ManyToMany
	private List<Actor> protagonist;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Actor> getProtagonist() {
		return protagonist;
	}

	public void setProtagonist(List<Actor> protagonist) {
		this.protagonist = protagonist;
	}

}
