package com.akash.lovableClone.service.impl;

import com.akash.lovableClone.dto.subscription.PlanResponse;
import com.akash.lovableClone.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService
{

    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
