package com.hannan.eventmanagement.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Venue extends AbstractEntity {

	private String name;
	private String streetAddress;
	private String streetAddress2;
	private String city;
	private String state;
	private String country;
	private String postalCode;

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Venue) obj).id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
