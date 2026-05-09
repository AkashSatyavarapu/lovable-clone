package com.akash.lovableClone.service.impl;

import com.akash.lovableClone.dto.subscription.CheckoutRequest;
import com.akash.lovableClone.dto.subscription.CheckoutResponse;
import com.akash.lovableClone.dto.subscription.PortalResponse;
import com.akash.lovableClone.dto.subscription.SubscriptionResponse;
import com.akash.lovableClone.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService
{

    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest checkoutRequest, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
