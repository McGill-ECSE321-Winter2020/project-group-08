package ca.mcgill.ecse321.petshelter.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;

public enum Status {
	PENDING, APPROVED, DENIED;
}
