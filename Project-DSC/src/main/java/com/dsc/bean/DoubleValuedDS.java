package com.dsc.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Stitch")
public class DoubleValuedDS {
	@Getter
	@Setter
	@Column(name = "Stitch_Type")
	@Id
	private String key;
	@Getter
	@Setter
	@Column(name = "Durability")
	private Integer value;
	@Override
	public String toString() {
		return "DoubleValuedDS [key=" + key + ", value=" + value + "]";
	}
}