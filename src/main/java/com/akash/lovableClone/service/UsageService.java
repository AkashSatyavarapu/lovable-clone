package com.akash.lovableClone.service;

import com.akash.lovableClone.dto.subscription.PlanLimitsResponse;
import com.akash.lovableClone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService
{

    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
