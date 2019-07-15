package com.example.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Sahithi.Yarrabothula
 */
@Entity
@Table(name="Innings")
@Getter @Setter @ToString
public class Innings {
	@Id
	@SequenceGenerator(name="SEQ_INNINGS_ID")
	@Column(name="ID")
	private int id;

	@ManyToOne
	@JoinColumn
	private Team teamBat;
	
	@ManyToOne
	@JoinColumn
	private Team teamBowl;
	
	@Column(name ="SCORE")
	private int score;
	
	@Column(name ="OVERS")
	private float overs;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="BATSMANID")
	private List<Batsman> batsman;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="BOWLERID")
	private List<Bowler> bowler;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="FOW")
	private List<Fow> fallofwickets;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="EXTRASID")
	private List<Extras> extras;
}
