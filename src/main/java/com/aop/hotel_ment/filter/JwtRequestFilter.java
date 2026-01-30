package com.aop.hotel_ment.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.aop.hotel_ment.service.auth.JwtService;

import io.jsonwebtoken.Claims;

import java.io.IOException;
import java.util.List;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    private final JwtService jwtUtil;

    public JwtRequestFilter(JwtService jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
    private static final List<String> EXCLUDED_PATHS =
            List.of(
                "/hotel",
                "/login"
            );

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        String path = request.getServletPath();
        return EXCLUDED_PATHS.contains(path);
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);

            Claims hotelId = jwtUtil.getClaims(token);

            // Store hotelId for this request
            request.setAttribute("hotelUniqueNo", hotelId);
        }

        filterChain.doFilter(request, response);
    }
}
