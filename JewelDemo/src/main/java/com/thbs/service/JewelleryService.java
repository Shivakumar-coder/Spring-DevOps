package com.thbs.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thbs.entity.Jewels;
import com.thbs.repository.JewelRepository;

@Service
@Transactional
public class JewelleryService {

	@Autowired
	private JewelRepository jewelRepo;
	
	public List<Jewels> allJewels ()
	{
		
		return jewelRepo.findAll();
	}
	
}
