package com.Watheq.Watheq.mapperTest;

import org.junit.Assert;
import org.junit.Test;

import com.Watheq.Watheq.dto.IndividualDTO;
import com.Watheq.Watheq.mapperImp.IndividualMapperImp;
import com.Watheq.Watheq.model.Individual;

public class IndividualMapperTest {
	private static final IndividualMapperImp individualMapper = new IndividualMapperImp();


	@Test
	public void IndividualMapper_domainToDto() {
		final IndividualDTO source =new IndividualDTO();

		source.setNationalId("W");
		source.setFirstName("W");
		source.setMiddleName("W");
		source.setLastName("W");
		source.setGender("W");
		source.setStatus("W");
		source.setSkill("W");
		source.setDateOfBirth(null);
		source.setAttachment("W");

		final Individual target = individualMapper.dtoToDomain(source);

		Assert.assertNotNull(target);
		Assert.assertEquals("W", target.getNationalId());
		Assert.assertEquals("W", target.getFirstName());
		Assert.assertEquals("W", target.getMiddleName());
		Assert.assertEquals("W", target.getLastName());
		Assert.assertEquals("W", target.getGender());
		Assert.assertEquals("W", target.getStatus());
		Assert.assertEquals("W", target.getSkill());
		Assert.assertEquals(null, target.getDateOfBirth());
		Assert.assertEquals("W", target.getAttachment());


	}//end IndividualMapper_domainToDto()


	@Test
	public void IndividualMapper_dtoToDomain() {
		final Individual source =new Individual();

		source.setNationalId("W");
		source.setFirstName("W");
		source.setMiddleName("W");
		source.setLastName("W");
		source.setGender("W");
		source.setStatus("W");
		source.setSkill("W");
		source.setDateOfBirth(null);
		source.setAttachment("W");

		final IndividualDTO target = individualMapper.domainToDto(source);

		Assert.assertNotNull(target);
		Assert.assertEquals("W", target.getNationalId());
		Assert.assertEquals("W", target.getFirstName());
		Assert.assertEquals("W", target.getMiddleName());
		Assert.assertEquals("W", target.getLastName());
		Assert.assertEquals("W", target.getGender());
		Assert.assertEquals("W", target.getStatus());
		Assert.assertEquals("W", target.getSkill());
		Assert.assertEquals(null, target.getDateOfBirth());
		Assert.assertEquals("W", target.getAttachment());

	}//end IndividualMapper_dtoToDomain()
	

}//end class 
