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
@Table(name="FOW")
@Getter @Setter @ToString
public class Fow {
	@Id
	@SequenceGenerator(name="SEQ_FOW_ID")
	@Column(name="ID")
	private int id;
	
	
	@Column (name =" RUNAT")
	private int runAt;
	
	@Column (name ="WICKETAT")
	private int wicketAt;
	
	@ManyToOne
	@JoinColumn(name="PLAYER")
	private Player player;

}
