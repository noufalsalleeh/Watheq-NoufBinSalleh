package com.Watheq.Watheq.mapper;

import com.Watheq.Watheq.dto.LanguageDTO;
import com.Watheq.Watheq.model.Language;

public interface LanguageMapper {
	Language dtoToDomain(final LanguageDTO language );

	LanguageDTO domainToDto(final Language language );
}
