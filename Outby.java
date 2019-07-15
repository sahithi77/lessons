package com.example.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Sahithi.Yarrabothula
 */
@Entity
@Table(name="OutBy")
@Getter @Setter @ToString
public class Outby {
	@Id
	@SequenceGenerator(name="SEQ_OUTBY_ID")
	@Column(name="ID")
	private int id;


	@JoinColumn(name= "OUTID")
	@ManyToMany
	private Player player;
	
	@Column (name = "CAUGHT")
	private String caught;
	
	@Column (name = "BOWLED")
	private String bowled;
	
	@Column (name = "RUNOUT")
	private String runOut;
	
	@Column (name = "LBW")
	private  String LBW;
	
	@Column (name = "Stemp")
	private String stemp;
}
