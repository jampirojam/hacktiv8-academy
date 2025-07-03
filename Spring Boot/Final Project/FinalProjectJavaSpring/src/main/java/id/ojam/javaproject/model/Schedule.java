package id.ojam.javaproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "schedule")
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trip_id")
	private Trip tripDetail;

	@OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
	private Set<Ticket> ticketsSold;

	@NotBlank
	private String tripDate;

	@NonNull
	private int availableSeats;

	public Schedule(String tripDate, int availableSeats, Trip tripDetail) {
		this.tripDate = tripDate;
		this.availableSeats = availableSeats;
		this.tripDetail = tripDetail;
	}
}
