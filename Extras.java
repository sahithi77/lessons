package com.example.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Sahithi.Yarrabothula
 */
@Entity
@Table(name="EXTRAS")
@Getter @Setter @ToString
public class Extras {

	@Id
	@SequenceGenerator(name="SEQ_EXTRAS_ID")
	@Column(name="ID")
	private int id;
	
	@Column(name = "NOBALLS")
	private int noBalls;
	
	@Column(name = "LEGBY")
	private int legBy;
	
	@Column(name = "WIDE")
	private int wide;
	
	@Column(name = "Byes")
	private int byes;
	
	@Column(name = "PENALITY")
	private int penality;
}
