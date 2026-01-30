package com.aop.hotel_ment.service.auth;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.aop.hotel_ment.model.HotelDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;


@Service
public class JwtService {
	private static final String SECRET = "very_secret_key_123";
	
	public String generateToken(HotelDetails hotelDetails) {
		return Jwts.builder()
                .setSubject(hotelDetails.getOwnerNumber())
                .claim("hotelUniqueNo", hotelDetails.getUniqueNumber())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 day
                .signWith(Keys.hmacShaKeyFor(SECRET.getBytes()), SignatureAlgorithm.HS256)
                .compact();
	}
	
	public Claims getClaims(String token) {
		return Jwts.parserBuilder().
				setSigningKey(SECRET.getBytes()).
				build().
				parseClaimsJws(token).getBody();
	}
	public String extractHotelId(String token) {
        return getClaims(token).get("hotelUniqueNo", String.class);
    }

}
