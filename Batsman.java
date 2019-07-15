package com.example.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Sahithi.Yarrabothula
 */
@Entity
@Table(name="BATS")
@Getter @Setter @ToString
public class Batsman {

	@Id
	@SequenceGenerator(name="SEQ_BATSMAN_ID")
	@Column(name="ID")
	private int id;
	

	@JoinColumn(name= "BA_ID")
	@ManyToOne
	private Player player;
	
	@Column(name = "RUNS")
	private int runs;
	
	@Column(name = "BALLS")
	private int balls;
	
	@Column(name = "FOURS")
	private int fours;
	
	@Column(name = "SIXES")
	private int sixes;
	

	
}
