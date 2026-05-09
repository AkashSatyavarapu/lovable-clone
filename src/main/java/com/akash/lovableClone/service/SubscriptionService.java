package com.akash.lovableClone.service;

import com.akash.lovableClone.dto.subscription.CheckoutRequest;
import com.akash.lovableClone.dto.subscription.CheckoutResponse;
import com.akash.lovableClone.dto.subscription.PortalResponse;
import com.akash.lovableClone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService
{

    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest checkoutRequest, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
