package com.argos.authserver.giftCardAuthServer.config;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.TokenRequest;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;

import com.argos.authserver.giftCardAuthServer.services.CustomUserDetailsService;

public class CustomOauth2RequestFactory extends DefaultOAuth2RequestFactory {

     
	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	public CustomOauth2RequestFactory(ClientDetailsService clientDetailsService) {
		super(clientDetailsService);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TokenRequest createTokenRequest(Map<String, String> requestParameters, ClientDetails authenticatedClient) {
		/*
		 * if (requestParameters.get("grant_type").equals("refresh_token")) {
		 * OAuth2Authentication authentication =
		 * tokenStore.readAuthenticationForRefreshToken(
		 * tokenStore.readRefreshToken(requestParameters.get("refresh_token")));
		 * SecurityContextHolder.getContext() .setAuthentication(new
		 * UsernamePasswordAuthenticationToken(authentication.getName(), null,
		 * customUserDetailsService.loadUserByUsername(authentication.getName())
		 * .getAuthorities())); }
		 */

		if (requestParameters.get("grant_type").equals("password")) {
			
			
			
			
			
			
			/*System.out.println("hello");

			Collection<GrantedAuthority> authorities = authenticatedClient.getAuthorities();
			
			authorities.add(new SimpleGrantedAuthority("role_admin"));
			authorities.add(new SimpleGrantedAuthority("role_user"));

			UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
					null, null, authorities);

			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
*/
		}

		return super.createTokenRequest(requestParameters, authenticatedClient);

	}

}
