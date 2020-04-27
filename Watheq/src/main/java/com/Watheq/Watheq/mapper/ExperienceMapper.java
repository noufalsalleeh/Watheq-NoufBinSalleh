package com.Watheq.Watheq.mapper;

import com.Watheq.Watheq.dto.ExperienceDTO;
import com.Watheq.Watheq.model.Experience;

public interface ExperienceMapper {
	Experience dtoToDomain(final ExperienceDTO experience );

	ExperienceDTO domainToDto(final Experience experience );
}
