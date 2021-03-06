package ca.mcgill.ecse321.petshelter.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.petshelter.model.Donation;

public interface DonationRepository extends CrudRepository<Donation, Integer> {

	Donation findByDonationId(int donationId);
	// List<Donation> findDonationsFromPerson(Person person);
	// List<Donation> findDonationsToPerson(Person person);

}
