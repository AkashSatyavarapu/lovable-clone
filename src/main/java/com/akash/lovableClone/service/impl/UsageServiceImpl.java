package com.akash.lovableClone.service.impl;

import com.akash.lovableClone.dto.subscription.PlanLimitsResponse;
import com.akash.lovableClone.dto.subscription.UsageTodayResponse;
import com.akash.lovableClone.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService
{
    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
