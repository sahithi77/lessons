package com.example.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Sahithi.Yarrabothula
 *
 */
@Entity
 @Table(name="SCORECARD")
 @Getter @Setter @ToString
public class Scorecard {
	@Id
	@SequenceGenerator(name="SEQ_SCORECARD_ID")
	@Column(name="ID")
	private int id;

		
	@JoinColumn(name = "MATCH_ID")
	@OneToOne
	private Match match;
	
	@JoinColumn(name= "INNINGS_ID")
	@OneToOne
	private Innings innings1;
	
	@JoinColumn(name= "INNINGS_ID")
	@OneToOne
	private Innings innings2;
	
}
