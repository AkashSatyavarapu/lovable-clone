package com.akash.lovableClone.service;

import com.akash.lovableClone.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService
{

    List<PlanResponse> getAllActivePlans();
}
