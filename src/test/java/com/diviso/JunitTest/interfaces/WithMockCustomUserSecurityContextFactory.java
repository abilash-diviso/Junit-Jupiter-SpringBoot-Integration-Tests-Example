//package com.diviso.JunitTest.interfaces;
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.test.context.support.WithSecurityContextFactory;
//
//public class WithMockCustomUserSecurityContextFactory implements WithSecurityContextFactory<WithMockCustomUser> {
//
//	@Override
//	public SecurityContext createSecurityContext(WithMockCustomUser customUser) {
//
//		 SecurityContext context = SecurityContextHolder.createEmptyContext();
//
//	        CustomUserDetails principal =
//	            new CustomUserDetails(customUser.name(), customUser.username());
//	        Authentication auth =
//	            new UsernamePasswordAuthenticationToken(principal, "password", principal.getAuthorities());
//	        context.setAuthentication(auth);
//	        return context;
//	}
//
//}
