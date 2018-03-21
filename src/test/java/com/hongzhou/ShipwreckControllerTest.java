package com.hongzhou;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hongzhou.controller.ShipwreckController;
import com.hongzhou.model.Shipwreck;
import com.hongzhou.repository.ShipwreckRepository;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ShipwreckControllerTest {
	
	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet() {
		//ShipwreckController sc = new ShipwreckController();
		//Shipwreck wreck = sc.get(1L);
		
		Shipwreck sw = new Shipwreck();
		sw.setId(1L);
		when(shipwreckRepository.findOne(1L)).thenReturn(sw);
		
		Shipwreck wreck = sc.get(1L);
		
		verify(shipwreckRepository).findOne(1L);
		
		//assertEquals(1L, wreck.getId().longValue());
		assertThat(wreck.getId(), is(1L));
	}

}
