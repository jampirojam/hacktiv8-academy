package id.ojam.javaproject.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class ScheduleRequest {

	@NotBlank
	private String tripDate;

	@NotNull
	private int availableSeats;

	private Long tripDetail;
}
