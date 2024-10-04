package xyz.cuddlecloud.api.proxy.server;

import com.velocitypowered.api.proxy.server.ServerPing.Version;

import xyz.cuddlecloud.api.annotation.Inject;

public final class ServerPing {

	@Inject(target = "com.velocitypowered.api.proxy.server.ServerPing#class.Builder")
	public static final Version VERSION = new Version(767, "CuddleCloud Proxy");
	
}
