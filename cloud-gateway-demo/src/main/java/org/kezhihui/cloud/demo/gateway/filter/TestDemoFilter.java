package org.kezhihui.cloud.demo.gateway.filter;

import reactor.core.publisher.Mono;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.RequestPath;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

/**
 *@author kezhihui
 *@createTime 2025/08/06 16:07
 */
@Component
public class TestDemoFilter implements GlobalFilter {
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		RequestPath path = exchange.getRequest().getPath();
		return chain.filter(exchange);
	}
}
