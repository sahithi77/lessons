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
@Table(name="BOWLER")
@Getter @Setter @ToString
public class Bowler {

	@Id
	@SequenceGenerator(name="SEQ_BOWLER_ID")
	@Column(name="ID")
	private int id;
	
	@JoinColumn(name= "BO_ID")
	@ManyToOne
	private Player player;
	
	@Column(name = "OVERS")
	private float overs;
	
	@Column(name ="MADIEN")
	private int maidien;
	
	@Column(name = " RUNS")
	private int runs;
	
	@Column(name = "WICKETS")
	private int wickets;
	
	@Column(name = "NOBALL")
	private int noBall;
	
	@Column(name = "WIDE")
	private int wide;
	
	
}
